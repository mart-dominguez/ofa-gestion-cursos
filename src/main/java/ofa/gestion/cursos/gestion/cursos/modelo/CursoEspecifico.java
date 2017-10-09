/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofa.gestion.cursos.gestion.cursos.modelo;

/**
 *
 * @author martdominguez
 */
public class CursoEspecifico extends Curso{
   private Integer creditosNecesarios;

    public CursoEspecifico() {
   
    }

    public CursoEspecifico(Integer creditosNecesarios, String nombre, Integer creditosOtorgados, Double costo) {
        super(nombre, creditosOtorgados, costo);
        this.creditosNecesarios = creditosNecesarios;
    }    

    public Integer getCreditosNecesarios() {
        return creditosNecesarios;
    }

    public void setCreditosNecesarios(Integer creditosNecesarios) {
        this.creditosNecesarios = creditosNecesarios;
    }

    @Override
    public void inscribir(Alumno a) {
        if(a.creditos()>=this.creditosNecesarios) {
            this.inscriptos.add(a);
            a.registrarInscripcion(this);
        }
    }
    
}
