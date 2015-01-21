package diapositivas;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma=0;
		double contadordeveces=0;
		//declaro y defino el array
		//el operador final impide cambiar los valores, tambien se puede poner sin final pero 
			//si se modificarian los valores si se quiere
		final int [][]array= {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
		};
		System.out.println("Numero de filas: "+ array.length);
		System.out.println("Número de columnas: "+array[0].length);
	//for para leer el array un bucle por cada array i y otro j
		//tambien hago los calculos para la media
		for (int fila = 0; fila < array.length ; fila++) {
			for (int columna=0;columna<array[fila].length; columna++){
				System.out.println("La posicion del array es: ["+fila+"]["+columna+"]" 
						+  " Los valores son :"+array[fila][columna] );
				
				//sumar todos los datos del array
				//suma+=array[fila][columna];//otra forma de sumar lo de abajo
				suma=array[fila][columna]+suma;
				System.out.println("El numero total es: "+suma);
				//para ver las veces que entra en el bucle
				contadordeveces++;
			}
		}
	//calcular la media
		System.out.println("La media es: "+suma/contadordeveces );
		System.out.println("Mostrado al reves: ");
	//definimos una nueva matriz que sus valores esten invertidos de la matriz anterior
		int [][] nuevoArray=new int [4][3];
		//contador de filas
		int contadorFilas=0;
		for (int i=array.length-1; i>=0; i--){
			//contador de columnas
			int contadorColumnas=0;
			for (int j=array[i].length-1;j>=0; j--){
				nuevoArray [contadorFilas][contadorColumnas]=array[i][j];
				contadorColumnas++;
				System.out.println(array[i][j]);
			}
			contadorFilas++;
			//System.out.println();
		}/*
		//imprimimos el nuevoArray
		for (int i=0;i>nuevoArray.length; i++){
		for (int j=0; array[i].length;j>=0;j++){
			System.out.println("La posicion del array es: ["+i+"]["+j+"]" 
					+  " Los valores son :"+array[i][j] );
		}
		}*/
			//intentar imprimir los valores llamando al toString
	}
}
