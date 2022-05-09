/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nacho
 */
public class MetodosTest {

    public MetodosTest() {
    }

    @Test
    public void testTallas() {
        System.out.println("Tallas");
        String t = "";
        Metodos instance = new Metodos();
        String expResult = "";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testIva() {
        System.out.println("iva");
        double precio = 0.0;
        Metodos instance = new Metodos();
        double expResult = 0.0;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasXS() {
        System.out.println("Tallas");
        String t = "XS";
        Metodos instance = new Metodos();
        String expResult = "Extra Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasS() {
        System.out.println("Tallas");
        String t = "S";
        Metodos instance = new Metodos();
        String expResult = "Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasM() {
        System.out.println("Tallas");
        String t = "M";
        Metodos instance = new Metodos();
        String expResult = "Mediana";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasL() {
        System.out.println("Tallas");
        String t = "L";
        Metodos instance = new Metodos();
        String expResult = "Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasXL() {
        System.out.println("Tallas");
        String t = "XL";
        Metodos instance = new Metodos();
        String expResult = "Muy Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    public void testTallasXXL() {
        System.out.println("Tallas");
        String t = "XXL";
        Metodos instance = new Metodos();
        String expResult = "Extra grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    //prueba de cálculo correcto
    public void testIva1() {
        System.out.println("iva");
        double precio = 65.9;
        Metodos instance = new Metodos();
        double expResult = 79.739;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    //prueba de cálculo erroneo
    public void testIva2() {
        System.out.println("iva");
        double precio = 12;
        Metodos instance = new Metodos();
        double expResult = 14.52;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

}
