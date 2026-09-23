package main;
import java.util.Scanner;
import controlador.Partida;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila=0;
		int columna=0;
		Partida partida = new Partida(3);
	
		while(!partida.terminada()){
		System.out.println(partida.toString());
		
		System.out.println("Ingrese el numero de filas que deseas");
		 fila=sc.nextInt();

		
		System.out.println("Ingrese el numero de columnas que deseas");
		columna=sc.nextInt();
		
		partida.jugar(fila, columna);
			
		}

		if(partida.ganador()==null){
			System.out.println("TABLAS");
		}else{
			System.out.println("El ganador de la partida es :"+partida.ganador());
		}

	}
}
