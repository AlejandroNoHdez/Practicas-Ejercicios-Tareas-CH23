package com.generation.cohorte23.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "detalle")
public class DetalleOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreDetalleOrden;
    
    @OneToOne
    private OrderModel orden;
    
    @OneToOne
    private ProductoModel producto;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreDetalleOrden() {
        return nombreDetalleOrden;
    }
    public void setNombreDetalleOrden(String nombreDetalleOrden) {
        this.nombreDetalleOrden = nombreDetalleOrden;
    }
    
}