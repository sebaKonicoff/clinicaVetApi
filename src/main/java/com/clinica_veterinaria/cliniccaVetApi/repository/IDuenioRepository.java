package com.clinica_veterinaria.cliniccaVetApi.repository;

import com.clinica_veterinaria.cliniccaVetApi.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository <Duenio, Long>{

}
