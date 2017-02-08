package com.app.demo;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.demo.config.AppConfig;
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
    	
//    	JavaConfig
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	Knight knight = ctx.getBean(DemselRescuingKnight.class);
    	knight.start();
    	ctx.close();
    	
      
      
    	
    	
    	
    	
    	
    	
    }
}
