package com.example.gestionfarmacia.persistence.enums.productoenums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Concentracion {


    MG_ML("mg/ml"),
    MG_COMPRIMIDO("mg/comprimido"),
    UI_ML("UI/ml"),
    UI_COMPRIMIDO("UI/comprimido"),
    PORCENTAJE("%"),
    PPM("ppm"),
    OTRA("Otra");

    private final String unidad;
}

