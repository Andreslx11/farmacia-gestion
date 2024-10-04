package com.example.gestionfarmacia.persistence.enums.productoenums;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Lombok
@Getter
@AllArgsConstructor

public enum Presentacion {

        // Sólidas
        COMPRIMIDO("comprimido"),
        CAPSULA("cápsula"),
        POLVO("polvo"),
        GRANULADO("granulado"),
        OVULO("óvulo"),
        SUPOSITORIO("supositorio"),

        // Líquidas
        SOLUCION("solución"),
        SUSPENSION("suspensión"),
        EMULSION("emulsión"),
        JARABE("jarabe"),
        ELIXIR("elixir"),

        // Otras
        PARCHE_TRANSDERMIC("parche transdérmico"),
        INHALADOR("inhalador"),
        GEL("gel"),
        CREMA("crema"),
        UNGÜENTO("ungüento"),
        OTRA("otra");

        private final String descripcion;




}
