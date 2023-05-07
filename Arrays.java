public class Arrays{
	public static void main(String[] args){
		System.out.println("Los arrays son usados para almacenar datos en una sola variable");
		// La forma de definirla sería así
		String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};
		// También podemos hacerlo con otros tipos de variables
		int[] nums = {10, 20, 30, 40};
		System.out.println("Podemos acceder a los elementos indicando su número de índice");
		// Para acceder a ellos debemos tomar en cuenta que el orden empieza desde 0
		System.out.println(autos[0]);
		System.out.println("Cambiar sus valores funcion como una asignación de valores");
		autos[0] = "Opel";
		System.out.println(autos[0]);
		System.out.println("Podemos usar la propiedad length para saber cuantos elementos hay el array");
		System.out.println(autos.lenght);
		System.out.println("A pesa de eso el número de índice mayor será n - 1");
		
		// Bucle a través de un Array
		System.out.println("Podemos usar bucles a través del array");
		for(int i = 0; i < autos.length; i++){
			System.out.println(autos[i]);
		}
		System.out.println("También podemos con For each");
		for(String i : autos){
			System.out.println(i);
		}

		// Arrays multidimensionales
		System.out.println("Crear un array multidimensional necesitará utilizar más llaves");
		int[][] myNums = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println("Acceder a un elemento en este tipo de arrays requiere indicar el índice más de una vez");
		System.out.println(myNums[1][2]);
		System.out.println("También podemos cambiar el valor de un elemento");
		myNums[1][2] = 9;
		System.out.println(myNums[1][2]);
		System.out.println("Podemos usar un bucle con otro anidado para observar el array de dos dimensiones");
		for (int i = 0; i < myNums.length; ++i) {
			for(int j = 0; j < myNums[i].length; ++j) {
				System.out.println(myNums[i][j]);
			}
		}
	}
}
