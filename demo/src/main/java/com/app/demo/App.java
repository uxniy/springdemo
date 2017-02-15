package com.app.demo;

import java.util.ArrayList;

import javax.annotation.PreDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.demo.config.AppConfig;
import com.app.demo.entities.DemselRescuingKnight;
import com.app.demo.entities.Gun;
import com.app.demo.entities.Knight;
import com.app.demo.entities.KnightTask;
import com.app.demo.entities.RescueDemselTask;
import com.app.demo.entities.Sword;
import com.app.demo.entities.Weapon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	This is the implementation without Spring.
//    	KnightTask task = new RescueDemselTask();
//    	Weapon gun = new Gun();
//    	Weapon sword = new Sword();
//    	Knight knight = new DemselRescuingKnight(task, gun, sword);
//    	knight.start();
//        
    	

    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	for(String name:ctx.getBeanDefinitionNames()){
    		System.out.println(name);
    	}
    	
    	Knight knight = ctx.getBean(DemselRescuingKnight.class);
    	knight.start();
//    	ctx.close();
    	//register a hook with JVM shutdown, will close this context on JVM shutdown.
    	//So the beans will be destroyed
    	ctx.registerShutdownHook();
    	
    	
    	
    }
}
