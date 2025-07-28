package com.ronal.educlass.jasper.datosJasper;

import com.ronal.educlass.jasper.dto.AlumnoPdf;
import org.apache.commons.lang3.StringUtils;

public class DatosJasperAlumno {
    public static String nombreCompletoAlumno(AlumnoPdf alumno) {
        StringBuilder nombreCompleto = new StringBuilder();
        String nombre = alumno.getNombre();
        String apellido1 = StringUtils.defaultIfBlank(alumno.getApellido1(), "-");
        String apellido2 = StringUtils.defaultIfBlank(alumno.getApellido2(), "-");
        nombreCompleto.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2);
        return nombreCompleto.toString();
    }
}
