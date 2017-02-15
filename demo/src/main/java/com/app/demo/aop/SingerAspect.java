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
	//Others: Before, After,AfterThrowing and so on 
	//the code in the brackets is the pointcut, where you want to weave you aspect
	//Advice is when and what you want in the aspect. around is when and the method is what
	//join point is represented for the target method you weave the aspect.
	@Around("execution(* com.app.demo.entities.Knight.start(..))")
	public void singing(ProceedingJoinPoint point) throws Throwable{
		System.out.println("How a brave warrior(Before)!");
		point.proceed();
		System.out.println("How a brave warrior(After)!");
		
	}
	
}
