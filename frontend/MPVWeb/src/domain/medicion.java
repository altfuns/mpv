package domain;

public class medicion {
	
	Integer grados_lat;
	Integer minutos_lat;
	Integer segundos_lat;
	Integer total_segundos_lat;
	
	Boolean hemisferio_este;
	
	Integer grados_long;
	Integer minutos_long;
	Integer segundos_long;
	Integer total_segundos_long;
	
	Boolean hemisferio_norte;
	
	public epoca epoca_medicion;
	public estacion estacion_medicion;
	
	
public medicion() {
	// TODO Auto-generated constructor stub
}


public Integer getGrados_lat() {
	return grados_lat;
}


public void setGrados_lat(Integer grados_lat) {
	this.grados_lat = grados_lat;
}


public Integer getMinutos_lat() {
	return minutos_lat;
}


public void setMinutos_lat(Integer minutos_lat) {
	this.minutos_lat = minutos_lat;
}


public Integer getSegundos_lat() {
	return segundos_lat;
}


public void setSegundos_lat(Integer segundos_lat) {
	this.segundos_lat = segundos_lat;
}


public Integer getTotal_segundos_lat() {
	
	total_segundos_lat = 0;	
	total_segundos_lat += segundos_lat;
	total_segundos_lat += minutos_lat * 60;
	total_segundos_lat += grados_lat * 60;
	
	return total_segundos_lat;
}


public void setTotal_segundos_lat(Integer total_segundos_lat) {
	this.total_segundos_lat = total_segundos_lat;
}





public Integer getGrados_long() {
	return grados_long;
}


public void setGrados_long(Integer grados_long) {
	this.grados_long = grados_long;
}


public Integer getMinutos_long() {
	return minutos_long;
}


public void setMinutos_long(Integer minutos_long) {
	this.minutos_long = minutos_long;
}


public Integer getSegundos_long() {
	return segundos_long;
}


public void setSegundos_long(Integer segundos_long) {
	this.segundos_long = segundos_long;
}


public Integer getTotal_segundos_long() {
	
	total_segundos_long = 0;	
	total_segundos_long += segundos_long;
	total_segundos_long += minutos_long * 60;
	total_segundos_long += grados_long * 60;
	
	return total_segundos_long;
}


public void setTotal_segundos_long(Integer total_segundos_long) {
	this.total_segundos_long = total_segundos_long;
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


public Boolean getHemisferio_este() {
	return hemisferio_este;
}


public void setHemisferio_este(Boolean hemisferio_este) {
	this.hemisferio_este = hemisferio_este;
}


public Boolean getHemisferio_norte() {
	return hemisferio_norte;
}


public void setHemisferio_norte(Boolean hemisferio_norte) {
	this.hemisferio_norte = hemisferio_norte;
}


	

}
