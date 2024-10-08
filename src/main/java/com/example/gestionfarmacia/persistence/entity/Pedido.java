package com.example.gestionfarmacia.persistence.entity;

import com.example.gestionfarmacia.persistence.enums.pedidoenums.EstadoPedido;
import com.example.gestionfarmacia.persistence.enums.pedidoenums.FormaPago;
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
@Table(name = "pedidos" )

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido" )
    private  Long id;

    @Column(name = "fecha_pedido")
    private LocalDate   fechaPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pedido")
    private EstadoPedido estadoPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente", nullable = false)
    private  Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "empleado_id", referencedColumnName = "id_empleado", nullable = false)
    private Empleado empleado;

    @Enumerated(EnumType.STRING)
    @Column(name= "forma_pago")
    private FormaPago formaPago;

    @Column(name = "total", nullable = false)
    private BigDecimal total;
}
