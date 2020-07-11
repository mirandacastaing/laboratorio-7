package com.cenfotec.mongoapi.domain;

import org.springframework.data.annotation.Id;

public class Professional {
	@Id
	public String id;
	public String name;

	public Professional() {
	}

	public Professional(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Colleague{" + ", name='" + name + '\'' + '}';
	}
}
