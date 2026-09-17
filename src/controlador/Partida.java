package controlador;

import modelo.Ficha;

public class Partida {

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
        return "{" + "|"+"|"+"|"+
            "}";
    }
    

    
}
