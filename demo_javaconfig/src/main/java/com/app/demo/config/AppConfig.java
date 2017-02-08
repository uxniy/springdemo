package com.app.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.app.demo.entities.DemselRescuingKnight;
import com.app.demo.entities.Gun;
import com.app.demo.entities.Knight;
import com.app.demo.entities.KnightTask;
import com.app.demo.entities.RescueDemselTask;
import com.app.demo.entities.Sword;
import com.app.demo.entities.Weapon;

@Configuration
@Import({InfraConfig.class})
public class AppConfig {
	
//	Explicit configuration in Java
	@Bean
	KnightTask task(){
		// instantiate, bean configure and return the bean ...
		return new RescueDemselTask();
	}
	
//	By Default the bean is singlten
//	You can add  @Scope(value = "prototype") after @Bean to change it
	@Bean 
	Knight knight(KnightTask task,Weapon gun, Weapon sword){
		return new DemselRescuingKnight(task, gun ,sword);
	}
	
	@Bean
	Weapon gun(){
		return new Gun(); 
	}
	
	@Bean
	Weapon sword(){
		return new Sword();
	}
	
}
