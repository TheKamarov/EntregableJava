package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectorDeArchivosCSV {

    private List<Alumno>listaDeAlumnos;
    private ArrayList<ArrayList<String>> datos;

    public LectorDeArchivosCSV(){
        listaDeAlumnos = new ArrayList<>();
        datos  = new ArrayList<ArrayList<String>>();
    }

    public void leerCSV(String direccionDelArchivo){
        Path filePath = Paths.get(direccionDelArchivo);
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datosTemporales = new ArrayList<String>();
                for(String dato: datosDeLinea){
                    datosTemporales.add(dato);
                }
                datos.add(datosTemporales);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Alumno> leerYAgregarAlumnosDeUnCSV(String direccionDelArchivo){
        leerCSV(direccionDelArchivo);
        for (ArrayList<String> datosEnArray:datos) {
            Alumno unAlumno = new Alumno(datosEnArray);
            listaDeAlumnos.add(unAlumno);
        }
        return listaDeAlumnos;
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }
}
