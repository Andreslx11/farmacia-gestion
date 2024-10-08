package com.example.gestionfarmacia.persistence.entity;


import com.example.gestionfarmacia.persistence.enums.empleadoenums.Cargo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


//Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//JPA
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
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

    @OneToMany(mappedBy = "empleado")
    private List<Pedido> pedidos;
}
