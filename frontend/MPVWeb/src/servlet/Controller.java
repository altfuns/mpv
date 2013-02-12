package servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;

import domain.epoca;
import domain.medicion_horizontal;
import domain.proyecto;
import domain.estacion;

/**
 * Session Bean implementation class Controller
 */
@Stateless
@LocalBean
@ManagedBean
public class Controller {

	private String hola;
	private proyecto proyecto_nuevo;
	private epoca epoca1;
	private epoca epoca2;
	private List<estacion> listaestaciones;
	
    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    	hola="saludos";
    	proyecto_nuevo.setLugar("turrialba");
        proyecto_nuevo.setNombre("primera prueba");
        proyecto_nuevo.setRuta_imagen("nose");
        
        epoca1.setProyecto_epoca(proyecto_nuevo);
        epoca1.setFecha(new Date());
        epoca1.setResponsable("juanito");
        epoca1.setLista_mediciones_horizontales(new ArrayList<medicion_horizontal>());
        
        
        epoca2.setProyecto_epoca(proyecto_nuevo);
        epoca2.setFecha(new Date());
        epoca2.setResponsable("juanito");
        epoca2.setLista_mediciones_horizontales(new ArrayList<medicion_horizontal>());
    }
	public String getHola() {
		return hola;
	}
	public void setHola(String hola) {
		this.hola = hola;
	}
    
    

}
