package com.imagegrafia.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class EmployeeAspect {

	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeAspect.class);
	 @Before("execution(* com.imagegrafia.service.EmployeeService.getEmployees(..))")         //point-cut expression
	    public void logBeforeGetEmployees(JoinPoint joinPoint)
	    {
		 LOGGER.info("EmployeeAspect.logBeforeGetEmployees() : " + joinPoint.getSignature().getName());
	       // System.out.println("EmployeeAspect.logBeforeGetEmployees() : " + joinPoint.getSignature().getName());
	    }
}
