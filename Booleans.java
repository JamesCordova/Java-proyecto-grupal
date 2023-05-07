public class Booleans {
    public static void main(String[] args){
        System.out.println("Boolean en Java");
        System.out.println("Muy a menudo en java, se recurrira a variables que solo necesitan 2 valores como:");
        System.out.println("1. Encendido/Apagado");
        System.out.println("2. Yes/No");
        System.out.println("3. Verdadero/Falso");
        System.out.println("\nExpresion Booleana");
        System.out.println("Una expresion booleana devuelve un valor boleano: true o false");
        //Ejemplo
        int x = 10;
        int y = 9;
        System.out.println(x < y); //retorna FALSE
        System.out.println("\nEjemplo de la vida real:");
        System.out.println("En el siguiente ejemplo aplicaremos el uso de booleanos para validar si una persona tiene mas de 18 años para votar");
        //Ejemplo
        int miEdad = 25;
        int edadParaVotar = 18;
        System.out.println(miEdad >= edadParaVotar); //Retorna TRUE
        
    }    
}
