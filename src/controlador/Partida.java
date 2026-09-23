package controlador;

import modelo.Ficha;
import modelo.Tablero;
public class Partida {

 private  Tablero tablero;
 private Ficha turno;

 public Partida (int dimension){
    this.turno= Ficha.X;
    this.tablero=new Tablero(dimension);
 }
    public void jugar(int fila, int columna){
        
        boolean sePudo = tablero.jugar(turno,fila, columna);

        if(sePudo){
            turno=turno.siguiente();
        }
    }

    public boolean terminada(){

        return tablero.estaLleno()||tablero.gana(Ficha.X)||tablero.gana(Ficha.O);
    }   

    public  Ficha ganador(){
        if(tablero.gana(Ficha.X)){
        
                return Ficha.X;
        }
        if(tablero.gana(Ficha.O)){
            return Ficha.O;

        }

        return null;
    }


    @Override
    public String toString() {
    
        return "Turno :"+turno+"\n"+tablero.toString();
    }
    

    
}
