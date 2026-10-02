/*Proyecto #1 programacion Intermedia
Referencias:
https://zaguandelainformatica.blogspot.com/2017/12/las-tildes-y-la-n-en-la-entrada-y.html


 */
package Clases;

/**
 *
 * @author Andres Cespedes Sile
 */
public class Jugador {
   // Atributos del jugador
    

    
   private String NombreJugador;
   private int Numero;
   private double Estatura;
   private double Peso;
   private double PorcentajeGrasa;
   private String Posicion;
   private String TipoEntrenamiento;
   
   //constructor vacio
   public Jugador ()
   {
      
    this.NombreJugador = "";
    this.Numero = 0;
    this.Posicion = "";
    this.Estatura=0;
    this.Peso=0;
    this.PorcentajeGrasa=0;   
   }
   
   //constructor sobrecargado
   
   public Jugador(String PNombreJugador, int PNumero, String PPosicion, int PEstatura,int PPeso, int PPorcentajeGrasa)
   {
    this.NombreJugador = PNombreJugador;
    this.Numero = PNumero;
    this.Posicion = PPosicion;
    this.Estatura= PEstatura;
    this.Peso = PPeso;
    this.PorcentajeGrasa = PPorcentajeGrasa;  
       
   }
  

    
   
       //metodos set/get

   

    public String getNombreJugador() {
      return NombreJugador;      
    }

    public void setNombreJugador(String NombreJugador) {
       this.NombreJugador = NombreJugador;
        
    }

    public int getNumero() {         
      return Numero;
    }

    public void setNumero(int Numero) {
       this.Numero = Numero;
       
    }

    public String getPosicion() {
        return Posicion;
    }

     public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getPorcentajeGrasa() {
        return PorcentajeGrasa;
    }

    public void setPorcentajeGrasa(double PorcentajeGrasa) {
        this.PorcentajeGrasa = PorcentajeGrasa;
    }
    
    
    public void SetTipoEntrenamiento(){
    if (this.PorcentajeGrasa <= 11){
        this.TipoEntrenamiento= "Progresión hacia la competición";
      }else if(this.PorcentajeGrasa >11 && this.PorcentajeGrasa<15){
          this.TipoEntrenamiento= "Entrenamientos individualizados y Progresión hacia la competición";
        } else if (this.PorcentajeGrasa >15){
          this.TipoEntrenamiento= "Trabajo físico intensivo, Entrenamientos individualizados y Progresión hacia la competición";
                }      
            
    }

    @Override
    public String toString() {
        return "Jugador:\n " + "NombreJugador=" + NombreJugador + "\n Numero=" + Numero + "\n Estatura=" + Estatura + " centimetros, "+ "\n Peso=" + Peso + "Libras"+ "\n PorcentajeGrasa=" + PorcentajeGrasa + ", Tipo de Entrenamiento "+ TipoEntrenamiento + "\n Posicion=" + Posicion + "\n";
    }

    
    
 }

    
  
   
   


    
