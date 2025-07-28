package com.space.Myspace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;


public class AppTest {
   /**
    * Rigorous Test :-)
    */
   @Test
   public void testMessage() {
       String expected = "Hello World";
       assertEquals(expected, App.getMessage());
   }
    public void testMultiplication(){
       assertEquals(14,App.multiply(5,3));
   }
}
