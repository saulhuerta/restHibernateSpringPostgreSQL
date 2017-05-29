# SpringRestfulWebServices

## Compilar
El proyecto utiliza Maven como herramienta de construcción, por lo que bastará con que descargue una copia de este proyecto y posteriormente construirla nuevamente con los goals: clean install

Maven se encargará de gestionar los recursos y descargará las librerías que hicieran falta.

## Desplegar
Se asume que este proyecto se ejecuta de manera natural en Tomcat8.


## Rutas:

Req 1:
	Consultar todos los registros por tabla (regresa como respuesta un JSON de la tabla)

	http://localhost:8080/SpringRestful/consultar/tabla/clientes
	
	http://localhost:8080/SpringRestful/consultar/tabla/distribuidores
	
	http://localhost:8080/SpringRestful/consultar/tabla/directorio
	
	http://localhost:8080/SpringRestful/consultar/tabla/productos
	

	Consultar todos los registros de todas las tablas (regresa como respuesta un JSON del contenido de todas las tablas)

	
	http://localhost:8080/SpringRestful/consultar/tabla/clientes
	
	http://localhost:8080/SpringRestful/consultar/tabla/distribuidores
	
	http://localhost:8080/SpringRestful/consultar/tabla/directorio
	
	http://localhost:8080/SpringRestful/consultar/tabla/productos
	

	Consultar todos los registros de todas las tablas (regresa como respuesta un JSON del contenido de todas las tablas)
	
	http://localhost:8080/SpringRestful/consultar/tablas


Req 2:
	Consultar registros de una tabla en especifico por fecha (regresa como respuesta un JSON de la tabla)

	http://localhost:8080/SpringRestful/consultar/tabla/clientes/{fecha}
	
	http://localhost:8080/SpringRestful/consultar/tabla/distribuidores/{fecha}
	
	http://localhost:8080/SpringRestful/consultar/tabla/directorio/{fecha}
	
	http://localhost:8080/SpringRestful/consultar/tabla/productos/{fecha}
	


	#Fecha en formato: dd-MM-YYY   (17-04-2011)
