package basic.c07_functions;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        welcomeMessage();
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        welcomeName("Jorge");
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        twoNumbers(10, 5);
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        square(5);
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        parOrImpar(7);
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        ageCheck(20);
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        stringLength("Hola, mundo!");
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        arrayInt(new int[]{1, 2, 3, 4, 5});
        // 9. Escribe un método que reciba un número y retorna su factorial.
        factorial(5);   
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Ana");
        list.add("Luis");
        list.add("María");
        arrayListString(list);
    }
    //1
    public static void welcomeMessage() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }
    //2
    public static void welcomeName(String name) {
        System.out.println("¡Hola " + name + ", bienvenido al curso de Java desde cero!");
    }
    //3
    public static void twoNumbers(int a, int b) {
        int result = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + result);
    }
    //4
    public static void square(int n) {
        int result = n * n;
        System.out.println("El cuadrado de " + n + " es: " + result);
    }
    //5
    public static void parOrImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " es un número par.");
        } else {
            System.out.println(n + " es un número impar.");
        }
    }
    //6
    public static void ageCheck(int age) {
        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
    //7
    public static void stringLength(String str) {
        System.out.println("La longitud de la cadena es: " + str.length());
    }
    //8
    public static void arrayInt(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("La media del array es: " + average);
    }
    //9
    public static void factorial(int n) {
        int factorial = 1;
        int number = 5; // Cambia este número para calcular el factorial de otro número
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
    //10
    public static void arrayListString(java.util.ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

}
