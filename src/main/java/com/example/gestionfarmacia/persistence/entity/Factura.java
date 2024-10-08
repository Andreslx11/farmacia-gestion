package com.example.gestionfarmacia.persistence.entity;


import com.example.gestionfarmacia.persistence.enums.EstadoFactura;
import com.example.gestionfarmacia.persistence.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

// Lombok
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long id;

    @Column(name = "fecha_factura", nullable = false)
    private LocalDate fechaFactura;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id_pedido", nullable = false)
    private Pedido pedido;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pago", nullable = false)
    private FormaPago formaPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_factura", nullable = false)
    private EstadoFactura estadoFactura;

    @Column(name = "numero_autorizacion", nullable = false)
    private String numeroAutorizacion;

    @Column(name = "fecha_autorizacion", nullable = false)
    private LocalDate fechaAutorizacion;
}
