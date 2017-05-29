package com.seidor.test.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.seidor.test.common.NombreTablas;
import com.seidor.test.model.clientes;
import com.seidor.test.model.directorio;
import com.seidor.test.model.distribuidores;
import com.seidor.test.model.InformacionTotal;
import com.seidor.test.model.productos;
import com.seidor.test.service.ClientesService;
import com.seidor.test.service.DirectorioService;
import com.seidor.test.service.DistribuidoresService;
import com.seidor.test.service.ProductosService;


@RestController
@RequestMapping("/consultar")
public class SpringRestController {
	
	@Autowired
	private ClientesService	clientesService;
	
	@Autowired
	private DistribuidoresService distribuidoresService;
	
	@Autowired
	private DirectorioService	directorioService;
	
	@Autowired
	private ProductosService	productosService;
	

	// =======================================================================================
	//  == Requerimiento 1 ==
	// Se podrá consumir el servicio indicando que se descargue la información de todos los 
	// registros de una tabla en específico
	@RequestMapping(value="/tabla/{nombreTabla}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Object> tabla(@PathVariable String nombreTabla){
		
		List<Object> respuesta = new ArrayList<>();
		
		switch (nombreTabla) {
			case NombreTablas.Clientes:
				respuesta = (List)this.clientesService.listClientes();
				break;
				
			case NombreTablas.Directorio:
				respuesta = (List)this.directorioService.listDirectorio();
				break;
							
			case NombreTablas.Distribuidores:
				respuesta = (List)this.distribuidoresService.listDistribuidores();
				break;
				
			case NombreTablas.Productos:
				respuesta = (List)this.productosService.listProductos();
				break;
	
			default:
				respuesta.add("Por favor, ingrese los datos de forma correcta.");
				break;
		}
		
		return respuesta;
	}
	
	//...o de todas las tablas en la base de datos.
	@RequestMapping(value="/tablas", method=RequestMethod.GET, headers="Accept=application/json")
	public <E> ArrayList<E> tablas(){
		
		ArrayList<E>  resultado =  new ArrayList<>();
		
		//InformacionTotal tablas = new InformacionTotal();
		
		List<Object> clientes = 	(List)this.clientesService.listClientes() ;
		List<Object> directorio = 	(List)this.directorioService.listDirectorio();
		List<Object> distribuidores=(List)this.distribuidoresService.listDistribuidores();
		List<Object> productos	=	(List)this.productosService.listProductos();
		
		resultado.addAll((Collection<? extends E>) clientes);
		resultado.addAll((Collection<? extends E>) directorio);
		resultado.addAll((Collection<? extends E>) distribuidores);
		resultado.addAll((Collection<? extends E>) productos);
		
		return resultado;
	}
	// =======================================================================================
	
	
	

	
	// =======================================================================================
	// == Requerimiento 2 ==
	// Se podrá consumir el servicio indicando que se descargue la información de todos los registros
	// de una tabla en específico o de todas las tablas basado en la fecha del 	updateDate.
	@RequestMapping(value="/tabla/{nombreTabla}/fecha/{date}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Object> tablaPorFecha(@PathVariable String nombreTabla, @PathVariable String date) throws Exception{
		List<Object> respuesta = new ArrayList<>();
		
		switch (nombreTabla) {
			case NombreTablas.Clientes:
				respuesta = (List)this.clientesService.clientesByFecha(date);
				break;
				
			case NombreTablas.Directorio:
				respuesta = (List)this.directorioService.listDirectorio();
				break;
							
			case NombreTablas.Distribuidores:
				respuesta = (List)this.distribuidoresService.listDistribuidores();
				break;
				
			case NombreTablas.Productos:
				respuesta = (List)this.productosService.listProductos();
				break;
	
			default:
				respuesta.add("Por favor, ingrese los datos de forma correcta.");
				break;
		}
		
		return respuesta;
	}
	
	// =======================================================================================
	
	
	
 
}