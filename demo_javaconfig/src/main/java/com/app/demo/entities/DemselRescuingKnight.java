package com.app.demo.entities;

import java.util.List;



public class DemselRescuingKnight implements Knight {
	 
	private KnightTask task;
	
	private Weapon gun;
	
	private Weapon sword;
	
	public DemselRescuingKnight(KnightTask task, Weapon gun ,Weapon sword){
		this.task = task;
		this.gun = gun;
		this.sword = sword;
	}
	
	public String getProfession() {
		return "I am a DemselRescuingKnight";
	}
	
	public void start() {
		System.out.println(this.getProfession());
		checkWeapon();
		System.out.println("I am runing the " + task.getTaskName()) ;
	}
	
	public void checkWeapon(){
		System.out.println("I have a " + gun.getName() + " and a " + sword.getName());
		
		
	}


}
