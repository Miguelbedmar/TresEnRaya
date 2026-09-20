package controlador;

import modelo.Ficha;
import modelo.Tablero;
public class Partida {
 private  Tablero tablero;
 private Ficha ficha:
 public Partida (){

 }
    public void jugar(){

    }

    public boolean terminada(){

        return false;
    }   

    public  Ficha ganador(){
        
        return null;
    }


    @Override
    public String toString() {
        return "{" +  "|"+"|"+"|"+
                      "|"+"|"+"|"+
                      "|"+"|"+"|"+  
            "}";
    }
    

    
}
