package com.company;

import java.util.List;
import java.util.Objects;

public class Alumno {

    //Creo los atributos (Parte A)

    private String nombre;  //Creo un atributo de tipo String que va a recibir un nombre
    private String apellido;    //Creo un atributo de tipo String que va a recibir un apellido
    private String codigoDeAlumno; //Creo un atributo de tipo Integer que va a recibir un codigo para un alumno;

    //Creo un constructor que va a recibir un nombre, apellido y un codigo para un alumno (Parte A)

    public Alumno(String nombre, String apellido, String codigoDeAlumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }

    public Alumno(List<String> listaDeString) {
        this.codigoDeAlumno = listaDeString.get(0);
        this.nombre = listaDeString.get(1);
        this.apellido = listaDeString.get(2);

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

    public String getCodigoDeAlumno() {
        return codigoDeAlumno;
    }
}
