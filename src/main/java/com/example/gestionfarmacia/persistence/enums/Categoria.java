package com.example.gestionfarmacia.persistence.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Lombok
@Getter
@AllArgsConstructor

public enum Categoria {


    MEDICAMENTOS("Medicamentos"),
    DERMOCOSMETICA("Dermocosmética"),
    HIGIENE_BUCAL("Higiene bucal"),
    NUTRICION("Nutrición"),
    ORTOPEDIA("Ortopedia"),
    INFANTIL("Infantil"),
    OTRA("Otra");

    private final String descripcion;

}
