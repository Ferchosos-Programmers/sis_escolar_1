package com.sis_escolar_1.servicio;

import com.sis_escolar_1.modelo.Aulas;
import com.sis_escolar_1.modelo.Cursos;

import java.util.List;

public interface AulasServicio {
    List<Aulas> getAllAulas();
    List<Cursos> getAllCursos();
    Aulas getAulasById(Integer id);
    Aulas saveOrUpdateAulas(Aulas aulas);
    boolean deleteAulas(Integer id);
}
