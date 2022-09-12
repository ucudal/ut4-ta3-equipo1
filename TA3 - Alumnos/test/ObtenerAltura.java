/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estef
 */
public class ObtenerAltura {
 
     @Test
    public void testObtenerAlturaSinNodos() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
      @Test
    public void testObtenerAltura1() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        TElementoAB test2 = new TElementoAB("1", "Test");
        instance.insertar(test2);
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
      @Test
     public void testObtenerAltura2() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        TElementoAB test2 = new TElementoAB("1", "Test");
        TElementoAB test3 = new TElementoAB("2", "Test1");
        instance.insertar(test2);
        instance.insertar(test3);
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    @Test
    public void testNoModificado(){
        System.out.println("Arbol no modificado");
        TArbolBB instance = new TArbolBB();
        TElementoAB test1= new TElementoAB("1", "Test1"); 
        TElementoAB test2 = new TElementoAB("2", "Test2");
        TElementoAB test3= new TElementoAB("3", "Test3"); 
        TElementoAB test4 = new TElementoAB("4", "Test4");
        instance.insertar(test1); 
        instance.insertar(test2); 
        instance.insertar(test3); 
        instance.insertar(test4); 
        String expResult= "1234";
        instance.obtenerAltura(); 
        assertEquals(expResult, instance.inOrden()); 
        //assertEquals(expResult, instance.preOrden()); 
    }

}
