package com.seidor.test.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InformacionTotal {
	
	

	public InformacionTotal() {
		super();
		this.clientes = new ArrayList<>();
		this.directorio = new ArrayList<>();
		this.distribuidores = new ArrayList<>();
		this.productos = new ArrayList<>();
	}
	
	ArrayList<clientes>			clientes;
	ArrayList<directorio>		directorio;
	ArrayList<distribuidores>	distribuidores;
	ArrayList<productos>		productos;
	
	
	public ArrayList<clientes> getClientes() {
		return clientes;
	}
	public void setClientes(List list) {
		this.clientes.add((clientes) list);
	}
	public ArrayList<directorio> getDirectorio() {
		return directorio;
	}
	public void setDirectorio(List list) {
		this.directorio.add((directorio) list);
	}
	public ArrayList<distribuidores> getDistribuidores() {
		return distribuidores;
	}
	public void setDistribuidores(List list) {
		this.distribuidores.add((distribuidores) list);
	}
	public ArrayList<productos> getProductos() {
		return productos;
	}
	public void setProductos(List list) {
		this.productos.add((productos) list);;
	}
	
	
	
}
