public class BreakContinue{
	public static void main(String[] args){
		System.out.println("Break: usado antes en el Switch, también nos sirve para salir de un bucle");
		// Ejemplo
		System.out.println("En este caso el bucle terminará cuando 'i' sea 4");
		for(int i = 0; i < 10; i++){
			if(i == 4){
				break;
			}
			System.out.println(i);
		}
		System.out.println("Continue: por otro lado este continua a la siguiente iteración del bucle");
		// Ejemplo
		System.out.println("En este caso se saltará cuando 'i' sea 4 u 8 pero se terminara cuando se cumpla la condición");
		for(int i = 0; i < 10; i++){
			if( i == 4 || i == 8){
				continue;
			}
			System.out.println(i);
		}
	}
}
