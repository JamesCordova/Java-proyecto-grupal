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
	}
}
