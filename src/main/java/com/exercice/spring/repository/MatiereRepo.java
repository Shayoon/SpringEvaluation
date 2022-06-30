package com.exercice.spring.repository;

import com.exercice.spring.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepo extends JpaRepository<Matiere,Long> {
}
