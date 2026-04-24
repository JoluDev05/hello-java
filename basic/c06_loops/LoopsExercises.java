package basic.c06_loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
            int index = 0;
            while (index < 10) {
                index++;
                System.out.println(index);
            }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
            String[] names = {"Jorge", "Luis", "joludev"};
            int index2 = 0;
            do {
                System.out.println(names[index2]);
                index2++;
            } while (index2 < names.length);
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

            for (int index3 = 0; index3 < 11; index3++) {
            System.out.println(index3 * 5);
        }
       
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println("Suma total: " + sum);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int number: numbers) {
            System.out.println(number);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        for (String element: set) {
            System.out.println(element);
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int index7 = 10; index7 > 0; index7--) {
            System.out.println(index7);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int index8 = 0; index8 < 20; index8++) {
            if (index8 % 3 == 0) {
                continue;
            }
            System.out.println(index8);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numbers2 = {1, 2, -3, 4, 5};
        for (int number: numbers2) {
            if (number < 0) {
                break;
            }
            System.out.println(number);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorial = 1;
        int number = 5; // Cambia este número para calcular el factorial de otro número
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
}
