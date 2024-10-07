package com.example.gestionfarmacia.persistence.entity;
/*
-- Tabla de Empleados
CREATE TABLE Empleados (

        id_empleado INT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(100) NOT NULL,
        apellido VARCHAR(100) NOT NULL,
        cargo VARCHAR(100) NOT NULL,
        usuario VARCHAR(50) NOT NULL UNIQUE,
        contrasena VARCHAR(255) NOT NULL

*/


import com.example.gestionfarmacia.persistence.enums.empleadoenums.Cargo;
import jakarta.persistence.*;

public class Empleado {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private  Long id;

    private String nombre;
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    @Column(name = "usuario", nullable = false, unique = true )
    private String usuario;

    private String contrasena;
}
