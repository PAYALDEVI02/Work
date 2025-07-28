package com.space.Myspace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }
	
    public static Test suite() 
    {
        return new TestSuite( AppTest.class );
    }
     public void testMul() {
	App a=new App();
	int res=a.mul(4,5)
	assertEquals(22,res);
     }

}


