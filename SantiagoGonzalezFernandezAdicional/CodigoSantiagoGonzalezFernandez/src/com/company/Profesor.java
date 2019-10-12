package com.company;

import java.util.Objects;

public class Profesor {

    //Creo los atributos (Parte C)

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    //Creo el constructor porque lo creo necesario

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    //Hago un OverLoading de equals para que me compare a los profesores por su codigoDeProfesor

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(codigoDeProfesor, profesor.codigoDeProfesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeProfesor);
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }
}
