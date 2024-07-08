package DesignPatterns.SBApplication.udemyClass.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import DesignPatterns.SBApplication.udemyClass.Beans.Machine;
import DesignPatterns.SBApplication.udemyClass.Beans.Vehicle;
import DesignPatterns.SBApplication.udemyClass.config.ClassConfig;


public class UdemyApp {

	public void app(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
		Vehicle	 tatabean = context.getBean("TATA",Vehicle.class);
		System.out.println(tatabean);
		Vehicle	 vh = context.getBean(Vehicle.class);
		System.out.println(vh);
		Machine mch=context.getBean(Machine.class);
		System.out.println(mch);
		System.out.println(mch.print());
		int x=1;
		if(x==1)
		{
			context.registerBean("AUDI", Vehicle.class);
			Vehicle	 vh2 = context.getBean("AUDI",Vehicle.class);
			System.out.println(">>>> "+vh2);
			
		}
		
		context.close();
		
		
		
	}
}
