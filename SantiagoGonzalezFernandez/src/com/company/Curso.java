package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    //Creo los atributos (Parte B)

    private String nombre;
    private Integer codigoDeCurso;

    //Creo los atributos (Parte E)

    private Integer cuposMaximosDeAlumnos;
    private List<Alumno> listaAlumnosInscriptos; //Este atributo contiene Alumnos y la clase tiene alumnos (Parte E)
    private ProfesorTitular unoProfesorTitular; //Esta clase tiene profesoresTitulares (Parte E)
    private ProfesorAdjunto unoProfesorAdjunto; //Esta clase tiene profesoresAdjuntos (Parte E)

    //Creo el constructor porque lo creo necesario

    public Curso(String nombre, Integer codigoDeCurso, Integer cuposMaximosDeAlumnos){
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cuposMaximosDeAlumnos = cuposMaximosDeAlumnos;
        listaAlumnosInscriptos = new ArrayList<>();
    }

    //Hago un OverLoading de equals para que me compare a los cursos por su codigoDeCurso

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDeCurso, curso.codigoDeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeCurso);
    }

    //Creo metodos (Parte H)

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if(listaAlumnosInscriptos.size() < cuposMaximosDeAlumnos){
            return listaAlumnosInscriptos.add(unAlumno);
        }else{
            return false;
        }
    }

    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnosInscriptos.remove(unAlumno);
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public Integer getCuposMaximosDeAlumnos() {
        return cuposMaximosDeAlumnos;
    }

    public void setUnoProfesorAdjunto(ProfesorAdjunto unoProfesorAdjunto) {
        this.unoProfesorAdjunto = unoProfesorAdjunto;
    }

    public void setUnoProfesorTitular(ProfesorTitular unoProfesorTitular) {
        this.unoProfesorTitular = unoProfesorTitular;
    }
}
