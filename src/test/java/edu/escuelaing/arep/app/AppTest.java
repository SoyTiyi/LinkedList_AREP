package edu.escuelaing.arep.app;

import static org.junit.Assert.assertNotEquals;

import java.util.LinkedList;
import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testMeanCorrect(){
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertEquals(15.33, Math.floor(Statics.mean(list) * 100) / 100);
    }

    @Test
    public void testMeanIncorrect(){
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertNotEquals(9,Math.floor(Statics.mean(list) * 100) / 100);
    }

    @Test
    public void testStandartDesviationCorrect(){
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertEquals(3.39, Math.floor(Statics.standardDesviation(list) * 100) / 100);
    }

    @Test
    public void testStandartDesviationIncorrect(){
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(12.0);
        list.add(14.0);
        list.add(20.0);
        assertNotEquals(5.91, Math.floor(Statics.standardDesviation(list) * 100) / 100);
    }
   
}
