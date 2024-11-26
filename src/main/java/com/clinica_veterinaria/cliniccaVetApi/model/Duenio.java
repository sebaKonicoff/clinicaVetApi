package com.clinica_veterinaria.cliniccaVetApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Enabled
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_duenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Duenio() {
    }

    public Duenio(Long id_duenio, String dni, String nombre, String apellido, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}
