/*
  Andrés Céspedes Siles
 Referencias:
 https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx
 https://www.discoduroderoer.es/como-hacer-un-menu-de-opciones-en-consola-en-java/
 https://codersfree.com/posts/solicitando-datos-al-usuario-en-java-con-la-clase-scanner
 https://www.programarya.com/Cursos/Java/Funciones
 https://www.datacamp.com/es/doc/java/import
 Programacion ATS. Programcion en JAVA 
 https://www.youtube.com/watch?v=2ZXiuh0rg3M&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K
 TodoCode. JAVA para principiantes
 https://www.youtube.com/watch?v=qxXcI56NfnE&list=PLQxX2eiEaqbz8W1qM9eAxPSF65Zj090-P
 Quesada Luis. Tutoria #1. Uned
 https://www.youtube.com/watch?v=8bCIZw8Tmeg
 Manejo de excepciones. UNED
 https://www.youtube.com/watch?v=w_whQKe1De4
 https://www.youtube.com/watch?v=DpcG655aoOY
 Clases y Objetos. UNED
 https://www.youtube.com/watch?v=qzcgba4PQxc
 https://www.youtube.com/watch?v=DpcG655aoOY

Array List https://www.youtube.com/watch?v=qSOIxeqrfdk
 */
package app;

import Clases.Jugador;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrés Céspedes Siles
 */
public class PlayerFitnessManagementSystem {



   
    public static void main(String[] args) {
       
        
     
      
        
        
        Scanner lector = new Scanner (System.in);
        Scanner opcion = new Scanner (System.in);
        ArrayList<Jugador> ListaJugadores = new ArrayList<>();
        
        boolean salir= false;
        int menu;
        
        while (!salir){
           System.out.println("*************************************************************************** "); 
           System.out.println("Sistema de composición y acondicionamiento físico del Equipo de la ciudad ");
           System.out.println("*************************************************************************** "); 
           System.out.println("1. Opcion 1: Ingresar datos de jugador");
           System.out.println("2. Opcion 2: Reporte Individual");
           System.out.println("3. Opcion 3: Reporte Grupal");
           System.out.println("4. Opción 4: Salir");
           
     try{     
           System.out.println("Escoge una opción");
           menu = opcion.nextInt();
      
           switch(menu){
               case 1:
               System.out.println("Has seleccionado la opcion 1");
               
        while (true){
               
        System.out.println("*************************************************************************** ");
        LocalDateTime fechaHoraActual = LocalDateTime.now(); // Obtiene fecha y hora que tiene la compu
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");// formato de fecha y hora
        System.out.println("Fecha y hora actual: " + fechaHoraActual.format(formato));
        System.out.println("   ");
        
        Jugador Jugador1 = new Jugador();
     
         while (true){
         System.out.println ("Ingrese Nombre del Jugador");
         Scanner lectorNombre = new Scanner (System.in);
         String Nombre= (lectorNombre.nextLine());
         if (ValidarNombre(Nombre)){
         System.out.println("Nombre válido: " + Nombre);
         Jugador1.setNombreJugador(Nombre);
         break;
         }
         System.out.println("Error: El nombre debe tener entre 5 y 15 caracteres.");
         }
        
        System.out.println ("Ingrese Número del Jugador");
        Jugador1.setNumero (lector.nextInt());
          
        
        while (true){   
         System.out.println ("Ingrese Posicion del Jugador");
         Scanner lectorPosicion = new Scanner (System.in);
         String Posicion= (lectorPosicion.nextLine());
         if (ValidarPosicion(Posicion)){
         System.out.println("Posicion es válido: " + Posicion);
         Jugador1.setPosicion(Posicion);
         break;
         }
         System.out.println("Error: La posicion debe tener únicamente 3 caracteres.");
         }
       
        System.out.println ("Ingrese Estatura del Jugador");
        Jugador1.setEstatura( lector.nextDouble());
       
        System.out.println ("Ingrese Peso del Jugador");
        Jugador1.setPeso( lector.nextDouble());
       
        System.out.println ("Ingrese Porcentaje de grasa del Jugador");
        Jugador1.setPorcentajeGrasa( lector.nextDouble());
        Jugador1.SetTipoEntrenamiento();
        
        ListaJugadores.add(Jugador1);
        
        
        System.out.println ("Desea Ingresar otro Jugador? digite Si o No" );
        Scanner lectorRespuesta = new Scanner (System.in);
        String Respuesta= (lectorRespuesta.nextLine());
        if (!IngresoJugador(Respuesta)){
        break;
        }
              
      }
          break;
        
    
                case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   System.out.println("*************************************************************************** ");
                   
                   System.out.println("La información ingresada para el reporte individual: ");
                   System.out.println("*************************************************************************** ");
                   
                   for  (Jugador p:ListaJugadores){
                     
		    System.out.println(p.toString());
                     
		   }
                   
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   System.out.println("*************************************************************************** ");
                   ObtenerReporteGrupal(ListaJugadores);
                   
                   break;
                case 4:
                   salir=true;
                   System.out.println("Has seleccionado la opcion 4");
                   System.out.println("*************************************************************************** ");
                   System.out.println("Gracias hasta pronto!");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
                   System.out.println("*************************************************************************** ");
        }
          }catch(InputMismatchException error){
        
         System.out.println("Error: Dato o formato ingresado es incorrecto!");
          break;
        } 
     
            finally{
                  // bloque opcional que sirve para liberar memoria
     
              }
     }
        
    
        
  }
     private static boolean ValidarNombre(String Nombre){ 
     return (Nombre.length() >= 5 && Nombre.length() <= 15);
         
       }
         private static boolean ValidarPosicion(String Posicion){ 
          return ( Posicion.length() == 3);
         }
          private static boolean IngresoJugador(String Ingreso){ 
          return Ingreso.toUpperCase().equals("SI");
         }
          
          private static void ObtenerReporteGrupal( ArrayList<Jugador> ReporteGrupal){ 
             double PromedioAltura=0;
             double PromedioGrasa=0;
             double SumaAltura=0;
             double SumaGrasa=0;
              for(Jugador p:ReporteGrupal){
                   SumaAltura += p.getEstatura();
                   SumaGrasa += p.getPorcentajeGrasa();     
		   }
              PromedioAltura= SumaAltura/ReporteGrupal.size();
              PromedioGrasa= SumaGrasa/ReporteGrupal.size();
              
                  System.out.println("Promedio de altura de los jugadores del equipo: "+ " "   + PromedioAltura);          
                  System.out.println("Porcentaje de grasa promedio de los jugadores del equipo: "+ " "  + PromedioGrasa); 
          }
}       
