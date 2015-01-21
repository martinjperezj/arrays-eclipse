package diapositivas2;

public class TestPersonas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ListaPersonas lista =new ListaPersonas();
		System.out.println("Nada más que iniciar");
		System.out.println(lista);
		Persona p1=new Persona(15,"juanjo");
		Persona p2=new Persona(25,"macarena");
		Persona p3=new Persona(35,"pedro");
		Persona p4=new Persona(45,"luis");
		Persona p5=new Persona(55,"juan luis");
		lista.addPersona(p1);
		lista.addPersona(p2);
		lista.addPersona(p3);
		lista.addPersona(p4);
		lista.addPersona(p5);
		System.out.println("Después de meter los datos");
		System.out.println(lista);
		System.out.println("Existe el objeto p1? "+lista.existePersona(p1));
		//añadimos una nueva persona
		lista.addPersona(new Persona(52,"Rodrigo"));
		System.out.println(lista);
		//eliminamos la p5 "juan luis"
		lista.eliminarPersona(p5);
		System.out.println(lista);
		//crear una persona pero no esta añadida
		Persona p6=new Persona (21,"Rosalia");
		System.out.println("Existe p6?? "+lista.existePersona(p6));
		System.out.println(lista);
		//creo otra persona pero no es el mismo rodrigo de antes
		//como no esta añadida usamos el hashcode()y equals()
		System.out.println("Existe Rodrigo "+lista.existePersona(new Persona(52,"Rodrigo")));
		Persona p7= new Persona  (52,"Rodrigo");
		System.out.println("Existe p7 "+lista.existePersona(p7));
		//cambia el p4 luis por Gregorio
		//sin el hashcode()y equals() lo hace 
		lista.modificarNombrePersona(p4, "Gregorio");
		System.out.println(lista);
		
		
		
		
		
		
		
	}

}
