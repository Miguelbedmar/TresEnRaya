package modelo;

public enum Ficha  {
	
	X, O;
		
	//METODO
	public Ficha siguiente() {
	/**
	 * Para que el programa sepa que ficha continua despues 
	 * he implementado un condicional   que si esta constante es == a X entonces
	 * el programa sabe que debe devolver O si no es devolvera X
	 */
		if(this == X){
			return O;

		}else{
			return X;
		}		
	}
	
}

