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
public class CursoObligatorio extends Curso {
    private Integer cuposMaximos;

    public CursoObligatorio() {
        super();
    }

    public CursoObligatorio(String nombre, Integer creditosOtorgados, Double costo) {
        super(nombre, creditosOtorgados, costo);
    }

    public Integer getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(Integer cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }

    @Override
    public void inscribir(Alumno a) {
        if(this.inscriptos.size()<this.cuposMaximos){
            this.inscriptos.add(a);
            a.registrarInscripcion(this);
        }
    }
    
}
