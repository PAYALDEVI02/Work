package com.example.myapp.myapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    void testAdd() {
        App a=new App();
            assertEquals(25, a.add(10,15));
    }
}
