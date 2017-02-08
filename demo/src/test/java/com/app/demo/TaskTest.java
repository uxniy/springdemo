package com.app.demo;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.demo.config.AppConfig;
import com.app.demo.entities.DemselRescuingKnight;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TaskTest {
	@Autowired
	private DemselRescuingKnight knight;
//	@Before
//	public void setUp(){
//		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
//		knight = cxt.getBean(DemselRescuingKnight.class);
//	}
	
	@Test
	public void knightBeanCreatedTest(){
		assertTrue("I am a DemselRescuingKnight".equals(this.knight.getProfession()));
	}
	
	@Test
	public void taskBeanCreatedTest(){
		"RescueDemselTask".equals(this.knight.getTask().getTaskName());
	}
}
