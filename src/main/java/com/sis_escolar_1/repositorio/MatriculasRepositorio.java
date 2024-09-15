package com.sis_escolar_1.repositorio;

import com.sis_escolar_1.modelo.Matriculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculasRepositorio  extends JpaRepository<Matriculas,Integer> {
}
