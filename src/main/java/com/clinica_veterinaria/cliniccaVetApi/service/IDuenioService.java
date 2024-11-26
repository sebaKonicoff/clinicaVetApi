package com.clinica_veterinaria.cliniccaVetApi.service;

import com.clinica_veterinaria.cliniccaVetApi.model.Duenio;

import java.util.List;

public interface IDuenioService {
    public List<Duenio> getDuenio();
    public void saveDuenio(Duenio duenio);
    public void deleteDuenio(Long id);
    public Duenio findDuenio(Long id);
    public void setDuenio(Duenio duenio);
}
