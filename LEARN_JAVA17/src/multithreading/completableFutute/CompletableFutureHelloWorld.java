package multithreading.completableFutute;

import static multithreading.util.LoggerUtil.log;
import static multithreading.util.CommonUtil.delay;
import java.util.concurrent.CompletableFuture;

import multithreading.service.HelloWorldService;

public class CompletableFutureHelloWorld {

	HelloWorldService hws = new HelloWorldService();

	public CompletableFutureHelloWorld(HelloWorldService hws) {
		super();
		this.hws = hws;
	}

	public CompletableFuture<String> helloWorld() {

		return CompletableFuture.supplyAsync(() -> hws.helloWorld())
				// .thenApply((result) -> result.toUpperCase())
				.thenApply(String::toUpperCase);
		// .join();
	}

	public static void main(String[] args) {

		log("Done");

		delay(2000);
	}

	public String helloworld_multiple_async_calls() {
		CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
		CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());
		return hello.thenCombine(world, (h, w) -> h + w).thenApply(String::toUpperCase).join();

	}

	public String helloworld_three_async_calls() {
		CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
		CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());
		CompletableFuture<String> thirdFuture = CompletableFuture.supplyAsync(() -> {
			delay(1000);
			return "Hi CompletableFuture";
		});
		return hello.thenCombine(world, (h, w) -> h + w).thenCombine(thirdFuture, (prev, curt) -> prev + curt)
				.thenApply(String::toUpperCase).join();
	}

	public CompletableFuture<String> helloWorldThenCompose() {

		return CompletableFuture.supplyAsync(hws::hello).thenCompose((previouse) -> hws.worldFuture(previouse))
				.thenApply(String::toUpperCase);
	}
}
