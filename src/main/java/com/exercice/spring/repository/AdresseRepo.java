package com.exercice.spring.repository;

import com.exercice.spring.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepo extends JpaRepository<Adresse, Long> {

}
