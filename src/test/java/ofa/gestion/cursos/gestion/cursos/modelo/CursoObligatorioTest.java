/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofa.gestion.cursos.gestion.cursos.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martdominguez
 */
public class CursoObligatorioTest {
    
    CursoObligatorio curso;
    
    @Before
    public void setUp() {
        curso = new CursoObligatorio();
        curso.setNombre("curso1");
        curso.setCuposMaximos(1);
    }
    
    @After
    public void tearDown() {
    }
    
    public CursoObligatorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
  

    @Test
    public void testInscribirConCupo() {
        Alumno a1 = new Alumno();
        a1.setId(99);
        a1.setNombre("martin");
        curso.inscribir(a1);
        Integer esperado = 1;
        assertEquals(esperado,curso.numeroInscriptos());
    }
    
    @Test
    public void testInscribirSinCupo() {
        Alumno a1 = new Alumno();
        a1.setId(99);
        a1.setNombre("martin");
        curso.inscribir(a1);
        Alumno a2 = new Alumno();
        a2.setId(100);
        a2.setNombre("pepe");
        curso.inscribir(a2);        
        Integer esperado = 1;
        assertEquals(esperado,curso.numeroInscriptos());
    }
    
}
