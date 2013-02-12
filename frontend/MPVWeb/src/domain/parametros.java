package domain;

public class parametros {
	
	Double constante_shearModulus; //30 gpa
	Double constante_radio_desde; //0.5 km 
	Double constante_radio_hasta; //1 km
	
	Double profundidad_desde; //3 km
	Double profundidad_hasta; //10 km
	
	Double cambioPresion_desde; //10 mpa
	Double cambioPresion_hasta; //40 mpa
	
	Double km_por_grado_latitud;
	Double km_por_grado_longitud;
	
	Integer menor_medida_x;
	Integer mayor_medida_x;
	Integer menor_medida_y;
	Integer mayor_medida_y;
	//cantidad de puntos escalados por ejemplo se saca que 
	//segun las epocas elegidas se forma un plano de 3km por 3km
	//como mínimo segun la distancia de las estaciones
	//y esto escalado nos dan 50 puntos en x y 50 puntos en y
	//lo anterior para saber en cuales puntos se va a considerar la fuente.
	
	public parametros() {	
		constante_shearModulus = 30.0;
		constante_radio_desde = 0.5;
		constante_radio_hasta = 1.0;
		
		profundidad_desde = 3.0;
		profundidad_hasta = 10.0;
		
		cambioPresion_desde = 10.0;
		cambioPresion_hasta = 40.0;
		
		km_por_grado_latitud = 111.12;
		km_por_grado_longitud = 109.4;
		
		// TODO Auto-generated constructor stub
	}

	public Double getConstante_shearModulus() {
		return constante_shearModulus;
	}

	public void setConstante_shearModulus(Double constante_shearModulus) {
		this.constante_shearModulus = constante_shearModulus;
	}

	public Double getConstante_radio_desde() {
		return constante_radio_desde;
	}

	public void setConstante_radio_desde(Double constante_radio_desde) {
		this.constante_radio_desde = constante_radio_desde;
	}

	public Double getConstante_radio_hasta() {
		return constante_radio_hasta;
	}

	public void setConstante_radio_hasta(Double constante_radio_hasta) {
		this.constante_radio_hasta = constante_radio_hasta;
	}

	public Double getProfundidad_desde() {
		return profundidad_desde;
	}

	public void setProfundidad_desde(Double profundidad_desde) {
		this.profundidad_desde = profundidad_desde;
	}

	public Double getProfundidad_hasta() {
		return profundidad_hasta;
	}

	public void setProfundidad_hasta(Double profundidad_hasta) {
		this.profundidad_hasta = profundidad_hasta;
	}

	public Double getCambioPresion_desde() {
		return cambioPresion_desde;
	}

	public void setCambioPresion_desde(Double cambioPresion_desde) {
		this.cambioPresion_desde = cambioPresion_desde;
	}

	public Double getCambioPresion_hasta() {
		return cambioPresion_hasta;
	}

	public void setCambioPresion_hasta(Double cambioPresion_hasta) {
		this.cambioPresion_hasta = cambioPresion_hasta;
	}

	public Double getKm_por_grado_latitud() {
		return km_por_grado_latitud;
	}

	public void setKm_por_grado_latitud(Double km_por_grado_latitud) {
		this.km_por_grado_latitud = km_por_grado_latitud;
	}

	public Double getKm_por_grado_longitud() {
		return km_por_grado_longitud;
	}

	public void setKm_por_grado_longitud(Double km_por_grado_longitud) {
		this.km_por_grado_longitud = km_por_grado_longitud;
	}

	public Integer getMenor_medida_x() {
		return menor_medida_x;
	}

	public void setMenor_medida_x(Integer menor_medida_x) {
		this.menor_medida_x = menor_medida_x;
	}

	public Integer getMayor_medida_x() {
		return mayor_medida_x;
	}

	public void setMayor_medida_x(Integer mayor_medida_x) {
		this.mayor_medida_x = mayor_medida_x;
	}

	public Integer getMenor_medida_y() {
		return menor_medida_y;
	}

	public void setMenor_medida_y(Integer menor_medida_y) {
		this.menor_medida_y = menor_medida_y;
	}

	public Integer getMayor_medida_y() {
		return mayor_medida_y;
	}

	public void setMayor_medida_y(Integer mayor_medida_y) {
		this.mayor_medida_y = mayor_medida_y;
	}

	

	
	
}
