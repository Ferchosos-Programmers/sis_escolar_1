package com.sis_escolar_1.servicio.Impl;

import com.sis_escolar_1.modelo.Aulas;
import com.sis_escolar_1.modelo.Cursos;
import com.sis_escolar_1.repositorio.AulasRepositorio;
import com.sis_escolar_1.servicio.AulasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulasServicioImpl implements AulasServicio {

    @Autowired
    private AulasRepositorio aulasRepositorio;

    @Override
    public List<Aulas> getAllAulas() {
        return aulasRepositorio.findAll();
    }

    @Override
    public List<Cursos> getAllCursos() {
        return List.of();
    }

    @Override
    public Aulas getAulasById(Integer id) {
        return aulasRepositorio.findById(id).orElse(null);
    }

    @Override
    public Aulas saveOrUpdateAulas(Aulas aulas) {
        return aulasRepositorio.save(aulas);
    }

    @Override
    public boolean deleteAulas(Integer id) {
        if (aulasRepositorio.existsById(id)) {
            aulasRepositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
