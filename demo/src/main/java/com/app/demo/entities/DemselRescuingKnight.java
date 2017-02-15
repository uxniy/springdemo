package com.app.demo.entities;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class DemselRescuingKnight implements Knight {
	//@Autowired(require=false) 
	//If there is no bean you want to inject found, spring will give a error.
	//By setting the require attribute, you can avoid it.
	@Autowired
	private KnightTask task;
	
	//Autowired can be used before field ,constructor,setter even method as following
//	@Autowired
//	public void injectXXX(KnightTask task) {
//		this.task = task;
//	}

	//Autowired by type, so spring can not know which type of weapon to wire(there are gun and sword)
	//solve this problem by add @Qualifier 
	//or use @Resource(value = "youBeanName") (java version >=1.6) to replace @Autowired
	//http://qiita.com/KevinFQ/items/20a6d53a5f93e28ab9ef
//	@Autowired @Qualifier(value="gun")
//	private Weapon w1;
	//Or just use private List<Weapon> wps;
//	@Autowired
//	private Weapon gun;
	
	//Autowired the same as Inject
//	@Autowired @Qualifier(value="sword")
//	private Weapon w2;
//	@Autowired
//	private Weapon sword;
	@Autowired
	private List<Weapon> wps;
	
	//Something Interesting
	//if you use constructor and the parameter name as class name, the autowired can be omited
//	public DemselRescuingKnight(KnightTask task, Weapon gun, Weapon sword) {
//		super();
//		this.task = task;
//		this.w1 = gun;
//		this.w2 = sword;
//	}
	
	
	public String getProfession() {
		return "I am a DemselRescuingKnight";
	}
	
	@PostConstruct
	public void postInit(){
		System.out.println("Warrior appeared");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Warrior will go home");
	}
	
	@Override
	public void start() {
		System.out.println(this.getProfession());
		System.out.println("I am runing the " + task.getTaskName()) ;
		checkWeapon();
	}
	
	public void checkWeapon(){
		System.out.println("I have a " + wps.get(0).getName() + " and a " + wps.get(1).getName());
		
		
	}

	public KnightTask getTask() {
		return task;
	}

	public void setTask(KnightTask task) {
		this.task = task;
	}



}
