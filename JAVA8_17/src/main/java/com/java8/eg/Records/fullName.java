package com.java8.eg.Records;

public record fullName(String name,String surName){
	public String toStringOne() {
		return this.name+" , "+this.surName;
	}
};

