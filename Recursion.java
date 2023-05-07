public class Recursion{
	public static void main(String[] args){
		System.out.println("Es el uso de la técnica de llamar a la misma función dentro de su bloque de código");
		System.out.println("usar break sería aconsejable para no generar procesos infinitos");
		// Ejemplo
		int result = sum(10);
		System.out.println(result);
		System.out.println("Es el uso de la técnica de llamar a la misma función dentro de su bloque de código");
		// condición halting
		System.out.println("En una recursión para agregar todos los números entre 5 y 10 podemos hacer lo siguiente");
		// Ejemplo
		int result2 = sum2(5, 10);
		System.out.println(result2);
		System.out.println("debemos ser cuidadosos porque podemos incurrir en una función que nunca termina o que usa mucha memoria");
	}
	public static int sum(int k){
		if(k > 0){
			return k + sum(k - 1);
		}else{
			return 0;
		}
	}
	public static int sum2(int start, int end){
		if(end > start){
			return end + suma2(start, end - 1);
		}else{
			return end;
		}
	}
}
