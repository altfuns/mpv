package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class epoca {
	
	Date fecha;
	String responsable;
	
	proyecto proyecto_epoca;
	
	Double tamanyo_minimo_lat;
	Double tamanyo_minimo_long;
	
	List<medicion> lista_mediciones;
	
	List<medicion_horizontal> lista_mediciones_horizontales;
	
	
	public epoca() {
		
		lista_mediciones=  new ArrayList<medicion>();
		
		// TODO Auto-generated constructor stub
	}
	
	


	public List<medicion_horizontal> getLista_mediciones_horizontales() {
		return lista_mediciones_horizontales;
	}




	public void setLista_mediciones_horizontales(
			List<medicion_horizontal> lista_mediciones_horizontales) {
		this.lista_mediciones_horizontales = lista_mediciones_horizontales;
	}




	public List<medicion> getLista_mediciones() {
		return lista_mediciones;
	}

	public void setLista_mediciones(List<medicion> lista_mediciones) {
		this.lista_mediciones = lista_mediciones;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getResponsable() {
		return responsable;
	}


	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}


	public proyecto getProyecto_epoca() {
		return proyecto_epoca;
	}


	public void setProyecto_epoca(proyecto proyecto_epoca) {
		this.proyecto_epoca = proyecto_epoca;
	}


	public Double getTamanyo_minimo_lat() {
		return tamanyo_minimo_lat;
	}


	public void setTamanyo_minimo_lat(Double tamanyo_minimo_lat) {
		this.tamanyo_minimo_lat = tamanyo_minimo_lat;
	}


	public Double getTamanyo_minimo_long() {
		return tamanyo_minimo_long;
	}


	public void setTamanyo_minimo_long(Double tamanyo_minimo_long) {
		this.tamanyo_minimo_long = tamanyo_minimo_long;
	}
	
	

}
