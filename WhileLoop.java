public class WhileLoop{
	public static void main(String[] args){
		System.out.println("Los bucles se ejecutaran siempre y cuando una condición específica se cumple");
		System.out.println("Generalmente se tiene una variable de control");
		// Ejemplo Bucle while
		int i = 0;
		while(i < 5){
			System.out.println(i);
			i++; // Debemos incrementar la variable usada sino el bucle nunca acabará
		}
		// Ejemplo Bucle do while
		System.out.println("El bucle doWhile siempre se ejecuta al menos una vez");
		// Este bloque de código se hará al menos una vez siempre
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}
		while(i < 5); // Este se verificará al final del bloque
		
	}
}
