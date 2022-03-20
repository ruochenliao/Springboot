package com.example.demo.starter;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 在springBoot之前是需要, 但是 springBoot 只需要通过在pom 里面引入 spring-boot-starter-data-redis 后，
 * redisTemplate 可以直接被使用，而不用下面这段配置了
 *
 * @Configuration
 * class RedisConfig{
 * @Bean
 *      public RedisTemplate redisTemplate(){};
 * }
 *
 */
@Component
public class RedisStarter {

    /**
     * pom 里面引入 spring-boot-starter-data-redis 后，redisTemplate 可以直接被使用
     */
    @Resource
    private RedisTemplate<String, String> redisTemplate;


}
