package com.sis_escolar_1.servicio.Impl;

import com.sis_escolar_1.modelo.Aulas;
import com.sis_escolar_1.modelo.Cursos;
import com.sis_escolar_1.modelo.Estudiantes;
import com.sis_escolar_1.modelo.Profesores;
import com.sis_escolar_1.repositorio.EstudiantesRepositorio;
import com.sis_escolar_1.repositorio.ProfesoresRepositorio;
import com.sis_escolar_1.servicio.ProfesoresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesoresServicioImpl  implements  ProfesoresServicio {

    @Autowired
    private ProfesoresRepositorio profesoresRepositorio;

    @Override
    public List<Profesores> getAllProfesores() {
        return profesoresRepositorio.findAll();
    }

    @Override
    public List<Aulas> getAllAulas() {
        return List.of();
    }

    @Override
    public Profesores getProfesoresById(Integer id) {
        return profesoresRepositorio.findById(id).orElse(null);
    }

    @Override
    public Profesores saveOrUpdateProfesores(Profesores profesores) {
        return profesoresRepositorio.save(profesores);
    }

    @Override
    public boolean deleteProfesores(Integer id) {
        if (profesoresRepositorio.existsById(id)) {
            profesoresRepositorio.deleteById(id);
            return true;
        }
        return false;
    }

}
