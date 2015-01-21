package diapositivas;
import java.util.ArrayList;
public class ListaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos una lista vacia
		ArrayList <String> list= new ArrayList<String>();
		System.out.println("Tamaño de la lista: "+list.size());//tamaño de la lista
		//añadir objetos
		list.add ("Madrid");
		list.add ("Londres");
		list.add ("Paris");
		list.add ("New York");
		list.add ("Berlin");
		list.add (2,"Barcelona");//meter barcelona en la posicion 2
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println("¿Esta Madrid? "+list.contains("Madrid"));
		System.out.println("¿Esta Zaragoza? "+list.contains("Zaragoza"));
		list.remove("Londres");
		//list.remove(0);
		//imprimimos los valores
		//System.out.println (list); //list.toString ()
		//list.add(23);//23 no funciona por que arriba pide string
		System.out.println (list);
	}

}
