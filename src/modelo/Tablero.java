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
		

		for(int i=0;i<casilla.length;i++){
			boolean filaCompleta=true;
			for(int j=0;j<casilla[i].length;j++){
				if (casilla[i][j]!=ficha) {
					filaCompleta=false;
				}
			}
			if(filaCompleta){
				return true;
			}
		}
		return false;
	}
	protected boolean  ganaVertical(Ficha ficha){
		
		for(int j=0;j<casilla[0].length;j++){
			boolean columnaCompleta=true;
			for(int i=0;i<casilla.length;i++){
				if (casilla[i][j]!=ficha) {
					columnaCompleta=false;
				}
			}
			if(columnaCompleta){
				return true;
			}
		}
		return false;
	}
	protected  boolean ganaDiagonalDirecta(Ficha ficha){
		boolean ganaDiagonalDirec=true;
		for(int i=0 ; i<casilla.length;i++){
					
			if(casilla[i][i]!=ficha)
				ganaDiagonalDirec=false;
		}
		if(ganaDiagonalDirec){
		return true;
		}
		return false;
	}
	protected boolean ganaDiagonalIndirecta(Ficha ficha){
			boolean ganaDiagonalInirec=true;
		for(int i=0 ; i<casilla.length;i++){
					
			if(casilla[i][casilla.length-1-i]!=ficha)
				ganaDiagonalInirec=false;
		}
		if(ganaDiagonalInirec){
		return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String resultado ="";

		for(int i=0;i<casilla.length;i++){
			for(int j=0;j<casilla[i].length;j++){
				resultado+=valueOf(casilla[i][j]);
			}
			resultado+="\n";
		}


		return resultado;		
	}

	private Object valueOf(Ficha ficha){
		if(ficha==null){
			return "_";
		}
			return ficha;
		

	}
	
}

	
