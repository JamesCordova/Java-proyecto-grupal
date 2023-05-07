
public class TypeCasting {
    public static void main(String[] args){
        System.out.println("Tipos de Conversion en Java");
        System.out.println("La conversion de tipos es cuando se asigna un valor de un tipo de dato primitivo a otro tipo");
        System.out.println("En Java existe 2 tipos de conversion:");
        System.out.println("1. Windening Casting (automatico): conversion de un tipo mas a un tipo mas grande");
        System.out.println("byte-> short-> char-> int-> long-> float->double");
        
        //Ejemplo
        int x = 9;
        double y = x;           // Conversion de int a double (automatica)
        System.out.println(x);  // Out 9
        System.out.println(y);  // Out 9.0
        
        System.out.println("2. Narrowing Casting (manual): conversion de un tipo mas grande a un tipo mas pequeño");
        System.out.println("double-> float-> long-> int-> char-> short->byte");
        
        //Ejemplo
        double elDouble = 9.78d;
        int entero = (int) elDouble;    // Conversion Manual: double a int
        System.out.println(elDouble);   // Out 9.78
        System.out.println(entero);     // Out 9

    }
}
