package com.example.demo.annotation;//package annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 在ApplicationStarter 使用 @EnableSchedule， 这个注解面引用了 SchedulingConfiguration，
 * SchedulingConfiguration 里面初始化了 ScheduledAnnotationBeanPostProcessor 作为 bean
 * 在ScheduledAnnotationBeanPostProcessor.postProcessAfterInitialization(Object bean, String beanName) 中
 * {
 *      Class<?> targetClass = AopUtil.getTargetClass(bean);
 *      ReflectionUtils.doWithMethods(targetClass, (method)->{
 *           for(Schedule schedule:AnnotationUtils.getRepeatableAnnotation(method, Schedule.class)){
 *               processScheduled(cheduled, method, bean);
 *           }
 *      })
 * }
 */
@Component
public class Schedule {

    @Scheduled(fixedRate = 3000)
    public void fixTick(){
        System.out.println("每3s 上报一次");
    }
}
