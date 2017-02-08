package com.app.demo.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class SingerAspect {
	@Around("execution(* com.app.demo.entities.DemselRescuingKnight.start(..))")
	public void singing(ProceedingJoinPoint point) throws Throwable{
		System.out.println("How a brave warrior(Before)!");
		point.proceed();
		System.out.println("How a brave warrior(After)!");
		
	}
	
}
