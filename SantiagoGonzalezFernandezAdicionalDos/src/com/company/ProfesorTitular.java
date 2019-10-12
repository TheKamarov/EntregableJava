package com.company;

public class ProfesorTitular extends Profesor {

    //Esta clase es la hija de Profesor (Parte D)

    //Creo los atributos (Parte D)
    private String especialidad;

    //Creo el constructor

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.especialidad = especialidad;
    }

}
