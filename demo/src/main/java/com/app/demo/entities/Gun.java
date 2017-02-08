package com.app.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class Gun implements Weapon {

	public String getName() {
		return "Gun";
	}

}
