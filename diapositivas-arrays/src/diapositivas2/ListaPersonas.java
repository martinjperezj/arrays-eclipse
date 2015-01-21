package diapositivas2;

import java.util.List;
import java.util.ArrayList;

public class ListaPersonas {
	//atributo coleccion de personas
	private List <Persona> listaPersonas;
	
	//constructor
	public ListaPersonas() {
		//tipico en coleccion de objetos
		//inicializar la coleccion a coleccion vacia
		this.listaPersonas = new ArrayList<Persona>();
	}
	public void addPersona(Persona p){
		//añado un objeto persona al atributo
		//que es una coleccion 
		listaPersonas.add(p);
	}
	public void eliminarPersona(Persona p){
		if(listaPersonas.contains(p)){/*si es true elimana la perosna si no no entra en el bucle*/
			listaPersonas.remove(p);
			}
	}
	public boolean existePersona(Persona p){
		return listaPersonas.contains(p);	
	}
	
	public void modificarNombrePersona(Persona p, String nuevoNombre){
		if(listaPersonas.contains(p)){
			
			p.setNombre(nuevoNombre);
		}

	}
	
	@Override
	public String toString() {
		return  listaPersonas.toString();
	}
	
	
	
		
}

