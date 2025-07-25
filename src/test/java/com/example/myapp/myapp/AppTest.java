package com.example.myapp.myapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    
    @Test
    public void testAdd() {
        int result=App.add(5,1);
        assertEquals(6,result);
    }
}
