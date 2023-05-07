public class MethodOverloading{
	static int plusMetodoInt(int x, int y){
		return x + y;
	}
	static double plusMetodoDouble(double x, double y){
		return x + y;
	}
	public static void main(String[] args){
		// Sobrecarga de métodos
		System.out.println("Siempre cuando haya un método que cubra los argumentos utilizados podremos utilizarlos");
		int myNum1 = plusMetodoInt(8, 5);
		double myNum2 = plusMetodoDouble(4.3, 6.45);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
		System.out.println("También podríamos hacerlo con el número de argumentos");
	}
}
