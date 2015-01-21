package diapositivas;
import java.util.ArrayList;
import java.util.List;
public class RecorrerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int[] arrayEnteros= {1,2,3,4,5,6,7,8,9};
		//recorrer el array y lo añado a la lista
		for (int i = 0; i < arrayEnteros.length; i++) {
			lista.add(arrayEnteros[i]);
		}
		System.out.println(lista);
		Integer numero= new Integer(10);
		lista.add(0, numero);//añado el 10 en la posicion 0	
		System.out.println(lista);
		Integer numero2= new Integer(100);
		lista.set(0, numero2);//actualiza el 10 a 100
		System.out.println(lista);
		//vamos a descubrir cuantos elementos son pares
		int contadorPares=0;
		for (int i = 0; i < lista.size(); i++) {
			if(0==(lista.get(i)%2)){
			contadorPares++;
			}
		}
		System.out.println("Valores pares en la lista: "+contadorPares);
		//vamosa sacar un array de impares
		List<Integer> listaImpares =new ArrayList<Integer>();
		for (Integer integer:lista) {
			if(0!= (integer%2)){
			listaImpares.add(integer);
			}
		}
		System.out.println("Lista de impares "+listaImpares);
		
		}
	}