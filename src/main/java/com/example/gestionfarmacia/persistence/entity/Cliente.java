package com.example.gestionfarmacia.persistence.entity;


import com.example.gestionfarmacia.persistence.enums.TipoDocumento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;



//Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//JPA
@Entity
@Table(name = "clientes")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_cliente")
    private Long id;

    private String nombre;
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento")
    private TipoDocumento tipoDocumento;

    @Column(name = "numero_documento" ,  unique = true, nullable = false)
    private String numeroDocumento;

    private String direccion;
    private String telefono;
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;


}
