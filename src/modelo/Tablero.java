package modelo;


public class Tablero {
	protected  Ficha [][] casilla;
	


	//CONSTRUCTOR
	public Tablero(int dimension) {
			 this.casilla = new Ficha[dimension][dimension];
			}
	
	//METODO
	
	public boolean jugar(Ficha ficha , int posicionX,int posicionY){
			/**Comprobamos primero si partida puede realizar la jugada que
			 * desea para ello tenemos que saber si la casilla selecciona está
			 * ocupada en el caso de que se cumpla la condición devolvera false
			 * en signo de que no puede realizar la jugada en el caso contrario
			 * se da a entender de que la casilla está libre y por lo tanto
			 * partida puede realizar la jugada maestra.
			 */
		if (casilla[posicionX][posicionY]!=null) {
			return false;
		}
		casilla[posicionX][posicionY]=ficha;
		return true;
	}

	public boolean  estaLleno(){
		
		for(int i=0;i<casilla.length;i++){
			for(int j=0;j<casilla[i].length;j++){
				if (casilla[i][j]==null) {
					return false;
				}	
			}			
		}
		return true;
	}
	public boolean gana(Ficha ficha){
		
		return ganaHorizontal(ficha) || ganaVertical(ficha)||ganaDiagonalDirecta(ficha)||ganaDiagonalIndirecta(ficha);
			
	}
	protected boolean ganaHorizontal(Ficha ficha){
		boolean filaCompleta=true;

		for(int i=0;i<casilla.length;i++){
			for(int j=0;j<casilla[i].length;j++){
				if (true) {
					filaCompleta=false;
				}
			}
		}


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

	
