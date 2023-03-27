package com.generation.cohorte23.jpa.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "orden")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreOrden;
    
    /********************relaciones***********************/
    @ManyToOne //muchos ordenes con un usuario
    private UsuarioModel usuario;
    
    @OneToOne(mappedBy = "orden")
    private DetalleOrdenModel detalle;
    /****************************************************/
    
    public OrderModel() {
		super();
	}
    
    public OrderModel(Long id, String nombreOrden, UsuarioModel usuario, DetalleOrdenModel detalle) {
		super();
		this.id = id;
		this.nombreOrden = nombreOrden;
		this.usuario = usuario;
		this.detalle = detalle;
	}

	public Long getId() {
        return id;
    }
    
	public void setId(Long id) {
        this.id = id;
    }
    public String getNombreOrden() {
        return nombreOrden;
    }
    public void setNombreOrden(String nombreOrden) {
        this.nombreOrden = nombreOrden;
    }
 
}