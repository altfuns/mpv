package servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.*;

/**
 * Servlet implementation class paso1
 */
@WebServlet("/paso1")
public class paso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paso1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    PrintWriter out = response.getWriter();
	    
	    out.println("<html><head><title>" +
                "Hello World!</title>" );
               
	    
	    proyecto proyecto_nuevo  = new proyecto();
	    proyecto_nuevo.setLugar("turrialba");
	    proyecto_nuevo.setNombre("primera prueba");
	    proyecto_nuevo.setRuta_imagen("nose");
	    
	    epoca epoca1= new epoca();
	    epoca1.setProyecto_epoca(proyecto_nuevo);
	    epoca1.setFecha(new Date());
	    epoca1.setResponsable("juanito");
	    
	    epoca epoca2= new epoca();
	    epoca2.setProyecto_epoca(proyecto_nuevo);
	    epoca2.setFecha(new Date());
	    epoca2.setResponsable("juanito");	    
	    
	    estacion estacion1 = new estacion();
	    estacion1.setNombre("estacion1");
	    estacion1.setNumero(1);
	    estacion1.setProyecto_estacion(proyecto_nuevo);
	    
	    medicion medicion1= new medicion();
	    medicion1.setEpoca_medicion(epoca1);
	    medicion1.setEstacion_medicion(estacion1);	    
	    medicion1.setGrados_lat(83);//10.015975, -83.761418
	    medicion1.setMinutos_lat(8);//45
	    medicion1.setSegundos_lat(30);//40	    
	    medicion1.setGrados_long(10);
	    medicion1.setMinutos_long(15);//1
	    medicion1.setSegundos_long(25);//33
	    medicion1.setHemisferio_este(false);
	    medicion1.setHemisferio_norte(true);
	    
	    medicion medicion2= new medicion();
	    medicion2.setEpoca_medicion(epoca2);
	    medicion2.setEstacion_medicion(estacion1);	  //10.015891,-83.761311  
	    medicion2.setGrados_lat(84);
	    medicion2.setMinutos_lat(8);//
	    medicion2.setSegundos_lat(50);//
	    medicion2.setGrados_long(10);
	    medicion2.setMinutos_long(15);
	    medicion2.setSegundos_long(40);
	    medicion2.setHemisferio_este(false);
	    medicion2.setHemisferio_norte(true);    
	    
	    estacion estacion2 = new estacion();
	    estacion2.setNombre("estacion2");
	    estacion2.setNumero(2);
	    estacion2.setProyecto_estacion(proyecto_nuevo);
	    
	    medicion medicion3= new medicion();
	    medicion3.setEpoca_medicion(epoca1);
	    medicion3.setEstacion_medicion(estacion2);	    
	    medicion3.setGrados_lat(84);//10.022272,-83.756375
	    medicion3.setMinutos_lat(7);
	    medicion3.setSegundos_lat(55);	    
	    medicion3.setGrados_long(10);
	    medicion3.setMinutos_long(13);
	    medicion3.setSegundos_long(50);
	    medicion3.setHemisferio_este(false);
	    medicion3.setHemisferio_norte(true);
	    
	    medicion medicion4= new medicion();
	    medicion4.setEpoca_medicion(epoca2);
	    medicion4.setEstacion_medicion(estacion2);	    
	    medicion4.setGrados_lat(84);//10.022568,-83.755774
	    medicion4.setMinutos_lat(7);
	    medicion4.setSegundos_lat(59);	    
	    medicion4.setGrados_long(10);
	    medicion4.setMinutos_long(13);
	    medicion4.setSegundos_long(55);	
	    medicion4.setHemisferio_este(false);
	    medicion4.setHemisferio_norte(true);
	    
	    estacion estacion3 = new estacion();
	    estacion3.setNombre("estacion3");
	    estacion3.setNumero(3);
	    estacion3.setProyecto_estacion(proyecto_nuevo);
	    
	    medicion medicion5= new medicion();
	    medicion5.setEpoca_medicion(epoca1);
	    medicion5.setEstacion_medicion(estacion3);	    
	    medicion5.setGrados_lat(84);//10.027048,-83.763585
	    medicion5.setMinutos_lat(7);
	    medicion5.setSegundos_lat(10);	    
	    medicion5.setGrados_long(10);
	    medicion5.setMinutos_long(4);
	    medicion5.setSegundos_long(30);
	    medicion5.setHemisferio_este(false);
	    medicion5.setHemisferio_norte(true);
	    
	    medicion medicion6= new medicion();
	    medicion6.setEpoca_medicion(epoca2);
	    medicion6.setEstacion_medicion(estacion3);	    
	    medicion6.setGrados_lat(84);//10.027724,-83.763993
	    medicion6.setMinutos_lat(7);
	    medicion6.setSegundos_lat(16);	    
	    medicion6.setGrados_long(10);
	    medicion6.setMinutos_long(4);
	    medicion6.setSegundos_long(35);
	    medicion6.setHemisferio_este(false);
	    medicion6.setHemisferio_norte(true);
	    
	    
	    estacion estacion4 = new estacion();
	    estacion4.setNombre("estacion4");
	    estacion4.setNumero(4);
	    estacion4.setProyecto_estacion(proyecto_nuevo);
	    
	    medicion medicion7= new medicion();
	    medicion7.setEpoca_medicion(epoca1);
	    medicion7.setEstacion_medicion(estacion4);	    
	    medicion7.setGrados_lat(84);//10.022758,-83.766868
	    medicion7.setMinutos_lat(6);
	    medicion7.setSegundos_lat(21);	    
	    medicion7.setGrados_long(10);
	    medicion7.setMinutos_long(11);
	    medicion7.setSegundos_long(5);
	    medicion7.setHemisferio_este(false);
	    medicion7.setHemisferio_norte(true);
	    
	    medicion medicion8= new medicion();
	    medicion8.setEpoca_medicion(epoca2);
	    medicion8.setEstacion_medicion(estacion4);	    
	    medicion8.setGrados_lat(84);//10.022948,-83.767319
	    medicion8.setMinutos_lat(6);
	    medicion8.setSegundos_lat(46);	    
	    medicion8.setGrados_long(10);
	    medicion8.setMinutos_long(11);
	    medicion8.setSegundos_long(9);
	    medicion8.setHemisferio_este(false);
	    medicion8.setHemisferio_norte(true);
	    
	    estacion1.getLista_mediciones().add(medicion1);
	    estacion1.getLista_mediciones().add(medicion2);

	    estacion2.getLista_mediciones().add(medicion3);
	    estacion2.getLista_mediciones().add(medicion4);
	    
	    estacion3.getLista_mediciones().add(medicion5);
	    estacion3.getLista_mediciones().add(medicion6);
	    
	    estacion4.getLista_mediciones().add(medicion7);
	    estacion4.getLista_mediciones().add(medicion8);
	    
	    epoca1.getLista_mediciones().add(medicion1);
	    epoca2.getLista_mediciones().add(medicion2);
	    
	    epoca1.getLista_mediciones().add(medicion3);
	    epoca2.getLista_mediciones().add(medicion4);
	    
	    epoca1.getLista_mediciones().add(medicion5);
	    epoca2.getLista_mediciones().add(medicion6);
	    
	    epoca1.getLista_mediciones().add(medicion7);
	    epoca2.getLista_mediciones().add(medicion8);
	    
	    proyecto_nuevo.getLista_estaciones().add(estacion1);
	    proyecto_nuevo.getLista_estaciones().add(estacion2);
	    proyecto_nuevo.getLista_estaciones().add(estacion3);
	    proyecto_nuevo.getLista_estaciones().add(estacion4);
	    
	    proyecto_nuevo.getLista_epocas().add(epoca1);
	    proyecto_nuevo.getLista_epocas().add(epoca2);
	    
	    //////////////////////////////////////////////////////////////////////////////////////////////
	    //digamos q elijo la epoca1 y epoca2 de este proyecto
	    
	    mogi modelo = new mogi();
	    modelo.setEpoca_antes(epoca1);
	    modelo.setEpoca_despues(epoca2);
	    modelo.setFecha_calculo(new Date());
	    modelo.setTemporal(true);
	    parametros parametros_proyecto = new parametros();
	    modelo.setParametros_usuario(parametros_proyecto);
	    
	    List<medicion> lista_mediciones_epoca_antes = modelo.getEpoca_antes().getLista_mediciones();
	    List<medicion> lista_mediciones_epoca_despues = modelo.getEpoca_despues().getLista_mediciones();
	    
	    //averiguo las coordenadas menores en lat y long
	    Integer menor_segundos_lat_epoca1 = lista_mediciones_epoca_antes.get(0).getTotal_segundos_lat();
	    Integer menor_segundos_long_epoca1 = lista_mediciones_epoca_antes.get(0).getTotal_segundos_lat();
	    Integer mayor_segundos_lat_epoca1 = 0;
	    Integer mayor_segundos_long_epoca1 = 0;
	    for (medicion medicion : lista_mediciones_epoca_antes) {	    	
			if(medicion.getTotal_segundos_lat() < menor_segundos_lat_epoca1)
				menor_segundos_lat_epoca1 = medicion.getTotal_segundos_lat();
			if(medicion.getTotal_segundos_long() < menor_segundos_long_epoca1)
				menor_segundos_long_epoca1 = medicion.getTotal_segundos_long();
			
			if(medicion.getTotal_segundos_lat() > mayor_segundos_lat_epoca1)
				mayor_segundos_lat_epoca1 = medicion.getTotal_segundos_lat();
			if(medicion.getTotal_segundos_long() > mayor_segundos_long_epoca1)
				mayor_segundos_long_epoca1 = medicion.getTotal_segundos_long();
		}
	    
	        
	  //averiguo las coordenadas menores en lat y long p
	    Integer menor_segundos_lat_epoca2 = lista_mediciones_epoca_despues.get(0).getTotal_segundos_lat();
	    Integer menor_segundos_long_epoca2 = lista_mediciones_epoca_despues.get(0).getTotal_segundos_long();
	    Integer mayor_segundos_lat_epoca2 = 0;
	    Integer mayor_segundos_long_epoca2 = 0;
	    for (medicion medicion : lista_mediciones_epoca_despues) {	    	
			if(medicion.getTotal_segundos_lat() < menor_segundos_lat_epoca2)
				menor_segundos_lat_epoca2 = medicion.getTotal_segundos_lat();
			if(medicion.getTotal_segundos_long() < menor_segundos_long_epoca2)
				menor_segundos_long_epoca2 = medicion.getTotal_segundos_long();
			
			if(medicion.getTotal_segundos_lat() > mayor_segundos_lat_epoca2)
				mayor_segundos_lat_epoca2 = medicion.getTotal_segundos_lat();
			if(medicion.getTotal_segundos_long() > mayor_segundos_long_epoca2)
				mayor_segundos_long_epoca2 = medicion.getTotal_segundos_long();
		}
	    
	    
	    //establezco el tamaño del cuadrante en x y y 
	    //pensando que las medidas de la segunda epoca son mas grandes
	    parametros_proyecto.setMenor_medida_x(menor_segundos_lat_epoca1<menor_segundos_lat_epoca2?menor_segundos_lat_epoca1 : menor_segundos_lat_epoca2);
	    parametros_proyecto.setMayor_medida_x(mayor_segundos_lat_epoca1<mayor_segundos_lat_epoca2?mayor_segundos_lat_epoca1 : mayor_segundos_lat_epoca2);
	    
	    parametros_proyecto.setMenor_medida_y(menor_segundos_lat_epoca1<menor_segundos_long_epoca2?menor_segundos_lat_epoca1 : menor_segundos_long_epoca2);
	    parametros_proyecto.setMayor_medida_y(mayor_segundos_lat_epoca1<mayor_segundos_long_epoca2?mayor_segundos_lat_epoca1 : mayor_segundos_long_epoca2);
	    
	    
	    out.println("menor x : "+parametros_proyecto.getMenor_medida_x());
	    out.println("menor y : "+parametros_proyecto.getMenor_medida_y());
	    out.println("mayor x : "+parametros_proyecto.getMayor_medida_x());
	    out.println("mayor y : "+parametros_proyecto.getMayor_medida_y());
	    ///////////////creo el cuadrante y los puntos de los vectores observados
	    
	    
	    Integer tam_canvas_x = parametros_proyecto.getMayor_medida_x() - parametros_proyecto.getMenor_medida_x();
	    Integer tam_canvas_y = parametros_proyecto.getMayor_medida_y() - parametros_proyecto.getMenor_medida_y();
	    
	    
	    
	    
	    out.println("</head>");
	    
	    out.println("<body>");
	    
	    
	    out.println("<canvas id='myCanvas' width='800' height='800' style='border:1px solid #000000;'></canvas>");
	    
	    
//	    out.println("<table>" +
//               "<tr><th>x</th><th>y</th></tr>");
//	    
//	    tomo las medidas de una epoca...y las de otra en una misma estacion y hago el vector
//	    
//	    List<vector_observado> lista_vectores_observados=  new ArrayList<vector_observado>();
//	    for (medicion medicion_antes : lista_mediciones_epoca_antes) {	    	
//	    	for (medicion medicion_despues : lista_mediciones_epoca_despues) {
//				if(medicion_antes.getEstacion_medicion() == medicion_despues.getEstacion_medicion()){
//					vector_observado vector1 = new vector_observado();
//					vector1.setAntes(medicion_antes);
//					vector1.setDespues(medicion_despues);
//					
//					//tomando en cuenta q estamos en el cuadrante noroeste
//					vector1.setPunto_escalado_x_punto1(medicion_antes.getTotal_segundos_lat()-parametros_proyecto.getMenor_medida_x());
//					vector1.setPunto_escalado_x_punto2(medicion_despues.getTotal_segundos_lat()-parametros_proyecto.getMenor_medida_x());
//					vector1.setPunto_escalado_y_punto1(medicion_antes.getTotal_segundos_long()-parametros_proyecto.getMenor_medida_y());
//					vector1.setPunto_escalado_y_punto2(medicion_despues.getTotal_segundos_long()-parametros_proyecto.getMenor_medida_y());
//					
//					out.println("<tr><td>"+vector1.getPunto_escalado_x_punto1() +"</th><th>"+ vector1.getPunto_escalado_y_punto1()  +"</td></tr>");
//					out.println("<tr><td>"+vector1.getPunto_escalado_x_punto2() +"</th><th>"+ vector1.getPunto_escalado_y_punto2()  +"</td></tr>");
//				
//					lista_vectores_observados.add(vector1);
//				}
//					
//	    	}
//		}
//	    
//	    	    
//	    out.println("</table><h1>Hello World!</h1>");
	    
	    
	    out.println("" +
	    		"<script type='text/javascript'>   " +
	    		"var c=document.getElementById('myCanvas');"+
			    "var ctx=c.getContext('2d');");
//	    
//	    
//	    for (vector_observado vector1 : lista_vectores_observados) {
//	    	out.println("ctx.moveTo("+vector1.getPunto_escalado_x_punto1()+","+vector1.getPunto_escalado_y_punto1()+");");
//			 out.println("ctx.lineTo("+vector1.getPunto_escalado_x_punto2()+","+vector1.getPunto_escalado_y_punto2()+");");
//			 out.println("ctx.stroke();");
//		}
	    
	    out.println("</script>");
	    
	    
	    
	    
	    out.println("</body></html>");
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
