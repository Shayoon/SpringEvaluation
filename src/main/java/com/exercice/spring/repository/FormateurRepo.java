package com.exercice.spring.repository;

import com.exercice.spring.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FormateurRepo extends JpaRepository<Formateur,Long> {
}
