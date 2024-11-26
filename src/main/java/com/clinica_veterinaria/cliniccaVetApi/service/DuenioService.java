package com.clinica_veterinaria.cliniccaVetApi.service;

import com.clinica_veterinaria.cliniccaVetApi.model.Duenio;
import com.clinica_veterinaria.cliniccaVetApi.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    private IDuenioRepository repoDuenio;

    @Override
    public List<Duenio> getDuenio() {
        List<Duenio> duenios = repoDuenio.findAll();
        return duenios;
    }

    @Override
    public Duenio findDuenio(Long id) {
        return repoDuenio.findById(id).orElse(null);
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        repoDuenio.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        repoDuenio.deleteById(id);
    }

    @Override
    public void setDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
}
