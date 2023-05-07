public class Variables{
    public static void main(String[] args){
        System.out.println("1. Variables Java");
        System.out.println("Las Variables son contenedores para almacenar valores de datos.");
        System.out.println("En Java, existen diferentes tipos de variables, por ejemplo");
        System.out.println("String - Almacena texto, como 'Hola'. Los valores de cadena estan etre comillas dobles");
        String str = "Hola";
        System.out.println("int - almacena enteros (numeros enteros), sin decimales, como 123 o -123");
        int x = 123;
        System.out.println("double - almacena numeros con decimales, como 19.99 o -19.99");
        double xdbl = 19.99;
        System.out.println("char - almacena caracteres individuales, como 'a' o 'B'. Los valores de char estan entre comillas simples");
        char chr = 'a';
        System.out.println("boolean - almacena valores con 2 estados: verdadero o falso");
        boolean flag = true;

        System.out.println("2. Imprimir Variables");
        System.out.println("El metodo 'println()' se utiliza a menudo para mostrar variables.");
        System.out.println("Para combinar texto y una variable, use el caracter '+'");
        System.out.println("Ejemplo: ");
        System.out.println("String name = \"Anthony\"");
        System.out.println("System.out.println(\"Hola\"+name)");
        System.out.println("out -> Hola Anthony");

        System.out.println("3. Declaraion de Multiples Variables");
        System.out.println("Para declarar mas de una variable del mismo tipo, podemos usar una lista separada por comas: ");
        System.out.println("En lugar de escribir:");
        System.out.println("int x = 5;");
        System.out.println("int y = 6;");
        System.out.println("int z = 50;");
        System.out.println("System.out.println(x+y+z);\n");
        System.out.println("Simplemente podemos escribir: ");
        System.out.println("int x = 5, y = 6, z = 50;");
        System.out.println("System.out.println(x+y+z);\n");
        System.out.println("Un solo valor para multiples variables");
        System.out.println("int x, y, z;");
        System.out.println("x = y = z = 50;");
        System.out.println("System.out.println(x+y+z);\n");

    }
}
