package com.bee.trans.provider.config.datasource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * AOP 拦截执行时间
 */
@Aspect
@Component
public class MapperAspect {
    Logger log= LoggerFactory.getLogger(MapperAspect.class);
    @AfterReturning("execution(* com.yac.cp.provider.mapper.*.*.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
       log.info ("Completed: " + joinPoint);
    }


    /**
     * 监控com.yac.cp.provider.mapper包及其子包的所有public方法
     */
    @Pointcut("execution(* com.yac.cp.provider.mapper.*.*.*(..))")
    private void pointCutMethod() {
    }

    /**
     * 声明环绕通知
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.nanoTime();
        Object obj = pjp.proceed();
        long end = System.nanoTime();
        log.info("调用Mapper方法：{}，参数：{}，执行耗时：{}纳秒，耗时：{}毫秒",
                pjp.getSignature().toString(), Arrays.toString(pjp.getArgs()),
                (end - begin), (end - begin) / 1000000);
        return obj;
    }
}
