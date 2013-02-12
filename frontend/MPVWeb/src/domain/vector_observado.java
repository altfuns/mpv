package domain;

public class vector_observado {
		
	Double punto_escalado_x_punto1;
	Double punto_escalado_y_punto1;
	
	Double punto_escalado_x_punto2;
	Double punto_escalado_y_punto2;
	
	Double desplazamiento;
	Double azimut;
	Double chi_cuadrado;
	
	public medicion_horizontal antes;
	public medicion_horizontal despues;
	
	public vector_observado() {
		// TODO Auto-generated constructor stub
	}

	




	public Double getPunto_escalado_x_punto1() {
		return punto_escalado_x_punto1;
	}






	public void setPunto_escalado_x_punto1(Double punto_escalado_x_punto1) {
		this.punto_escalado_x_punto1 = punto_escalado_x_punto1;
	}






	public Double getPunto_escalado_y_punto1() {
		return punto_escalado_y_punto1;
	}






	public void setPunto_escalado_y_punto1(Double punto_escalado_y_punto1) {
		this.punto_escalado_y_punto1 = punto_escalado_y_punto1;
	}






	public Double getPunto_escalado_x_punto2() {
		return punto_escalado_x_punto2;
	}






	public void setPunto_escalado_x_punto2(Double punto_escalado_x_punto2) {
		this.punto_escalado_x_punto2 = punto_escalado_x_punto2;
	}






	public Double getPunto_escalado_y_punto2() {
		return punto_escalado_y_punto2;
	}






	public void setPunto_escalado_y_punto2(Double punto_escalado_y_punto2) {
		this.punto_escalado_y_punto2 = punto_escalado_y_punto2;
	}






	public Double getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public Double getAzimut() {
		return azimut;
	}

	public void setAzimut(Double azimut) {
		this.azimut = azimut;
	}

	public Double getChi_cuadrado() {
		return chi_cuadrado;
	}

	public void setChi_cuadrado(Double chi_cuadrado) {
		this.chi_cuadrado = chi_cuadrado;
	}

	public medicion_horizontal getAntes() {
		return antes;
	}

	public void setAntes(medicion_horizontal antes) {
		this.antes = antes;
	}

	public medicion_horizontal getDespues() {
		return despues;
	}

	public void setDespues(medicion_horizontal despues) {
		this.despues = despues;
	}

}
