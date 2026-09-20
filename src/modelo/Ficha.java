package modelo;

public enum Ficha  {
	
	X, O;
		
	//METODO
	public Ficha siguiente() {
		if(this ==X){
			O.siguiente();

		}else{
			return X.siguiente();
		}


		
		return O.siguiente();
	}
	
}

