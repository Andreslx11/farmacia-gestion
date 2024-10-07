package com.example.gestionfarmacia.persistence.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// Jpa
@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long id;

    @Column(name = "nombre_empresa" )
    private String nombreEmpresa;

    private String contacto;
    private String telefono;
    private String email;
    private String nit;

    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<>();


}
