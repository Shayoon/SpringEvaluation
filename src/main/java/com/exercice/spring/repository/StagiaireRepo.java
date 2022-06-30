package com.exercice.spring.repository;

import com.exercice.spring.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StagiaireRepo extends JpaRepository<Stagiaire,Long> {
}
