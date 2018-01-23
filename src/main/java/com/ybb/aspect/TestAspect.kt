package com.ybb.aspect

import com.ybb.annotation.UserAnnotation
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
@Aspect
class TestAspect {
    @Around(value = "within(com.ybb.controller.*) && @annotation(userAnnotation)")
    @Throws(Throwable::class)
    fun doAroundAdvice(joinPoint: ProceedingJoinPoint, userAnnotation: UserAnnotation): Any {
        println("@Before(value = \"@annotation(com.ybb.annotation.UserAnnotation)\")=>$userAnnotation")
        val proceed = joinPoint.proceed()
        println("###end")
        return proceed
    }

    @AfterReturning(value = "within(com.ybb.controller.*) && @annotation(com.ybb.annotation.UserAnnotation)", returning = "rtn")
    fun dortn(rtn: Any) {
        println("@AfterReturning(returning = \"rtn\")=>$rtn")
    }

    companion object {
        private val log = LoggerFactory.getLogger(TestAspect::class.java)
    }
}
