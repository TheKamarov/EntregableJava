package com.company;

public class ProfesorAdjunto extends Profesor {

    //Esta clase es la hija de Profesor (Parte D)

    //Creo los atributos(Parte D)

    private Integer horasParaConsultas;

    //Creo el constructor


    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer horasParaConsultas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasParaConsultas = horasParaConsultas;
    }
}
