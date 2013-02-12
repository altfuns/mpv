package domain;

import java.util.Date;
import java.util.List;

public class mogi {
	
	epoca epoca_antes;
	epoca epoca_despues;
	Date fecha_calculo;
	Boolean temporal;
	parametros parametros_usuario;
	
	List<iteracion> lista_iteraciones;
	
	public mogi() {
		// TODO Auto-generated constructor stub
	}

	public epoca getEpoca_antes() {
		return epoca_antes;
	}

	public void setEpoca_antes(epoca epoca_antes) {
		this.epoca_antes = epoca_antes;
	}

	public epoca getEpoca_despues() {
		return epoca_despues;
	}

	public void setEpoca_despues(epoca epoca_despues) {
		this.epoca_despues = epoca_despues;
	}

	public Date getFecha_calculo() {
		return fecha_calculo;
	}

	public void setFecha_calculo(Date fecha_calculo) {
		this.fecha_calculo = fecha_calculo;
	}

	public Boolean getTemporal() {
		return temporal;
	}

	public void setTemporal(Boolean temporal) {
		this.temporal = temporal;
	}

	public parametros getParametros_usuario() {
		return parametros_usuario;
	}

	public void setParametros_usuario(parametros parametros_usuario) {
		this.parametros_usuario = parametros_usuario;
	}

	public List<iteracion> getLista_iteraciones() {
		return lista_iteraciones;
	}

	public void setLista_iteraciones(List<iteracion> lista_iteraciones) {
		this.lista_iteraciones = lista_iteraciones;
	}

}
