package multithreading.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import multithreading.domain.checkout.Cart;
import multithreading.domain.checkout.CheckoutResponse;
import multithreading.domain.checkout.CheckoutStatus;
import multithreading.util.DataSet;

class CheckoutServiceTest {

	PriceValidatorService priceValidatorService = new PriceValidatorService();
	CheckoutService checkOutService = new CheckoutService(priceValidatorService);

	@Test
	void test() {

		System.out.println("Cores : " + Runtime.getRuntime().availableProcessors());
		System.out.println("maxMemory : " + Runtime.getRuntime().maxMemory());
		System.out.println("totalMemory : " + Runtime.getRuntime().totalMemory());
		System.out.println("Cores : " + Runtime.getRuntime());

		Cart cart = DataSet.createCart(6);
		CheckoutResponse checkoutResponse = checkOutService.checkout(cart);
		assertEquals(CheckoutStatus.SUCCESS, checkoutResponse.getCheckoutStatus());
	}
}
