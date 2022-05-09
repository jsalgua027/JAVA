/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calculadoranb;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nacho
 */
public class SumaTest {
    
    public SumaTest() {
    }

    /**
     * Test of getsuma method, of class Suma.
     */
    @Test
    public void testGetsuma() {
        System.out.println("getsuma");
        double a = 1.0;
        double b = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.getsuma(a, b);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of incrementa method, of class Suma.
     */
    @Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 1.0;
        Suma instance = new Suma();
        double expResult = 2.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class Suma.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Suma.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
