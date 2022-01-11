/**
 * Created by abuzer.alaca on 28/12/2021
 **/


package com.springboot.redisapp.api;

import com.springboot.redisapp.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisCacheController {
    private int counter = 0;

    @Autowired
    public RedisCacheService redisCacheService;

    @GetMapping("/cache/counter")
    public String getCounter() {
        return "Counter: " + counter++;
    }


    @GetMapping
    public String cacheController() throws InterruptedException {
        if (counter == 5) {
            counter = 0;
            redisCacheService.clearCache();
        }
        counter++;
        return redisCacheService.longRunningMethod();
    }

}
