package main;
import java.util.Scanner;
import controlador.Partida;
public class Main {

	public static void main(String[] args) {
		pedidaDatos();
		


		
	}



	public static  void pedidaDatos(){
		Scanner sc = new Scanner(System.in);
		int fila=0;
		int columna=0;

		System.out.println("Ingrese el numero de filas que deseas");
		 fila=sc.nextInt();

		
		System.out.println("Ingrese el numero de columnas que deseas");
		columna=sc.nextInt();
	}
}
