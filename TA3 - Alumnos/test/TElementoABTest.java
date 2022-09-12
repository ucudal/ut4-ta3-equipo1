/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 */
public class TElementoABTest {
    
    /**
     * Test of obtenerTamanio method, of class TElementoAB.
     */
    @Test
    public void testObtenerTamanio() {
        TArbolBB arbol = new TArbolBB();
        TArbolBB arbolTestigo = new TArbolBB();
        for (int i = 0; i < 10; i++) {
            TElementoAB<Integer> elemento = new TElementoAB<>(i, i);
            TElementoAB<Integer> elemento2 = new TElementoAB<>(i, i);
            arbol.insertar(elemento);
            arbolTestigo.insertar(elemento);
        }
        int tamanio = arbol.obtenerTamanio();
        assertEquals(arbolTestigo.inOrden(), arbol.inOrden());
        assertEquals(arbolTestigo.preOrden(), arbol.preOrden());
        assertEquals(10, tamanio);
    }
    
    @Test
    public void testDevuelveEntero() {
        TArbolBB arbol = new TArbolBB();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int dato = random.nextInt(0, 20);
            TElementoAB<Integer> elemento = new TElementoAB<>(dato, dato);
        }
        int resultado = arbol.obtenerTamanio();
        assertTrue(resultado >= 0);
    }
    
    @Test
    public void testTamanioArbolVacio() {
        TArbolBB arbol = new TArbolBB();
        int resultado = arbol.obtenerTamanio();
        assertEquals(0, resultado);
    }    
}
