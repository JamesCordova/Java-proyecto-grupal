public class ForLoop{
	public static void main(String[] args){
		System.out.println("El bucle For tiene 3 sentencias al llamar al método");
		// Ejemplo
		for(int i = 0; i <= 10; i += 2){
			System.out.println(i);
		}	
		System.out.println("El bucle For each es usado generalmente con elementos de un array");
		// Ejemplo
		String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};
		for(String i : autos){
			System.out.println(i);
		}
	}
}
