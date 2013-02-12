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
 * Servlet implementation class paso2
 */
@WebServlet("/paso2")
public class paso2 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public paso2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter out = response.getWriter();

        out.println("<html><head><title>"
                + "Hello World!</title>");


        proyecto proyecto_nuevo = new proyecto();
        proyecto_nuevo.setLugar("turrialba");
        proyecto_nuevo.setNombre("primera prueba");
        proyecto_nuevo.setRuta_imagen("nose");

        epoca epoca1 = new epoca();
        epoca1.setProyecto_epoca(proyecto_nuevo);
        epoca1.setFecha(new Date());
        epoca1.setResponsable("juanito");
        epoca1.setLista_mediciones_horizontales(new ArrayList<medicion_horizontal>());

        epoca epoca2 = new epoca();
        epoca2.setProyecto_epoca(proyecto_nuevo);
        epoca2.setFecha(new Date());
        epoca2.setResponsable("juanito");
        epoca2.setLista_mediciones_horizontales(new ArrayList<medicion_horizontal>());

        estacion estacion1 = new estacion();
        estacion1.setNombre("estacion1");
        estacion1.setNumero(1);
        estacion1.setProyecto_estacion(proyecto_nuevo);

        medicion_horizontal medicion1 = new medicion_horizontal();
        medicion1.setEpoca_medicion(epoca1);
        medicion1.setEstacion_medicion(estacion1);	    //10.015975, -83.761418
        medicion1.setGrados_decimales_latitud(10.015975);
        medicion1.setGrados_decimales_longitud(-83.761418);
        medicion1.setHemisferio_este(false);
        medicion1.setHemisferio_norte(true);

        medicion_horizontal medicion2 = new medicion_horizontal();
        medicion2.setEpoca_medicion(epoca2);
        medicion2.setEstacion_medicion(estacion1);	  //10.015891,-83.761311 
        medicion2.setGrados_decimales_latitud(10.015891);
        medicion2.setGrados_decimales_longitud(-83.761311);
        medicion2.setHemisferio_este(false);
        medicion2.setHemisferio_norte(true);

        estacion estacion2 = new estacion();
        estacion2.setNombre("estacion2");
        estacion2.setNumero(2);
        estacion2.setProyecto_estacion(proyecto_nuevo);

        medicion_horizontal medicion3 = new medicion_horizontal();
        medicion3.setEpoca_medicion(epoca1);
        medicion3.setEstacion_medicion(estacion2);//10.022272,-83.756375
        medicion3.setGrados_decimales_latitud(10.022272);
        medicion3.setGrados_decimales_longitud(-83.756375);
        medicion3.setHemisferio_este(false);
        medicion3.setHemisferio_norte(true);

        medicion_horizontal medicion4 = new medicion_horizontal();
        medicion4.setEpoca_medicion(epoca2);
        medicion4.setEstacion_medicion(estacion2); //10.022568,-83.755774
        medicion4.setGrados_decimales_latitud(10.022568);
        medicion4.setGrados_decimales_longitud(-83.755774);
        medicion4.setHemisferio_este(false);
        medicion4.setHemisferio_norte(true);

        estacion estacion3 = new estacion();
        estacion3.setNombre("estacion3");
        estacion3.setNumero(3);
        estacion3.setProyecto_estacion(proyecto_nuevo);

        medicion_horizontal medicion5 = new medicion_horizontal();
        medicion5.setEpoca_medicion(epoca1);
        medicion5.setEstacion_medicion(estacion3); //10.027048,-83.763585
        medicion5.setGrados_decimales_latitud(10.027048);
        medicion5.setGrados_decimales_longitud(-83.763585);
        medicion5.setHemisferio_este(false);
        medicion5.setHemisferio_norte(true);

        medicion_horizontal medicion6 = new medicion_horizontal();
        medicion6.setEpoca_medicion(epoca2);
        medicion6.setEstacion_medicion(estacion3); //10.027724,-83.763993
        medicion6.setGrados_decimales_latitud(10.027724);
        medicion6.setGrados_decimales_longitud(-83.763993);
        medicion6.setHemisferio_este(false);
        medicion6.setHemisferio_norte(true);


        estacion estacion4 = new estacion();
        estacion4.setNombre("estacion4");
        estacion4.setNumero(4);
        estacion4.setProyecto_estacion(proyecto_nuevo);

        medicion_horizontal medicion7 = new medicion_horizontal();
        medicion7.setEpoca_medicion(epoca1);
        medicion7.setEstacion_medicion(estacion4); //10.022758,-83.766868
        medicion7.setGrados_decimales_latitud(10.022758);
        medicion7.setGrados_decimales_longitud(-83.766868);
        medicion7.setHemisferio_este(false);
        medicion7.setHemisferio_norte(true);

        medicion_horizontal medicion8 = new medicion_horizontal();
        medicion8.setEpoca_medicion(epoca2);
        medicion8.setEstacion_medicion(estacion4);//10.022948,-83.767319
        medicion8.setGrados_decimales_latitud(10.022948);
        medicion8.setGrados_decimales_longitud(-83.767319);
        medicion8.setHemisferio_este(false);
        medicion8.setHemisferio_norte(true);

        epoca1.getLista_mediciones_horizontales().add(medicion1);
        epoca2.getLista_mediciones_horizontales().add(medicion2);

        epoca1.getLista_mediciones_horizontales().add(medicion3);
        epoca2.getLista_mediciones_horizontales().add(medicion4);

        epoca1.getLista_mediciones_horizontales().add(medicion5);
        epoca2.getLista_mediciones_horizontales().add(medicion6);

        epoca1.getLista_mediciones_horizontales().add(medicion7);
        epoca2.getLista_mediciones_horizontales().add(medicion8);


        //////////////////////////////////////////////////////////////////////////////////////////////
        //digamos q elijo la epoca1 y epoca2 de este proyecto

        mogi modelo = new mogi();
        modelo.setEpoca_antes(epoca1);
        modelo.setEpoca_despues(epoca2);
        modelo.setFecha_calculo(new Date());
        modelo.setTemporal(true);
        parametros parametros_proyecto = new parametros();
        modelo.setParametros_usuario(parametros_proyecto);

        List<medicion_horizontal> lista_mediciones_epoca_antes = modelo.getEpoca_antes().getLista_mediciones_horizontales();
        List<medicion_horizontal> lista_mediciones_epoca_despues = modelo.getEpoca_despues().getLista_mediciones_horizontales();



        //seteo los km que representan las coordenadas
        for (medicion_horizontal medicion_horizontal : lista_mediciones_epoca_antes) {
            medicion_horizontal.setKm_totales_latitud(parametros_proyecto.getKm_por_grado_latitud() * medicion_horizontal.getGrados_decimales_latitud_valor_absoluto());
            medicion_horizontal.setKm_totales_longitud(parametros_proyecto.getKm_por_grado_longitud() * medicion_horizontal.getGrados_decimales_longitud_valor_absoluto());
        }

        for (medicion_horizontal medicion_horizontal : lista_mediciones_epoca_despues) {
            medicion_horizontal.setKm_totales_latitud(parametros_proyecto.getKm_por_grado_latitud() * medicion_horizontal.getGrados_decimales_latitud_valor_absoluto());
            medicion_horizontal.setKm_totales_longitud(parametros_proyecto.getKm_por_grado_longitud() * medicion_horizontal.getGrados_decimales_longitud_valor_absoluto());
        }




        //averiguo las coordenadas menores en lat y long

        List<medicion_horizontal> lista_mediciones_todas = new ArrayList<medicion_horizontal>();
        lista_mediciones_todas.addAll(lista_mediciones_epoca_antes);
        lista_mediciones_todas.addAll(lista_mediciones_epoca_despues);

        Double menor_lat = lista_mediciones_todas.get(0).getKm_totales_latitud();
        Double menor_long = lista_mediciones_todas.get(0).getKm_totales_longitud();
        Double mayor_lat = 0.0;
        Double mayor_long = 0.0;
        
        medicion_horizontal menor_lat_m = new medicion_horizontal();
        medicion_horizontal menor_long_m = new medicion_horizontal();
        medicion_horizontal mayor_lat_m = new medicion_horizontal();
        medicion_horizontal mayor_long_m = new medicion_horizontal();      
        
        
        
        for (medicion_horizontal medicion : lista_mediciones_todas) {
            if (medicion.getKm_totales_latitud() < menor_lat) {
                menor_lat = medicion.getKm_totales_latitud();
                menor_lat_m = medicion;
            }
            if (medicion.getKm_totales_longitud() < menor_long) {
                menor_long = medicion.getKm_totales_longitud();
                menor_long_m = medicion;
            }

            if (medicion.getKm_totales_latitud() > mayor_lat) {
                mayor_lat = medicion.getKm_totales_latitud();
                mayor_lat_m = medicion;
            }
            if (medicion.getKm_totales_longitud() > mayor_long) {
                mayor_long = medicion.getKm_totales_longitud();
                mayor_long_m = medicion;
            }
        }
        
        Double tamanyo_canvas_x = mayor_long - menor_long;
        Double tamanyo_canvas_y = mayor_lat - menor_lat;
        
        Double centro_lat = mayor_lat_m.getGrados_decimales_latitud_valor_absoluto() - 
        		(mayor_lat_m.getGrados_decimales_latitud_valor_absoluto() - menor_lat_m.getGrados_decimales_latitud_valor_absoluto())/2;
        Double centro_long = mayor_long_m.getGrados_decimales_longitud_valor_absoluto() -
        		(mayor_long_m.getGrados_decimales_longitud_valor_absoluto() -menor_long_m.getGrados_decimales_longitud_valor_absoluto())/2;
        
        if(!menor_lat_m.getHemisferio_norte())
        	centro_lat*=-1;
        
        if(!menor_long_m.getHemisferio_este())
        	centro_long*=-1;
        
        //quito las medidas de màs
        for (medicion_horizontal medicion : lista_mediciones_epoca_antes) {
            medicion.setPunto_y(medicion.getKm_totales_latitud() - menor_lat);
            medicion.setPunto_x(medicion.getKm_totales_longitud() - menor_long);
        }

        for (medicion_horizontal medicion : lista_mediciones_epoca_despues) {
            medicion.setPunto_y(medicion.getKm_totales_latitud() - menor_lat);
            medicion.setPunto_x(medicion.getKm_totales_longitud() - menor_long);
        }


        //genero los vectores
        List<vector_observado> lista_vectores_observados = new ArrayList<vector_observado>();

        for (medicion_horizontal medicion_horizontal : lista_mediciones_epoca_antes) {
            for (medicion_horizontal medicion_horizontal_2 : lista_mediciones_epoca_despues) {
                if (medicion_horizontal.getEstacion_medicion() == medicion_horizontal_2.getEstacion_medicion()) {
                    vector_observado vector1 = new vector_observado();
                    vector1.setAntes(medicion_horizontal);
                    vector1.setDespues(medicion_horizontal_2);


                    if (medicion_horizontal.getHemisferio_norte()) {
                        vector1.setPunto_escalado_y_punto1(tamanyo_canvas_y - medicion_horizontal.getPunto_y());
                    } else {
                        vector1.setPunto_escalado_y_punto1(medicion_horizontal.getPunto_y() - tamanyo_canvas_y);
                    }

                    if (medicion_horizontal.getHemisferio_este() == false) {
                        vector1.setPunto_escalado_x_punto1(tamanyo_canvas_x - medicion_horizontal.getPunto_x());
                    } else {
                        vector1.setPunto_escalado_x_punto1(medicion_horizontal.getPunto_x() - tamanyo_canvas_x);
                    }


                    if (medicion_horizontal_2.getHemisferio_norte()) {
                        vector1.setPunto_escalado_y_punto2(tamanyo_canvas_y - medicion_horizontal_2.getPunto_y());
                    } else {
                        vector1.setPunto_escalado_y_punto2(medicion_horizontal_2.getPunto_y() - tamanyo_canvas_y);
                    }

                    if (medicion_horizontal_2.getHemisferio_este() == false) {
                        vector1.setPunto_escalado_x_punto2(tamanyo_canvas_x - medicion_horizontal_2.getPunto_x());
                    } else {
                        vector1.setPunto_escalado_x_punto2(medicion_horizontal_2.getPunto_x() - tamanyo_canvas_x);
                    }

                    lista_vectores_observados.add(vector1);

                }
            }
        }



        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Calculando Mogi v0.01</h1>");      
        
        out.println("<canvas id='my_canvas' width='400' height='400' style='border:1px solid #000000;'></canvas>");
        
        out.println("<canvas id='canvas_google' width='400' height='400' style='border:1px solid #000000;'></canvas>");
        
        Double mayor = tamanyo_canvas_x > tamanyo_canvas_y? tamanyo_canvas_x : tamanyo_canvas_y;
        Double factor_zoom= 400/mayor;
        factor_zoom = Math.floor(factor_zoom);

        out.println("<h3>tamanyo_canvas_x : </h3>" + tamanyo_canvas_x);
        out.println("<h3>tamanyo_canvas_y : </h3>" + tamanyo_canvas_y);
       // out.println("<h3>factor_zoom : </h3>" + factor_zoom);

        out.println(
        		"<script type='text/javascript'> " );      
        
        out.println( 
        		"var c=document.getElementById('my_canvas');" + 
        		"var ctx=c.getContext('2d');");
        
        out.println( 
        		"var c=document.getElementById('canvas_google');" + 
        		"var ctx2=c.getContext('2d');");
        
        out.println(
        		"var ImagenHTML5 = new Image(); "
        		);
        
        out.print(
        		"ImagenHTML5.src = 'http://maps.google.com/maps/api/staticmap?center="+centro_lat+","+centro_long+"&zoom=14&size=400x400&sensor=false&maptype=satellite"
                );
        
        for (vector_observado vector1 : lista_vectores_observados) {
            out.print("&path=color:0xff0000ff|weight:3|" + 
            		vector1.getAntes().getGrados_decimales_latitud() + "," + 
            		vector1.getAntes().getGrados_decimales_longitud() + "|" +
            		vector1.getDespues().getGrados_decimales_latitud() + "," + 
            		vector1.getDespues().getGrados_decimales_longitud());
        }
        out.print("';");//cierre del path
        out.println("ctx2.drawImage(ImagenHTML5, 0, 0);");
        
      //cargo la imagen y lo asigno al canvas
        
        	
        
        for (vector_observado vector1 : lista_vectores_observados) {
            out.println("ctx.moveTo(" + vector1.getPunto_escalado_x_punto1()*factor_zoom + "," + vector1.getPunto_escalado_y_punto1()*factor_zoom + ");");
            out.println("ctx.lineTo(" + vector1.getPunto_escalado_x_punto2()*factor_zoom + "," + vector1.getPunto_escalado_y_punto2()*factor_zoom + ");");
            
            out.println("var p1 = {x:"+ vector1.getPunto_escalado_x_punto1()*factor_zoom+",y:"+ vector1.getPunto_escalado_y_punto1()*factor_zoom+"};");
            out.println("var p2 = {x:"+ vector1.getPunto_escalado_x_punto2()*factor_zoom+",y:"+ vector1.getPunto_escalado_y_punto2()*factor_zoom+"};");
            
            //calcular el desplazamiento
            Double lado1 = vector1.getPunto_escalado_x_punto1() - vector1.getPunto_escalado_x_punto2();
            Double lado2 = vector1.getPunto_escalado_y_punto1() - vector1.getPunto_escalado_y_punto2();
            vector1.setDesplazamiento(Math.sqrt(Math.pow(Math.abs(lado1), 2)+Math.pow(Math.abs(lado2), 2)));
            out.println("drawLabel( ctx, "+vector1.getAntes().getEstacion_medicion().getNumero()+", p1, p2 , 'center', 5 );");
            out.println("ctx.stroke();");
        }

        out.println("" +
        		"function drawLabel( ctx, text, p1, p2, alignment, padding ){" +
        		"if (!alignment) alignment = 'center';" +
        		"if (!padding) padding = 0;" +
        		"var dx = p2.x - p1.x;" +
        		"var dy = p2.y - p1.y;" +
        		"var p, pad;" +
        		"if (alignment=='center'){" +
        		"p = p1;" +
        		" pad = 1/2;" +
        		"} else {" +
        		"var left = alignment=='left';" +
        		"p = left ? p1 : p2;" +
        		"pad = padding / Math.sqrt(dx*dx+dy*dy) * (left ? 1 : -1);" +
        		"}" +
        		"ctx.save();" +
        		"ctx.textAlign = alignment;" +
        		"ctx.translate(p.x+dx*pad,p.y+dy*pad);" +
        		"ctx.rotate(Math.atan2(dy,dx));" +
        		"ctx.fillText(text,0,0);" +
        		"ctx.restore();" +
        		"}");
        
        out.println("</script>");

        
        out.println("<h2>Estaciones</h2><table cellspacing='5' border=2>"
                + "<tr>" +
                "<th>Numero</th>" +
                "<th>Nombre</th>" +
                "<th>Epoca 1 real</th>" +
                "<th>Epoca 2 real</th>" +
                "<th>Epoca 1 escalado</th>" +
                "<th>Epoca 2 escalado</th>" +
                "<th>desplazamiento</th>" +
                "</tr>");

        for (vector_observado vector1 : lista_vectores_observados) {
            out.println(
            		"<tr>" +
            		"<td>" + vector1.getAntes().getEstacion_medicion().getNumero() + "</td>" +
            		"<td>" + vector1.getAntes().getEstacion_medicion().getNombre() + "</td>" +
            		"<td>" + vector1.getAntes().getGrados_decimales_latitud()+ "," + vector1.getAntes().getGrados_decimales_longitud()+ "</td>" +
            		"<td>" + vector1.getDespues().getGrados_decimales_latitud()+ "," + vector1.getDespues().getGrados_decimales_longitud()+ "</td>" +
            		"<td>" + vector1.getAntes().getPunto_y()+ "," + vector1.getAntes().getPunto_x()+ "</td>" +
            		"<td>" + vector1.getDespues().getPunto_y()+ "," + vector1.getDespues().getPunto_x()+ "</td>" +
            		"<td>" + vector1.getDesplazamiento() + " km </td>" +
            		"</tr>");

        }

        out.println("</table>");
        
        
        //las iteraciones de cada punto serán cada 0.1 km  = 100 metros
        //desde (0,0) hasta (tamanyo_canvas_x, tamanyo_canvas_y) sumando 0.1  por iteracion
        //profundidad sumando 1.0 por iteracion
        //cambio presion sumando 5.0 por iteracion
        
        //calcular distancia radial o desplazamiento
                
        List<iteracion> listaIteraciones = new ArrayList<iteracion>();
        
        for (vector_observado vector1 : lista_vectores_observados) {
            
        	for (Double fuente_x = 0.0; fuente_x < tamanyo_canvas_x; fuente_x = fuente_x + 0.1) {
        		for (Double fuente_y = 0.0; fuente_y < tamanyo_canvas_y; fuente_y = fuente_y + 0.1) {
        			
        			Double lado1 = fuente_x - vector1.getPunto_escalado_x_punto2();
                    Double lado2 = fuente_y - vector1.getPunto_escalado_y_punto2();
                    Double distancia_radial = (Math.sqrt(Math.pow(Math.abs(lado1), 2)+Math.pow(Math.abs(lado2), 2)));
                    
					for (Double profundidad = parametros_proyecto.getProfundidad_desde(); profundidad < parametros_proyecto.getProfundidad_hasta(); profundidad = profundidad + 1) {
						for (Double presion = parametros_proyecto.getCambioPresion_desde(); presion < parametros_proyecto.getCambioPresion_hasta(); presion = presion + 5) {
											
							Double radio = parametros_proyecto.getConstante_radio_desde(); // radio como constante
							Double shearModulus = parametros_proyecto.getConstante_shearModulus();
							Double cambioVolumen = 0.0;
							Double desplazamiento_teorico =0.0;
							//horizontal
					        //=(3*((pi*pow(radio,3)*cambiopresion)/shearmodulus)*profundidad)/(4*PI()*(POWER((POWER(profundidad,2)+POWER(distanciaradial,2)),1.5)))
					        cambioVolumen = (Math.PI*Math.pow(radio, 3)*presion)/shearModulus;
					        desplazamiento_teorico = (3*cambioVolumen*profundidad)/(4*Math.PI*(Math.pow((Math.pow(profundidad, 2)+ Math.pow(distancia_radial, 2)), 1.5)));
							
							iteracion iteracion1= new iteracion();	
							//el vector 1 es de horizontal
							iteracion1.setSuma_chi_cuadrado_horizontal(vector1.getDesplazamiento()-desplazamiento_teorico);
							iteracion1.setCambio_presion(presion);
							iteracion1.setDistancia_radial(distancia_radial);
							iteracion1.setProfundidad(profundidad);
							iteracion1.setRadio(radio);
							iteracion1.setPunto_origen_x(fuente_x);
							iteracion1.setPunto_origen_y(fuente_y);
							listaIteraciones.add(iteracion1);					
							
						}
					}        			
				}				
			}        				
		}
        
        
        /*out.println("<h2>Iteraciones</h2><table cellspacing='5' border=1>"
                + "<tr>" +
                "<th>r</th>" +
                "<th>P</th>" +
                "<th>d</th>" +
                "<th>a</th>" +
                "<th>Chi2</th>" +
                "<th>x</th>" +
                "<th>y</th>" +
                "</tr>");*/
        
        Double min_chi2 = 5.0;
        iteracion iteracion_minima = new iteracion();
        for (iteracion iteracion1 : listaIteraciones) {
        	if(iteracion1.getSuma_chi_cuadrado_horizontal()<min_chi2){
        		min_chi2 = iteracion1.getSuma_chi_cuadrado_horizontal();
        		iteracion_minima = iteracion1;
        	}
        	 /*out.println(
             		"<tr>" +
             		"<td>" + iteracion1.getDistancia_radial() + "</td>" +
             		"<td>" + iteracion1.getCambio_presion() + "</td>" +
             		"<td>" + iteracion1.getProfundidad() + "</td>" +
             		"<td>" + iteracion1.getRadio() + "</td>" +
             		"<td>" + iteracion1.getSuma_chi_cuadrado_horizontal() + " </td>" +
             		"<td>" + iteracion1.getPunto_origen_x() + " </td>" +
             		"<td>" + iteracion1.getPunto_origen_y() + " </td>" +
             		"</tr>");*/
		}


        //out.println("</table>");
        
        
        out.println("Min chi2: " + min_chi2);
        out.println(
        		"<script type='text/javascript'> " );      
        
        out.println(
        		"ctx.beginPath();" +
        		"ctx.arc("+ iteracion_minima.getPunto_origen_x()*factor_zoom+"," + iteracion_minima.getPunto_origen_y()*factor_zoom+", 10, 0, Math.PI*2, true);" +
        		"ctx.closePath();" +
        		"ctx.fill();");
        
        out.println(
        		"</script> " );      
        
        
        
        
        //vertical
        //=(3*((pi*pow(radio,3)*cambiopresion)/shearmodulus)*distanciaradial)/(4*PI()*(POWER((POWER(profundidad,2)+POWER(distanciaradial,2)),1.5)))

        //horizontal
        //=(3*((pi*pow(radio,3)*cambiopresion)/shearmodulus)*profundidad)/(4*PI()*(POWER((POWER(profundidad,2)+POWER(distanciaradial,2)),1.5)))
        
        out.println("</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
