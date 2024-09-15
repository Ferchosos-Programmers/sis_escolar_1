package com.sis_escolar_1.repositorio;

import com.sis_escolar_1.modelo.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepositorio  extends JpaRepository<Cursos, Integer> {
}
