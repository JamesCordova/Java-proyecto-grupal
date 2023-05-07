public class Strings {
    public static void main(String[] args){
        System.out.println("1. String o Cadenas en Java");
        System.out.println("Las cadenas se utilizan para almacenar texto."); 
        System.out.println("Una variable de tipo String contiene una coleecion de caracteres entre comillas dobles"); 
        //Ejemplo
        String saludo = "Holaa";
        
        System.out.println("2. Longitud de la cadena"); 
        System.out.println("Una cadena en java es en realidad un objeto, que contiene metodos que pueden realizar ciertasoperaciones en cadenas."); 
        System.out.println("Por ejemplo, la longitud de una cadena se puede  encontrar con el metodo 'length()'"); 
        //Ejemplo
        int longitud = saludo.length();     //longitud -> 5    
        
        System.out.println("3. Algunos metodos mas de cadena - string"); 
        System.out.println("Existen varios metodos para STRING disponibles como por ejemplo"); 
        System.out.println("toUpperCase() y toLowerCase()");
        //Ejemplo
        System.out.println(saludo.toUpperCase()); // Out -> "HOLAA"
        System.out.println(saludo.toLowerCase()); // Out -> "holaa" 
        
        System.out.println("4. Encontrar un caracter en una cadena"); 
        System.out.println("El metodo 'indexOf()' devuelve el indice o posicion de la primera aparicion de un texto especifico en una cadena");
        //Ejemplo
        System.out.println(saludo.indexOf("a")); // Out -> 3  
    }   
}
