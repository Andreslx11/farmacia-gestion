package com.example.gestionfarmacia.persistence.enums.clienteenums;

import lombok.AllArgsConstructor;
import lombok.Getter;

//lombok
@Getter
@AllArgsConstructor

public enum TipoDocumento {

    CEDULA_CIUDADANIA("Cedula ciudadania"),
    CEDULA_EXTRANJERA("Cedula extranjera"),
    PASAPORTE("Pasaporte"),
    TARJETA_IDENTIDAD("Tarjeta identidad"),
    NIT("NIT");

    private final String descripcion;

}
