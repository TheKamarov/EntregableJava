package com.company;

import java.util.Date;

public class Inscripcion {

    //Creo los atributos

    private Alumno unAlumno;
    private Curso unCurso;
    private Date fechaDeInscripcion;

    //Creo un constructor
    public Inscripcion(Alumno unAlumno, Curso unCurso){
        this.unAlumno = unAlumno;
        this.unCurso = unCurso;
        fechaDeInscripcion = new Date(); //Esto lo que hace es añade la fecha en el momento que se creo una instancia de la clase
    }

}
