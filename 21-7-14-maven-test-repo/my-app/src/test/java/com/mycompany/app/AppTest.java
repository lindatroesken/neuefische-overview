package com.mycompany.app;

//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;// ist die sauberere Art, übersichtlicher zu lesen
import  org.junit.Assert;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String actual = App.hello();

        assertTrue( true );
        assertTrue(actual.contains("Kurs"));
        Assert.assertFalse(actual.contains("y"));

    }

    @Ignore // damit wird der Test ignoriert!
    @Test // damit wird es zu einem ausführbaren Test
    public void shouldBeNamedStrict(){
        String actual = App.hello();
        assertEquals("Hallo Kurs", actual);
    }

    @Test
    public void calculateLengthOfString(){
        int actualLengthOfString = App.calculateLengthOfString("some input string");

        Assert.assertTrue(actualLengthOfString>0);
    }

    @Test
    public void addTest(){
        // GIVEN
        int firstValue = 3;
        int secondValue = 10;
        // WHEN
        int actual = App.add(firstValue,secondValue);
        // THEN
        assertEquals(13, actual);

    }

    @Test
    public void greater100Test(){
        // GIVEN


    }
}
