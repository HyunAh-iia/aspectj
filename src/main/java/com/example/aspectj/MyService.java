package com.example.aspectj;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Cacheable(cacheNames = "defaultSpringCache")
    public Object cache(int anyValue) {
        return new Object();
    }

    public Object noCache(int anyValue) {
        return new Object();
    }

    public Object selfInvocation(int anyValue) {
        return cache(anyValue);
    }
}
