package com.sis_escolar_1.servicio;

import com.sis_escolar_1.modelo.Cursos;

import java.util.List;
import java.util.Optional;

public interface CursosServicio {
    List<Cursos> getAllCursos();
    Cursos getCursosById(Integer id);
    Cursos saveOrUpdateCursos(Cursos cursos);
    boolean deleteCursos(Integer id);
}
