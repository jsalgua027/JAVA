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
public class RestaTest {
    
    public RestaTest() {
    }

    /**
     * Test of getResta method, of class Resta.
     */
    @org.junit.Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 3.0;
        double b = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of deCrementa method, of class Resta.
     */
    @org.junit.Test
    public void testDeCrementa() {
        System.out.println("deCrementa");
        double a = 1.0;
        Resta instance = new Resta();
        double expResult = 2.0;
        double result = instance.deCrementa(a);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class Resta.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Resta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
