/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofa.gestion.cursos.gestion.cursos.modelo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author mdominguez
 */
public abstract class Curso {
    protected static final Integer _CANTIDAD_INICIAL_CUPOS = 4;
    protected static Integer _GENERADOR_ID_CURSO=0;
    protected Integer id;
    protected String nombre;   
    protected Integer creditosOtorgados;
    protected Integer horasCatedra;    
    @Deprecated
    protected Alumno[] alumnosInscriptos;
    protected Set<Alumno> inscriptos;
    protected Double costo;
    protected boolean cerrado;
    @Deprecated
    private Integer cantidadInscriptos;
    public Curso() {
        inscriptos = new LinkedHashSet<>();
        this.id = ++Curso._GENERADOR_ID_CURSO;                
        cantidadInscriptos=0;
    }

    public Curso(String nombre, Integer creditosOtorgados,Double costo) {
        this();
        this.nombre = nombre;
        this.creditosOtorgados = creditosOtorgados;
        this.costo = costo;
    }

    public Alumno[] getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(Alumno[] alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditosOtorgados() {
        return creditosOtorgados;
    }

    public void setCreditosOtorgados(Integer creditosOtorgados) {
        this.creditosOtorgados = creditosOtorgados;
    }   

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public Integer getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(Integer horasCatedra) {
        this.horasCatedra = horasCatedra;
    }
    
    @Deprecated
    public void agregarAlumno(Alumno a){
      /*  if(cantidadInscriptos>=_CANTIDAD_INICIAL_CUPOS){
            Alumno[] aux = new Alumno[2*this.alumnosInscriptos.length];
            System.arraycopy(this.alumnosInscriptos, 0, aux, 0, this.alumnosInscriptos.length);
            this.alumnosInscriptos =aux;
        }
        this.alumnosInscriptos[cantidadInscriptos]=a;
        cantidadInscriptos++;            
        */
    }

    @Deprecated
    public void quitarAlumno(String a){
     /*   for(int i=0;i<this.alumnosInscriptos.length;i++){
            if(this.alumnosInscriptos[i] != null && this.alumnosInscriptos[i].getNombre().equalsIgnoreCase(a)){
                this.alumnosInscriptos[i]=null;
                cantidadInscriptos--;
                return;
            }
        } */       
    }

    @Deprecated
    public void agregarAlumnoEnNull(Alumno a){
  /*      if(cantidadInscriptos<_CANTIDAD_INICIAL_CUPOS){
            for(int i=0;i<this.alumnosInscriptos.length;i++){
                if(this.alumnosInscriptos[i] == null ){
                    this.alumnosInscriptos[i]=a;
                    cantidadInscriptos++;
                    return;
                }
            }        
        }*/
    }

    public abstract void inscribir(Alumno a);
    
    public Integer numeroInscriptos(){
        return this.inscriptos.size();
    }
}
