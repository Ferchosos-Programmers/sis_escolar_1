package com.sis_escolar_1.servicio;

import com.sis_escolar_1.modelo.*;

import java.util.List;

public interface MatriculasServicio {
    List<Matriculas> getAllMatriculas();
    List<Cursos> getAllCursos();
    List<Estudiantes> getAllEstudiantes();
    Matriculas getMatriculasById(Integer id);
    Matriculas saveOrUpdateMatriculas(Matriculas matriculas);
    boolean deleteMatriculas(Integer id);
}
