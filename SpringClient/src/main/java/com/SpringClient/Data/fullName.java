package com.SpringClient.Data;

public record fullName(String name, String surName) {
	public String toStringOne() {
		return this.name + " , " + this.surName;
	}
};
