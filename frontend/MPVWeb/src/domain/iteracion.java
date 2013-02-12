package domain;

import java.util.List;

public class iteracion {
	
	List<vector_teorico> lista_vectores_teoricos;	
	Double punto_origen_x;
	Double punto_origen_y;
	Double distancia_radial;
	Double radio;
	Double cambio_presion;
	Double profundidad;
	Double suma_chi_cuadrado_vertical;
	Double suma_chi_cuadrado_horizontal;
	
	public iteracion() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Double getDistancia_radial() {
		return distancia_radial;
	}



	public void setDistancia_radial(Double distancia_radial) {
		this.distancia_radial = distancia_radial;
	}



	public List<vector_teorico> getLista_vectores_teoricos() {
		return lista_vectores_teoricos;
	}

	public void setLista_vectores_teoricos(
			List<vector_teorico> lista_vectores_teoricos) {
		this.lista_vectores_teoricos = lista_vectores_teoricos;
	}

	public Double getPunto_origen_x() {
		return punto_origen_x;
	}

	public void setPunto_origen_x(Double punto_origen_x) {
		this.punto_origen_x = punto_origen_x;
	}

	public Double getPunto_origen_y() {
		return punto_origen_y;
	}

	public void setPunto_origen_y(Double punto_origen_y) {
		this.punto_origen_y = punto_origen_y;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getCambio_presion() {
		return cambio_presion;
	}

	public void setCambio_presion(Double cambio_presion) {
		this.cambio_presion = cambio_presion;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}



	public Double getSuma_chi_cuadrado_vertical() {
		return suma_chi_cuadrado_vertical;
	}



	public void setSuma_chi_cuadrado_vertical(Double suma_chi_cuadrado_vertical) {
		this.suma_chi_cuadrado_vertical = suma_chi_cuadrado_vertical;
	}



	public Double getSuma_chi_cuadrado_horizontal() {
		return suma_chi_cuadrado_horizontal;
	}



	public void setSuma_chi_cuadrado_horizontal(Double suma_chi_cuadrado_horizontal) {
		this.suma_chi_cuadrado_horizontal = suma_chi_cuadrado_horizontal;
	}

	
	public Double getSuma_chi_cuadrado_total() {
		return suma_chi_cuadrado_horizontal +  suma_chi_cuadrado_vertical;
	}

}
