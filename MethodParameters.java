public class MethodParameters {
	static void miMetodo(String fname) {
		// Parametros y argumentos, en este caso fname es una parametro
		System.out.println(fname + " Refsnes");
	}
	static void miMetodo2(String fname, int age) {
		// En este metodo se usan dos parametros 
		System.out.println(fname + " is " + age);
	}
	static int mimetodo3(int x) {
		return 5 + x;
	}
	static int mimetodo4(int x) {
		return x + y;
	}
	static void checkAge(int x) {

		if(age < 18){
			System.out.println("Acceso denegado, no eres suficiente mayor");
		}else{
			System.out.println("Acceso habilitadp, eres suficiente mayor");
		}
	}
	public static void main(String[] args) {
		System.out.println("Utilizar parametros como argumentos, para agregar más solo se necesita una coma");
		miMetodo("Liam");
		miMetodo("Jenny");
		miMetodo("Anja");
		System.out.println("Los argumentos enviados pasan a ser parametros, en este caso a ser fname");
		// Multiples parametros
		System.out.println("Podemos usar muchos parametros, pero en el método debemos tener el mismo número de ellos");
		miMetodo("Liam", 5);
		miMetodo("Jenny", 8);
		miMetodo("Anja", 31);
		// Valores de retornos
		System.out.println("Podemos utilizar el int como valor de retorno");
		System.out.println(miMetodo3(5);
		System.out.println("Tambien podemos utilizar más de un parametro");
		System.out.println(miMetodo4(7, 4);
		System.out.println("Podemos declarar el resultado en una variable");
		int z = miMetodo4(6, 8);
		System.out.println(z);
		System.out.println("También podemos utilizar otras sentencias como el if");
		checkAge(21);
	}
}
