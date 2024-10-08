package com.example.gestionfarmacia.persistence.entity;

import com.example.gestionfarmacia.persistence.enums.Categoria;
import com.example.gestionfarmacia.persistence.enums.Concentracion;
import com.example.gestionfarmacia.persistence.enums.Presentacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

// Lombok
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


// Jpa
@Entity
@Table(name = "productos" )
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column( name = "id_producto")
    private long id;


    @Column( name = "nombre_comercial")
    private String  nombreComercial;

    @Column( name = "nombre_generico" )
    private String nombreGenerico;

    private  String laboratorio;

    @Enumerated(EnumType.STRING)
    private Presentacion presentacion;

    @Enumerated(EnumType.STRING)
    private Concentracion concentracion;

    private Integer stock;

    @Column( name = "precio_venta")
    private BigDecimal precioVenta;

    @Column( name = "fecha_vencimiento" )
    private LocalDate fechaVencimiento;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Column(name = "registro_invima")
    private String registroInvima;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

}
