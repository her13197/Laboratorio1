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
public class RadioTest {
    
    public RadioTest() {
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
     * Test of encendidoApagado method, of class Radio.
     */
    @Test
    public void testEncendidoApagado() {
        System.out.println("encendidoApagado");
        Radio instance = new RadioImpl();
        instance.encendidoApagado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        Radio instance = new RadioImpl();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacion method, of class Radio.
     */
    @Test
    public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        double estacion = 0.0;
        int boton = 0;
        Radio instance = new RadioImpl();
        instance.guardarEstacion(estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstacion method, of class Radio.
     */
    @Test
    public void testCambiarEstacion() {
        System.out.println("cambiarEstacion");
        boolean direccion = false;
        Radio instance = new RadioImpl();
        instance.cambiarEstacion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionesFav method, of class Radio.
     */
    @Test
    public void testGetEstacionesFav() {
        System.out.println("getEstacionesFav");
        Radio instance = new RadioImpl();
        String[] expResult = null;
        String[] result = instance.getEstacionesFav();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RadioImpl implements Radio {

        public void encendidoApagado() {
        }

        public void cambiarFrecuencia() {
        }

        public void guardarEstacion(double estacion, int boton) {
        }

        public void cambiarEstacion(boolean direccion) {
        }

        public String[] getEstacionesFav() {
            return null;
        }
    }
}
