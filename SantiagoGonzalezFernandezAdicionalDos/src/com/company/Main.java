package com.company;

import com.digitalhouse.DHException;
import com.digitalhouse.DigitalException;
import com.digitalhouse.OtherException;

public class Main {

    public static void main(String[] args) throws DHException, OtherException {
        DigitalHouseManager unDigitalHouseManager = new DigitalHouseManager();

        unDigitalHouseManager.altaProfesorAdjunto("Robert","Filip", 1,25);
        unDigitalHouseManager.altaProfesorAdjunto("Albert", "Colem", 2,33);

        unDigitalHouseManager.altaProfesorTitular("Einstein", "Carni", 3,"lengua");
        unDigitalHouseManager.altaProfesorTitular("Eduard", "Colem", 4, "matematica");

        unDigitalHouseManager.altaCurso("Full Stack",20001,3);
        unDigitalHouseManager.altaCurso("Android",20002,2 );

        unDigitalHouseManager.asignarProfesores(20001,3,1);
        unDigitalHouseManager.asignarProfesores(20002,4,2);

        unDigitalHouseManager.altaAlumno("Santiago","Gonzalez",1, true);
        unDigitalHouseManager.altaAlumno("Ezequiel", "Galvan ", 2,true);
        unDigitalHouseManager.altaAlumno("Gabriel", "Risquet",3,false);

        unDigitalHouseManager.inscribirAlumno(1,20001);
        unDigitalHouseManager.inscribirAlumno(2,20001);

        unDigitalHouseManager.inscribirAlumno(1,20002);
        unDigitalHouseManager.inscribirAlumno(2,20002);
        unDigitalHouseManager.inscribirAlumno(3,20002);

        unDigitalHouseManager.bajaProfesor(1);

        unDigitalHouseManager.bajaCurso(20001);

        //Respuesta(Parte K):le agregaria una flecha de tiene que vaya de alumno a cursos (alumno tiene un cursos , que seria al que esta inscripto)

        try {
            DigitalException.inscripcionDH(unDigitalHouseManager.buscarAlumnoPorCodigo(1));
        } catch (DHException e){
            System.out.println("Venir Al Colerning");
        }catch (OtherException e){
            System.out.println("Hablar Con alumnos");
        }

        try {
            DigitalException.inscripcionDH(unDigitalHouseManager.buscarAlumnoPorCodigo(2));
        }catch (DHException e){
            System.out.println("Venir Al Colerning");
        }catch (OtherException e){
            System.out.println("Hablar Con alumnos");
        }

        try {
            DigitalException.inscripcionDH(unDigitalHouseManager.buscarAlumnoPorCodigo(3));
        } catch (DHException e){
            System.out.println("Venir Al Colerning");
        }catch (OtherException e){
            System.out.println("Hablar Con alumnos");
        }

        unDigitalHouseManager.buscarAlumnoPorCodigo(1).setEsEstudioso(false);

        try {
            DigitalException.inscripcionDH(unDigitalHouseManager.buscarAlumnoPorCodigo(1));
        } catch (DHException e){
            System.out.println("Venir Al Colerning");
        }catch (OtherException e){
            System.out.println("Hablar Con alumnos");
        }
    }
}
