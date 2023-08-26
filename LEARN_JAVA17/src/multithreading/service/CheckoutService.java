package multithreading.service;
import static multithreading.util.CommonUtil.stopWatch;

import java.util.List;
import java.util.stream.Collectors;

import multithreading.domain.checkout.Cart;
import multithreading.domain.checkout.CartItem;
import multithreading.domain.checkout.CheckoutResponse;
import multithreading.domain.checkout.CheckoutStatus;

public class CheckoutService {

	PriceValidatorService pService;

	public CheckoutService(PriceValidatorService pService) {
		this.pService = pService;
	}

	public CheckoutResponse checkout(Cart cart) {
		stopWatch.start();
		List<CartItem> prcList = cart.getCartItemList().parallelStream().map(cartIterm -> {
			boolean isPriceInvalid = pService.isCartItemInvalid(cartIterm);
			cartIterm.setExpired(isPriceInvalid);
			return cartIterm;
		}).filter(CartItem::isExpired).collect(Collectors.toList());
		if (prcList.size() > 0) {
			return new CheckoutResponse(CheckoutStatus.FAILURE, prcList);
		}
		
		
		stopWatch.stop();
		double finalPrice=calculateFinalPrice(cart);
		double finalPrice2 = calculateFinalPrice_reduce(cart);
		System.out.println("Final -1- "+finalPrice);
		System.out.println("Final -2- "+finalPrice2);
		System.out.println(stopWatch.getTime());
		return new CheckoutResponse(CheckoutStatus.SUCCESS);
	}

	private double calculateFinalPrice(Cart cart) {
		return cart.getCartItemList()
                .parallelStream()
                .map(cartItem -> cartItem.getQuantity() * cartItem.getRate())
                .mapToDouble(Double::doubleValue)
                .sum();
	}
	private double calculateFinalPrice_reduce(Cart cart) {

        return cart.getCartItemList()
                .parallelStream()
                .map(cartItem -> cartItem.getQuantity() * cartItem.getRate())
                .reduce(0.0, Double::sum);
    }

}
