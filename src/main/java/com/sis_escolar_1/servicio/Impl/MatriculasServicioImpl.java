package com.sis_escolar_1.servicio.Impl;

import com.sis_escolar_1.modelo.*;
import com.sis_escolar_1.repositorio.MatriculasRepositorio;
import com.sis_escolar_1.repositorio.ProfesoresRepositorio;
import com.sis_escolar_1.servicio.MatriculasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculasServicioImpl  implements MatriculasServicio {

    @Autowired
    private MatriculasRepositorio matriculasRepositorio;

    @Override
    public List<Matriculas> getAllMatriculas() {
        return matriculasRepositorio.findAll();
    }

    @Override
    public List<Cursos> getAllCursos() {
        return List.of();
    }

    @Override
    public List<Estudiantes> getAllEstudiantes() {
        return List.of();
    }

    @Override
    public Matriculas getMatriculasById(Integer id) {
        return matriculasRepositorio.findById(id).orElse(null);
    }

    @Override
    public Matriculas saveOrUpdateMatriculas(Matriculas matriculas) {
        return matriculasRepositorio.save(matriculas);
    }

    @Override
    public boolean deleteMatriculas(Integer id) {
        if (matriculasRepositorio.existsById(id)) {
            matriculasRepositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
