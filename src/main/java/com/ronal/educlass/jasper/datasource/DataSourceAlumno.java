package com.ronal.educlass.jasper.datasource;

import com.ronal.educlass.entity.Alumno;
import com.ronal.educlass.jasper.datosJasper.DatosJasperAlumno;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class DataSourceAlumno implements JRDataSource {

    private final Alumno alumno;
    private boolean processed = false;

    public DataSourceAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public boolean next() throws JRException {
        if (processed) {
            return false;
        }
        processed = true;
        return true;
    }

    @Override
    public Object getFieldValue(JRField jrField){
        return switch (jrField.getName()) {
            case "txt_nombre_completo" -> DatosJasperAlumno.nombreCompletoAlumno(alumno);
            case "txt_dni" -> this.alumno.getDni();
            case "txt_codigo" -> this.alumno.getCodigo();
            case "txt_correo" -> this.alumno.getCorreo();
            case "txt_telefono" -> this.alumno.getTelefono();
            case "txt_fecha_nacimiento" -> this.alumno.getFechaDeNacimiento().toString();
            default -> "-";
        };
    }

}
