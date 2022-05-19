package com.miprimerapp.primer.app.repository;

import com.miprimerapp.primer.app.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
