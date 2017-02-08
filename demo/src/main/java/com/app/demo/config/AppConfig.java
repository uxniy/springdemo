package com.app.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.app.demo.aop.SingerAspect;
import com.app.demo.entities.DemselRescuingKnight;
import com.app.demo.entities.Knight;
import com.app.demo.entities.KnightTask;
import com.app.demo.entities.RescueDemselTask;


//Implicit bean discovery and automatic wiring
//basePackages={"A", "B"}
@Configuration
@ComponentScan(basePackages = "com.app.demo")
@Import({InfraConfig.class})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
	
	
}
