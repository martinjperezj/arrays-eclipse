package diapositivas;

import java.util.Scanner;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANO = 7;
		double[] valores = new double[TAMANO];
		Scanner in = new Scanner(System.in);
		//inicializar los valores del array
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Introduce valor "+i);
			valores[i] = in.nextDouble();
		}
		in.close();
		//modifico valores
		valores[0]=15;
		valores[valores.length-1]=15;
		System.out.println("Mostrando los valores del array opci�n 1");
		//mostrar los valores del array opci�n 1
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i]+"\t");
		}
		System.out.println("\nMostrando los valores del array opci�n 2");
		//mostrar los valores del array opci�n 2
		for (double d : valores) {
			System.out.print(d+"\t");
		}
		//calcular el valor medio
		double suma=0;
		for (double d : valores) {
			suma+=d;
		}
		double media = suma/TAMANO;
		System.out.printf("\nEl valor medio es %.3f\n",media);
		
		//n�mero de elementos que est�n por debajo de la media
		int contador=0;
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] < media) 
				contador++;
		}
		System.out.println("N�mero de valores por debajo de la media: "+contador);
		
	}
	
		
}