package domain;

public class vector_teorico {
	
	vector_observado vector;
	Double desplazamiento;
	Double punto_escalado_x;
	Double punto_escalado_y;
	Double azimut;
	Double chi_cuadrado;
	
	
	public vector_teorico() {
		// TODO Auto-generated constructor stub
	}


	public vector_observado getVector() {
		return vector;
	}


	public void setVector(vector_observado vector) {
		this.vector = vector;
	}


	public Double getDesplazamiento() {
		return desplazamiento;
	}


	public void setDesplazamiento(Double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}


	public Double getPunto_escalado_x() {
		return punto_escalado_x;
	}


	public void setPunto_escalado_x(Double punto_escalado_x) {
		this.punto_escalado_x = punto_escalado_x;
	}


	public Double getPunto_escalado_y() {
		return punto_escalado_y;
	}


	public void setPunto_escalado_y(Double punto_escalado_y) {
		this.punto_escalado_y = punto_escalado_y;
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

}
