package domain;

import java.util.ArrayList;
import java.util.List;

public class estacion {
	
	Integer numero;
	String nombre;	
	public proyecto proyecto_estacion;
	
	List<medicion> lista_mediciones;
	
	public estacion() {
		lista_mediciones = new ArrayList<medicion>();
		// TODO Auto-generated constructor stub
	}
	
	

	public List<medicion> getLista_mediciones() {
		return lista_mediciones;
	}



	public void setLista_mediciones(List<medicion> lista_mediciones) {
		this.lista_mediciones = lista_mediciones;
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public proyecto getProyecto_estacion() {
		return proyecto_estacion;
	}

	public void setProyecto_estacion(proyecto proyecto_estacion) {
		this.proyecto_estacion = proyecto_estacion;
	}

}
