package com.ronal.educlass.jasper.service;

import com.ronal.educlass.entity.Alumno;
import com.ronal.educlass.jasper.datasource.DataSourceAlumno;
import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportAlumnoService {

    public String reporteAlumnos(Alumno alumno) throws JRException, IOException {

        Alumno pdf = alumno;
        Map<String, Object> params = new HashMap<>();
        JRDataSource dataSource = new DataSourceAlumno(pdf);
        JasperReport jasperReport = JasperCompileManager.compileReport("src/main/resources/static/ficha.jrxml");
        params.put("logo_educlass", "src/main/resources/static/test.png");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
        byte[] pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);
        return Base64.getEncoder().encodeToString(pdfBytes);
    }
}
