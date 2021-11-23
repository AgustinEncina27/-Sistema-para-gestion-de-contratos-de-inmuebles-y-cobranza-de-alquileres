/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Clases.*;
import ClasesDAO.*;
import VistaContrato.CrearContrato;
import interDAO.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Controlador {
   FileInputStream entrada;
   FileOutputStream salida;
   File archivo;
   private final mysqllocadordao locadordao = new mysqllocadordao();
   private final mysqlinmuebledao inmuebledao = new mysqlinmuebledao();
   private final mysqllocatariodao locatariodao= new mysqllocatariodao();
   private final mysqlgarantedao garantedao= new mysqlgarantedao();
   private final mysqlserviciodao serviciodao= new mysqlserviciodao();
   private final mysqlcontratodao contratodao= new mysqlcontratodao();
   private final mysqlcronogramadao cronogramadao= new mysqlcronogramadao();
   private final mysqlcuotadao cuotadao= new mysqlcuotadao();
    public Controlador() {
    }

    public byte[]AbrirAImagen(File archivo ){
    byte[] bytesImg= new byte[1024*1000];
    try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
    }
    return bytesImg;
    }
    
    
    public void InsertarLocador(Locador a) {
		locadordao.insertar(a);
	}
    public Locador BuscarPorDni(double a){
        Locador lectura = locadordao.obtenerpordni(a);
        return lectura;
    }
    public void ActualizarLocador(Locador a) {
                locadordao.modificar(a);
	}
    public void EliminarLocador(Locador a) {
                locadordao.eliminar(a);
	}
    public Locador ObtenerLocador(Long a){
        Locador lectura = locadordao.obtener(a);
        return lectura;
    }
    
 
    
    public void InsertarLocatoria(Locatario g) {
		locatariodao.insertar(g);
    }
    public void ActualizarLocatoria(Locatario g) {
                locatariodao.modificar(g);
	}
    public void EliminarLocatoria(Locatario g) {
                locatariodao.eliminar(g);
	}
    public Locatario ObtenerLocatario(Long a){
        Locatario lectura = locatariodao.obtener(a);
        return lectura;
    }
   
    
    
    public void InsertarGarante(Garante g) {
		garantedao.insertar(g);
    }
    public void ActualizarGarante(Garante g) {
                garantedao.modificar(g);
    }
    public void EliminarGarante(Garante g) {
                garantedao.eliminar(g);
	}
    public Garante ObtenerGarante(Long a){
        Garante lectura = garantedao.obtener(a);
        return lectura;
    }
    
    
    public void InsertarInmueble(Inmueble g) {
		inmuebledao.insertar(g);
    }
    public void ActualizarInmueble(Inmueble g) {
                inmuebledao.modificar(g);
    }
    public void EliminarInmueble(Inmueble g) {
                inmuebledao.eliminar(g);
	}
    public List<Inmueble> ObtenerInmueble(String a){
        List <Inmueble> inmuebles =inmuebledao.obtener(a);
        return inmuebles;
    }
    
    public Inmueble ObtenerInmuebleID(Long a){
        Inmueble lectura = inmuebledao.obtener(a);
        return lectura;
    }

    public void InsertarServicio(Servicio g) {
		serviciodao.insertar(g);
    }
    public void ActualizarServicio(Servicio g) {
                serviciodao.modificar(g);
	}
    public void EliminarServicio(Servicio g) {
                serviciodao.eliminar(g);
	}
    public Servicio ObtenerServicio(Long a){
        Servicio lectura = serviciodao.obtener(a);
        return lectura;
    }
    
    public List <Servicio> obtenerTodosLosServicios(){
        List <Servicio> servicios =serviciodao.obtenerTodos();
        return servicios;
    }
    
    
    public void InsertarContrato(Contrato g) {
		contratodao.insertar(g);
    }
    public void ActualizarServicio(Contrato g) {
                contratodao.modificar(g);
	}
    public void EliminarContrato(Contrato g) {
                contratodao.eliminar(g);
	}
    public Contrato ObtenerContrato(Long a){
        Contrato lectura = contratodao.obtener(a);
        return lectura;
    }
    

    public void InsertarCronograma(Cronograma a) {
		cronogramadao.insertar(a);
	}
    
    public Cronograma CalculoDeCuota(int n,String r,String costo,String di,String me,String an) {
	int dnum=n;
        int contcu=1;
        Cuota cuot = new Cuota();
        boolean b= false;
        String recargoFijo=r,costoCuota=costo,dia=di,mes=me,anio=an,stringFecha;
        java.util.Date date1 = new Date(), date2= new Date(),date3= new Date(),fechaini,fechafin;
        Cronograma cro= new Cronograma();
        for (int cont = 0; cont < dnum; ++cont) {
                cuot.setNumeroCuota(contcu);
                cuot.setMontoDeRecargo(Integer.parseInt(recargoFijo));    
                int mta = Integer.parseInt(costoCuota);
                cuot.setMontoTotalAPagar(mta);
                
                if(cont==0){
                    stringFecha = dia+"/"+mes+"/"+anio ;

                    DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        date1 = fecha.parse(stringFecha);   
                    } catch (ParseException ex) {
                     Logger.getLogger(CrearContrato.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                }
                
		
                java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
                
                cuot.setPrimerFechaDePago(sqlDate);
                
                date2 =  new java.util.Date();
                date2 = date1;
                
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);// Configuramos la fecha que se recibe
                calendar.add(Calendar.DAY_OF_YEAR, 10);// numero de días a añadir, o restar en caso de días<0
                date2=calendar.getTime();// Devuelve el objeto Date con los nuevos días añadidos
               
                java.sql.Date sqlDate2 = new java.sql.Date(date2.getTime());

                DateFormat fecha1 = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        date3 = fecha1.parse("0/0/0000");   
                    } catch (ParseException ex) {
                     Logger.getLogger(CrearContrato.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                java.sql.Date sqlDate3 = new java.sql.Date(date3.getTime());


                Calendar calendar1 = Calendar.getInstance();
                calendar.setTime(date1);// Configuramos la fecha que se recibe
                calendar.add(Calendar.DAY_OF_YEAR, 30);// numero de días a añadir, o restar en caso de días<0
                date1 = calendar.getTime();// Devuelve el objeto Date con los nuevos días añadidos
                cro.cargarlista(Integer.parseInt(recargoFijo), mta, sqlDate, sqlDate2,sqlDate3, b); 
            }
            return cro;
	} 

    public List <Cuota> ListaCuota(long dni) {
	List <Cuota> cuotas;	
        cuotas=cuotadao.obtenerTodos(dni);
        return cuotas;
    }
    
    public void ModificarCuota(Cuota cou) {
        cuotadao.modificar(cou);
    }
}

