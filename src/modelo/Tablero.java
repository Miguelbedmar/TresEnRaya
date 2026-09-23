package modelo;


public class Tablero {
	protected  Ficha [][] casilla;
	


	//CONSTRUCTOR
	public Tablero(int dimension) {
			 this.casilla = new Ficha[dimension][dimension];
			}
	
	//METODO
	
	public boolean jugar(Ficha ficha){
		
		return false;
	}

	public boolean  estarLleno(){
		
		return false;
	}
	public boolean ganarFicha(Ficha ficha){
		
		return false;
	}
	protected boolean ganaHorizontal(Ficha ficha){
		
		return false;
	}
	protected boolean  ganaVertical(Ficha ficha){
		
		return false;
	}
	protected  boolean ganaDiagonalDirecta(Ficha ficha){
		
		return false;
	}
	protected boolean ganaDiagonalIndirecta(Ficha ficha){
		
		return false;
	}
	


	@Override
	public String toString() {
		return "{" +"_"+"_"+"_"+
					"_"+"_"+"_"+ "}";		
	}

	private Object valueOf(Ficha ficha){
		return ficha;
	}
	
}

	
