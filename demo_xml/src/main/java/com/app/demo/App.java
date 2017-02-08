package com.app.demo;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.demo.entities.DemselRescuingKnight;
import com.app.demo.entities.Knight;
import com.app.demo.entities.Weapon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Or you can use FileSystemXmlApplicationContext to find the config file in the file system
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Knight knight = ctx.getBean(DemselRescuingKnight.class);
    	knight.start();
      
      
    	
    	
    	
    	
    	
    	
    }
}
