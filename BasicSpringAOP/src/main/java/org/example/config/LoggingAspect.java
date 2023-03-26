package org.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(void org.example..*.set*(*))")
    public void callSetters(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String arg = joinPoint.getArgs()[0].toString();
        logger.info("setter "+ method +" with args "+arg+" called");
    }
}
