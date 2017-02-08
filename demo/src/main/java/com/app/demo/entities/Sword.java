package com.app.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

	public String getName() {
		return "Sword";
	}

}
