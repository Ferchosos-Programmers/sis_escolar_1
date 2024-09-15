package com.sis_escolar_1.servicio;

import com.sis_escolar_1.modelo.Aulas;
import com.sis_escolar_1.modelo.Profesores;

import java.util.List;

public interface ProfesoresServicio {
    List<Profesores> getAllProfesores();
    List<Aulas> getAllAulas();
    Profesores getProfesoresById(Integer id);
    Profesores saveOrUpdateProfesores(Profesores profesores);
    boolean deleteProfesores(Integer id);
}
