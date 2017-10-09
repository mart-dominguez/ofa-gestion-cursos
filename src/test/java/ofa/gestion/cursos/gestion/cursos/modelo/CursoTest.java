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
import org.junit.Ignore;

/**
 *
 * @author martdominguez
 */
public class CursoTest {
    Curso c1;
    
    public CursoTest() {
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
     * Test of agregarAlumno method, of class Curso.
     */
    @Ignore
    public void testAgregarAlumno() {
        Alumno a1 = new Alumno("a1");
        c1.agregarAlumno(a1);
        Alumno a2 = new Alumno("a2");
        c1.agregarAlumno(a2);
        Alumno a3 = new Alumno("a3");
        c1.agregarAlumno(a3);
        Alumno a4 = new Alumno("a4");
        c1.agregarAlumno(a4);
        Alumno a5 = new Alumno("a5");
        c1.agregarAlumno(a5);
        assertEquals("a1", c1.getAlumnosInscriptos()[0].getNombre());
        assertEquals("a2", c1.getAlumnosInscriptos()[1].getNombre());
        assertEquals("a3", c1.getAlumnosInscriptos()[2].getNombre());
        assertEquals("a4", c1.getAlumnosInscriptos()[3].getNombre());
        assertEquals("a5", c1.getAlumnosInscriptos()[4].getNombre());
        
    }

    /**
     * Test of quitarAlumno method, of class Curso.
     */
    @Ignore
    public void testQuitarAlumno() {
    }

    /**
     * Test of agregarAlumnoEnNull method, of class Curso.
     */
    @Ignore
    public void testAgregarAlumnoEnNull() {
    }
    
}
