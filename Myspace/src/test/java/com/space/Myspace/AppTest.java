package com.space.Myspace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
* Unit test for simple App.
*/
public class AppTest {
  
   public void testMessage() {
       String expected = "Hello World";
       assertEquals(expected, App.getMessage());
   }
 
    public void testMultiplication(){
       assertEquals(14,App.multiply(5,3));
   }
}


