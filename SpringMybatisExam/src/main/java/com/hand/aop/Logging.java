package com.hand.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect

public class Logging {
//	@Pointcut("execution(* com.hand.serviceimpl.CustomerServiceImpl.insert(..))")
	private void selectAll(){}
	
	
//	@Before("selectAll()")
   public void doBefore()
   {
	   System.out.println("Before Insert Customer Data");
   }
	
//	@After("selectAll()")
   public void doAfter()
   {
	   System.out.println("After Insert Customer Data");
   }
}
