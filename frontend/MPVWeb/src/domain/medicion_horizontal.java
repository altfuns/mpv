package domain;

public class medicion_horizontal {	
	Double grados_decimales_latitud;
	Double km_totales_latitud;	
	Boolean hemisferio_este;// está en positivo?
	Double punto_y;
	
	Double grados_decimales_longitud;
	Double km_totales_longitud;
	Boolean hemisferio_norte;// está en positivo?
	Double punto_x;
	
	public epoca epoca_medicion;
	public estacion estacion_medicion;
	
	public medicion_horizontal() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Double getPunto_y() {
		return punto_y;
	}



	public void setPunto_y(Double punto_y) {
		this.punto_y = punto_y;
	}



	public Double getPunto_x() {
		return punto_x;
	}



	public void setPunto_x(Double punto_x) {
		this.punto_x = punto_x;
	}



	public Double getGrados_decimales_latitud() {
		return grados_decimales_latitud;
	}
	public Double getGrados_decimales_latitud_valor_absoluto() {
		return Math.abs(grados_decimales_latitud);
	}
	public void setGrados_decimales_latitud(Double grados_decimales_latitud) {
		this.grados_decimales_latitud = grados_decimales_latitud;
	}
	public Double getKm_totales_latitud() {
		return km_totales_latitud;
	}
	public void setKm_totales_latitud(Double km_totales_latitud) {
		this.km_totales_latitud = km_totales_latitud;
	}
	public Boolean getHemisferio_este() {
		return hemisferio_este;
	}
	public void setHemisferio_este(Boolean hemisferio_este) {
		this.hemisferio_este = hemisferio_este;
	}
	public Double getGrados_decimales_longitud() {
		return grados_decimales_longitud;
	}
	public Double getGrados_decimales_longitud_valor_absoluto() {
		return Math.abs(grados_decimales_longitud);
	}
	public void setGrados_decimales_longitud(Double grados_decimales_longitud) {
		this.grados_decimales_longitud = grados_decimales_longitud;
	}
	public Double getKm_totales_longitud() {
		return km_totales_longitud;
	}
	public void setKm_totales_longitud(Double km_totales_longitud) {
		this.km_totales_longitud = km_totales_longitud;
	}
	public Boolean getHemisferio_norte() {
		return hemisferio_norte;
	}
	public void setHemisferio_norte(Boolean hemisferio_norte) {
		this.hemisferio_norte = hemisferio_norte;
	}
	public epoca getEpoca_medicion() {
		return epoca_medicion;
	}
	public void setEpoca_medicion(epoca epoca_medicion) {
		this.epoca_medicion = epoca_medicion;
	}
	public estacion getEstacion_medicion() {
		return estacion_medicion;
	}
	public void setEstacion_medicion(estacion estacion_medicion) {
		this.estacion_medicion = estacion_medicion;
	}
	
	
}
