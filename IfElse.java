
public class IfElse {
    public static void main(String[] args){
        System.out.println("IF...ELSE en Java");
        System.out.println("Sabemos que java admite las condiciones logicas habituales de las matematicas");
        System.out.println("1. Menos que: a < b");
        System.out.println("2. Menor igual que: a <= b");
        System.out.println("3. Igual que: a == b");
        System.out.println("4. No igual a: a != b");
        System.out.println("Pero, java tiene las siguientes declaraciones fundamentales");
        System.out.println("1. Declaracion IF");
        //Ejemplo
        if (20 > 18) {
            System.out.println("20 es mayor que 18");
        }
        System.out.println("2. Declaracion ELSE");
        //Ejemplo
        int hora = 20;
        if (hora < 18) {
            System.out.println("Buen dia.");
        } else {
            System.out.println("Buenas noches.");
        }
        // SALIDA: "Buenas noches."
        System.out.println("3. Declaracion/Sentencia ELSE IF");
        //Ejemplo
        int hora2 = 22;
        if (hora2 < 10) {
            System.out.println("Buenos dias.");
        } else if (hora2 < 18) {
            System.out.println("Buen dia.");
        } else {
            System.out.println("Buenas tardes.");
        }
        // Salida -> "Buenas tardes"
    }    
}
