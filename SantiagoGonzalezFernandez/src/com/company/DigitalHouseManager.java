package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //Creo los atributos

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager(){
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }

    //Creo Metodos

    //(Parte I)
    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        Curso unCurso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        listaDeCursos.add(unCurso);
    }

    public void bajaCurso(Integer codigoCurso){
        listaDeCursos.remove(buscarCursoPorCodigo(codigoCurso));
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){
        ProfesorAdjunto unProfesorAdjunto = new ProfesorAdjunto(nombre,apellido,0,codigoProfesor,cantidadDeHoras);
        listaDeProfesores.add(unProfesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        ProfesorTitular unProfesorTitular = new ProfesorTitular(nombre,apellido,0,codigoProfesor,especialidad);
        listaDeProfesores.add(unProfesorTitular);
    }

    public void bajaProfesor(Integer codigoProfesor){
        listaDeProfesores.remove(buscarProfesorPorCodigo(codigoProfesor));
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno unAlumno = new Alumno(nombre,apellido,codigoAlumno);
        listaDeAlumnos.add(unAlumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        Alumno alumnoEncontrado = buscarAlumnoPorCodigo(codigoAlumno);
        if(cursoEncontrado.agregarUnAlumno(alumnoEncontrado)){
            Inscripcion unaInscripcion = new Inscripcion(alumnoEncontrado,cursoEncontrado);
            listaDeInscripciones.add(unaInscripcion);
            System.out.println("La inscripcion se realizo con exito");
        }else{
            System.out.println("No se pudo inscribir porque no hay cupos");
        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        ProfesorAdjunto unProfesorAdjunto = (ProfesorAdjunto) buscarProfesorPorCodigo(codigoProfesorAdjunto);
        ProfesorTitular unProfesorTitular = (ProfesorTitular) buscarProfesorPorCodigo(codigoProfesorTitular);
        Curso unCurso = buscarCursoPorCodigo(codigoCurso);
        unCurso.setUnoProfesorAdjunto(unProfesorAdjunto);
        unCurso.setUnoProfesorTitular(unProfesorTitular);
    }


    //Creo un metodo privado que me busque un profesor
    private Profesor buscarProfesorPorCodigo(Integer codigoProfesor){
        Profesor profesorBuscado = null;
        for (Profesor profesor:listaDeProfesores) {
            //busco el profesor por el codigo que me pasan por parametro
            if(profesor.getCodigoDeProfesor().equals(codigoProfesor)){
                //Guardo el profesor que quiero devolver en mi variable
                profesorBuscado = profesor;
            }
        }
        //uso el return para devolver el profesor que ya habia creado
        return profesorBuscado;
    }



    //Creo un metodo privado que me busque un curso
    private Curso buscarCursoPorCodigo(Integer codigoCurso){
        Curso cursoBuscado = null;
        for (Curso curso:listaDeCursos) {
            //busco el curso por el codigo que me pasan por parametro
            if(curso.getCodigoDeCurso().equals(codigoCurso)){
                //Guardo el curso que quiero devolver en mi variable
                cursoBuscado = curso;
            }
        }
        //uso el return para devolver el curso que ya habia creado
        return cursoBuscado;
    }

    //Creo un metodo privado que me busque un Alumno
    private Alumno buscarAlumnoPorCodigo(Integer codigoAlumno){
        Alumno alumnoBuscado = null;
        for (Alumno alumno:listaDeAlumnos) {
            //busco el alumno por el codigo que me pasan por parametro
            if(alumno.getCodigoDeAlumno().equals(codigoAlumno)){
                //Guardo el Alumno que quiero devolver en mi variable
                alumnoBuscado = alumno;
            }
        }
        //uso el return para devolver el alumno que ya habia creado
        return alumnoBuscado;
    }

}
