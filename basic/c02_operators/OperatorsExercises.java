package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 10;
        int b = 3;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) a / b;
        int modulo = a % b;
        double potencia = Math.pow(a, b);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("Potencia: " + potencia);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int c = 5;
        c += 2; // c = c + 2
        System.out.println("Asignación suma: " + c);
        c -= 1; // c = c - 1
        System.out.println("Asignación resta: " + c);
        c *= 3; // c = c * 3
        System.out.println("Asignación multiplicación: " + c);
        c /= 2; // c = c / 2
        System.out.println("Asignación división: " + c);
        c %= 4; // c = c % 4
        System.out.println("Asignación módulo: " + c);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a > b); // Verdadero
        System.out.println(a != b); // Verdadero
        System.out.println(a >= 10); // Verdadero

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a < b); // Falso
        System.out.println(a == b); // Falso
        System.out.println( a <= 9); // Falso
        // 5. Utiliza el operador lógico and.
        boolean andResult = (a > b) && (c > 0);
        System.out.println("Resultado AND: " + andResult);

        // 6. Utiliza el operador lógico or.
        boolean orResult = (a > b) || (c > 0);
        System.out.println("Resultado OR: " + orResult);

        // 7. Combina ambos operadores lógicos.
        boolean combinedResult = (a > b) && (c > 0) || (a == 10);
        System.out.println("Resultado combinado: " + combinedResult);

        // 8. Añade alguna negación.
        boolean notResult = !(a > b);
        System.out.println("Resultado negado: " + notResult);


        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int d = 5;
        System.out.println("Valor original de d: " + d);
        System.out.println("Valor de d después de incremento: " + (d++)); // Post-incremento
        System.out.println("Valor de d después de decremento: " + (d--)); // Post-decremento
        System.out.println("Valor de d después de pre-incremento: " + (++d)); // Pre-incremento
        System.out.println("Valor de d después de pre-decremento: " + (--d)); // Pre-decrement

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean complexResult = ((a + b) > (c * 2)) && (d % 2 == 0);
        System.out.println("Resultado complejo: " + complexResult);
    }
}
