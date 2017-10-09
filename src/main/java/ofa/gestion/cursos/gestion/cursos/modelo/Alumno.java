/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofa.gestion.cursos.gestion.cursos.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mdominguez
 */
public class Alumno {
    private String nombre;
    private Integer id;
    private String email;
    private List<Curso> inscripciones;

    public Alumno() {
        inscripciones = new ArrayList<>();
    }

    public Alumno(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    public void registrarInscripcion(Curso c){
        this.inscripciones.add(c);
    }
  
    public Integer creditos(){
        Integer creditos =0;
        for(Curso c : this.inscripciones){
            creditos += c.getCreditosOtorgados();
        }
        return creditos;
    }
    
}
