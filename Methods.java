public class Methods{
	static void miMetodo(){
		// Código a ejecutarse
		System.out.println("Método llamado");
	}
	public static void main(String[] args) {
		System.out.println("Para llamar a un método utilizamos lo siguiente");
		// llamado de método
		miMetodo();
		System.out.println("Static: significa que el método pertenece a la clase Methods y no un objeto");
		System.out.println("Void: significa que no se tiene un valor de retorno");
		System.out.println("Podemos llamarlo más de una vez con el mismo resultado");
		miMetodo();
		miMetodo();
		miMetodo();
	}
}
