package domain;

import java.util.ArrayList;
import java.util.List;

public class proyecto {
	
	String nombre;
	String lugar;
	String ruta_imagen;
	
	
	List<epoca> lista_epocas;
	List<estacion> lista_estaciones;
	
	public proyecto() {
		lista_epocas = new ArrayList<epoca>();
		lista_estaciones = new ArrayList<estacion>();
		// TODO Auto-generated constructor stub
	}
	
	


	public List<estacion> getLista_estaciones() {
		return lista_estaciones;
	}



	public void setLista_estaciones(List<estacion> lista_estaciones) {
		this.lista_estaciones = lista_estaciones;
	}



	public List<epoca> getLista_epocas() {
		return lista_epocas;
	}



	public void setLista_epocas(List<epoca> lista_epocas) {
		this.lista_epocas = lista_epocas;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getRuta_imagen() {
		return ruta_imagen;
	}

	public void setRuta_imagen(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}

}
