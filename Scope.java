public class Scope{
	public static void main(String[] args){
		System.out.println("El alcance o Scope explica porque no podemos utilizar una variable");
		// No podemos utilizar la variable x antes de su propia declaración
		int x = 100
		// A partir de su declaración podemos recién utilizar x
		System.out.println(x);

		// Scope block
		// Con este marcamos con llaves desde que linea a otra podemos marcar el alcance de una variable
		{
			int y = 100;
			// Ahora podemos utilizar dentro de las llaves
			System.out.println(y);
		}
		// ya no podemos usar y ahora
		System.out.println("En las sentencias for, podemos utilizar las variables declaradas dentro del bloque");
	}
}
