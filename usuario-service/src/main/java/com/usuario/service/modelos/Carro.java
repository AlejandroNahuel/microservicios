package com.usuario.service.modelos;

public class Carro {
	
	private String marca;
	private String modelo;
	private int usuarioId;
	
	public Carro() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;		
	}
	
	public int getUsuarioId() {
		return this.usuarioId;
	}
		
}
