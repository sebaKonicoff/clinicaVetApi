package com.clinica_veterinaria.cliniccaVetApi.controller;

import com.clinica_veterinaria.cliniccaVetApi.model.Duenio;
import com.clinica_veterinaria.cliniccaVetApi.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService serviceDuenio;

    @GetMapping("/duenio/get")
    public List<Duenio> getDuenio(){
        List<Duenio> duenios = serviceDuenio.getDuenio();
        return duenios;
    }
}
