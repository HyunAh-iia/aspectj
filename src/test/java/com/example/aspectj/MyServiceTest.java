package com.example.aspectj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MyServiceTest {

    private final MyService service;

    public MyServiceTest(@Autowired MyService service) {
        this.service = service;
    }

    @Test
    public void hello() {
        Assertions.assertThat(true);
    }


    @Test //Success
    public void cache() {
        Object result1 = service.cache(1);
        Object result2 = service.cache(1);

        Assertions.assertThat(result1).isEqualTo(result2);
    }

    @Test //Success
    public void noCache() {
        Object result1 = service.noCache(1);
        Object result2 = service.noCache(1);

        Assertions.assertThat(result1).isNotEqualTo(result2);
    }

    @Test //Fail
    public void selfInvocation() {
        Object result1 = service.selfInvocation(1);
        Object result2 = service.selfInvocation(1);

        Assertions.assertThat(result1).isEqualTo(result2);
    }
}