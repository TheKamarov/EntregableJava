package com.company;

import java.util.Objects;

public class Alumno {

    //Creo los atributos (Parte A)

    private String nombre;  //Creo un atributo de tipo String que va a recibir un nombre
    private String apellido;    //Creo un atributo de tipo String que va a recibir un apellido
    private Integer codigoDeAlumno; //Creo un atributo de tipo Integer que va a recibir un codigo para un alumno;

    //Creo un constructor que va a recibir un nombre, apellido y un codigo para un alumno (Parte A)

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }

    //Hago un OverLoading de equals para que me compare a los alumnos por codigoDeAlumno
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(codigoDeAlumno, alumno.codigoDeAlumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeAlumno);
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }
}
