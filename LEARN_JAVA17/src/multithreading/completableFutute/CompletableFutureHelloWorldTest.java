package multithreading.completableFutute;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

import multithreading.service.HelloWorldService;

class CompletableFutureHelloWorldTest {

	HelloWorldService hws=new HelloWorldService();
	CompletableFutureHelloWorld cfhw=new CompletableFutureHelloWorld(hws);
	@Test
	void testHelloWorld() {
		CompletableFuture<String> helloWorld = cfhw.helloWorld();
		helloWorld.thenAccept(s->{
			assertEquals("HELLO WORLD", s);
		})
		.join();
	}

	@Test
	void testCompletableHw()
	{
		assertEquals("HELLO WORLD!", cfhw.helloworld_multiple_async_calls());
	}
	
	@Test
	void testCompletableThreeHw()
	{
		assertEquals("HELLO WORLD!HI COMPLETABLEFUTURE", cfhw.helloworld_three_async_calls());
	}
	
	@Test
	void testHelloWorld_Then_Compose() {
		CompletableFuture<String> helloWorld = cfhw.helloWorldThenCompose();
		helloWorld.thenAccept(s->{
			assertEquals("HELLO WORLD!", s);
		})
		.join();
	}
}
