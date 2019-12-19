package com.example.springbootunitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceutTests {
    
    @Test
    void Testadd() {
        Serviceut serviceut = new Serviceut();
        assertEquals(6, serviceut.add(4, 2));
    }
}
