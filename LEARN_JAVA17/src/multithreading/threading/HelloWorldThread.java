package multithreading.threading;

public class HelloWorldThread {
	private static String result="";
	
	private static void hello() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result=result.concat("Hello ");
	}
	private static void world() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result=result.concat("World");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread helloThread=new Thread(()->hello());
		Thread worldThread=new Thread(()->world());
		
		helloThread.start();
		worldThread.start();
		
		helloThread.join();
		worldThread.join();
		
		System.out.println("Result is :"+result);
	}

}
