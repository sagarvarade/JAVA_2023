package multithreading.completableFutute;

import java.util.concurrent.CompletableFuture;

import multithreading.service.HelloWorldService;
import static multithreading.util.CommonUtil.delay;
import static multithreading.util.LoggerUtil.log;
public class CompletableFutureHelloWorldException {

	private HelloWorldService hws;

	public CompletableFutureHelloWorldException(HelloWorldService hws) {
		super();
		this.hws = hws;
	}
	
	
	public String helloworld_three_async_calls_handle() {
		CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
		CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());
		CompletableFuture<String> thirdFuture = CompletableFuture.supplyAsync(() -> {
			delay(1000);
			return "Hi CompletableFuture";
		});
		return hello
				.handle((res,e)->{
					log("Exception : "+e.getMessage());
					return "";
				})
				.thenCombine(world, (h, w) -> h + w)
				.thenCombine(thirdFuture, (prev, curt) -> prev + curt)
				.thenApply(String::toUpperCase).join();
	}
	
}
