package com.ronal.educlass.utils;

import com.ronal.educlass.entity.Alumno;

import java.time.LocalDate;
import java.util.Random;

public class AlumnoUtils {

    public AlumnoUtils() {
        throw new RuntimeException("Clase Util");
    }

    public static String generarCodAlumno(Alumno alumno) {
        LocalDate fechaActual = LocalDate.now();

        Random random = new Random();

        int anio = fechaActual.getYear();
        int mesCumpleanio = alumno.getFechaDeNacimiento().getMonthValue();
        int numAleatorio = random.nextInt(100);
        String prefix = "AL";

        return prefix + anio + String.valueOf(mesCumpleanio) + numAleatorio;
    }

    public static String generarCorreoAlumno(String codAlumno){
        String dominioCorreoInstitucional = "@educlass.com";
        return codAlumno + dominioCorreoInstitucional;
    }
}
