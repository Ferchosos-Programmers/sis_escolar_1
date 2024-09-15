package com.sis_escolar_1.repositorio;

import com.sis_escolar_1.modelo.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesoresRepositorio extends JpaRepository<Profesores,Integer> {
}
