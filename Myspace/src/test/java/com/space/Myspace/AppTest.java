package com.space.Myspace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
* Unit test for simple App.
*/
public class AppTest {
   /**
    * Rigorous Test :-)
    */
   @Test
   public void testMessage() {
       String expected = "Hello World";
       assertEquals(expected, App.getMessage());
   }
   public void testSubtract(){
       assertEquals(2,App.subtract(5,3));
   }
    public void testMultiplication(){
       assertEquals(14,App.multiply(5,3));
   }
}
