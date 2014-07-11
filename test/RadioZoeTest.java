/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class RadioZoeTest {
    
    public RadioZoeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encendidoApagado method, of class RadioZoe.
     */
    @Test
    public void testEncendidoApagado() {
        System.out.println("encendidoApagado");
        RadioZoe instance = new RadioZoe();
        instance.encendidoApagado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class RadioZoe.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        RadioZoe instance = new RadioZoe();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacion method, of class RadioZoe.
     */
    @Test
    public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        double estacion = 0.0;
        int boton = 0;
        RadioZoe instance = new RadioZoe();
        instance.guardarEstacion(estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstacion method, of class RadioZoe.
     */
    @Test
    public void testCambiarEstacion() {
        System.out.println("cambiarEstacion");
        boolean direccion = false;
        RadioZoe instance = new RadioZoe();
        instance.cambiarEstacion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionesFav method, of class RadioZoe.
     */
    @Test
    public void testGetEstacionesFav() {
        System.out.println("getEstacionesFav");
        RadioZoe instance = new RadioZoe();
        String[] expResult = null;
        String[] result = instance.getEstacionesFav();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class RadioZoe.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        RadioZoe instance = new RadioZoe();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class RadioZoe.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        RadioZoe instance = new RadioZoe();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmFm method, of class RadioZoe.
     */
    @Test
    public void testGetAmFm() {
        System.out.println("getAmFm");
        RadioZoe instance = new RadioZoe();
        boolean expResult = false;
        boolean result = instance.getAmFm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmFm method, of class RadioZoe.
     */
    @Test
    public void testSetAmFm() {
        System.out.println("setAmFm");
        boolean amFm = false;
        RadioZoe instance = new RadioZoe();
        instance.setAmFm(amFm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class RadioZoe.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        RadioZoe instance = new RadioZoe();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class RadioZoe.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 0.0;
        RadioZoe instance = new RadioZoe();
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
