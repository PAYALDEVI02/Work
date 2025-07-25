package com.example.myapp.myapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    
    @Test
    public void AppTest() {
        public void testAdd(){
            int result = App.add(3,7);
            assertEquals(10,result);
    }
}
