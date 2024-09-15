package com.sis_escolar_1.repositorio;

import com.sis_escolar_1.modelo.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepositorio extends JpaRepository<Estudiantes,Integer> {
}
