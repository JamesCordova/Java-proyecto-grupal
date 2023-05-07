public class Switch {
    public static void main(String[] args){
        System.out.println("Declaracion Switch");
        System.out.println("En lugar de escribir varias declaraciones 'IF' o 'If Else'");
        System.out.println("Podemos usar la declaracion 'Switch'");
        System.out.println("Funcion:");
        System.out.println("1. Se evalua solo una vez");
        System.out.println("2. El valor de la expresion se compara con cada uno de los 'case'");
        System.out.println("Si hay una coincidencia, se ejecutara el bloque asociado");
        //Ejemplo
        int elDia = 4;
        switch (elDia) {
            case 1:
                System.out.println("Lunes");
            break;
        
            case 2:
                System.out.println("Martes");
            break;
        
            case 3:
                System.out.println("Miercoles");
            break;
        
            case 4:
                System.out.println("Jueves");
            break;
        
            case 5:
                System.out.println("Viernes");
            break;
  
            case 6:
                System.out.println("Sabado");
            break;
  
            case 7:
                System.out.println("Domingo");
            break;
        }
        // Outputs "Jueves" (dia 4)
        System.out.println("La Palabra BREAK");
        System.out.println("El usar 'break' saldra de la sentencia asociada al bloque");
        System.out.println("Por lo que se detendra la ejecucion, no hay necesidad de mas pruebas"); 
    }   
}
