package com.SBApplication.udemyClass.Beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Machine {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Machine [type=" + type + "]";
	}

	public String print() {
		System.out.println("Machine Bean called");
		return "Machine";
	}

	@PreDestroy
	public void preDest() {
		System.out.println("Pre destory Machine");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct Machin ");
	}
	
	
}
