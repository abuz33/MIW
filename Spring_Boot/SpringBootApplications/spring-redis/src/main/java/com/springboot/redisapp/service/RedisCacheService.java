/**
 * Created by abuzer.alaca on 28/12/2021
 **/


package com.springboot.redisapp.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "myCache")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "longRunningOperation";
    }

    @CacheEvict(cacheNames = "myCache", allEntries = true)
    public void clearCache() {
        System.out.println("Cache cleared");
     }
}
