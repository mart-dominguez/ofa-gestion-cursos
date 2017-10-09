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
public class CursoEspecificoTest {
    
    CursoObligatorio cursoObl;
    CursoEspecifico cursoEsp;
    
    @Before
    public void setUp() {
        cursoObl = new CursoObligatorio();
        cursoObl.setNombre("Curso 1");
        cursoObl.setCreditosOtorgados(10);
        cursoObl.setCuposMaximos(1);
        cursoEsp=new CursoEspecifico();
        cursoEsp.setNombre("Curso 2");
        cursoEsp.setCreditosOtorgados(10);
        cursoEsp.setCreditosNecesarios(8);
        
    }

    @Test
    public void testInscribirSinCredito() {
        Alumno a1 = new Alumno();
        a1.setNombre("Martin");
        cursoEsp.inscribir(a1);
        Integer esperados=0;
        assertEquals(esperados,cursoEsp.numeroInscriptos());
    }

    @Test
    public void testInscribirConCredito() {
        Alumno a1 = new Alumno();
        a1.setNombre("Martin");
        cursoObl.inscribir(a1);
        Integer esperados=1;
        assertEquals(esperados,cursoObl.numeroInscriptos());
        cursoEsp.inscribir(a1);
        esperados=1;
        assertEquals(esperados,cursoEsp.numeroInscriptos());
    }
    
}
