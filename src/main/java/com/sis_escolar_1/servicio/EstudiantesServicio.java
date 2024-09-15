package com.sis_escolar_1.servicio;

import com.sis_escolar_1.modelo.Cursos;
import com.sis_escolar_1.modelo.Estudiantes;

import java.util.List;

public interface EstudiantesServicio {
    List<Estudiantes> getAllEstudiantes();
    Estudiantes getEstudiantesById(Integer id);
    Estudiantes saveOrUpdateEstudiantes(Estudiantes estudiantes);
    boolean deleteEstudiantes(Integer id);
}
