package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
            String name = "Jorge";
            System.out.println("Ejercicio 1 - Nombre: " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
            int age = 37;
            System.out.println("Ejercicio 2 - Edad: " + age);

        // 3. Crea una variable double con tu altura en metros.
            double height = 1.77;
            System.out.println("Ejercicio 3 - Altura: " + height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
            boolean ilikeprogramming = true;
            System.out.println("Ejercicio 4 - Me gusta programar: " + ilikeprogramming);

        // 5. Declara una constante con tu email.
            final String gmail = "arcehuertajorge@gmail.com";
            System.out.println("Ejercicio 5 - Email: " + gmail);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
            char Myinitial = 'J';
            System.out.println("Ejercicio 6 - Inicial: " + Myinitial);


        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
            String location = "Hermosillo";
            System.out.println("Ejercicio 7 - Localidad: " + location);
            location = "Los Angeles";
            System.out.println("Ejercicio 7 - Localidad: " + location);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
            int a = 5;
            int b = 15;
            System.out.println("Ejercicio 8 - Suma: " + (a + b));
        // 9. Imprime el tipo de dos variables creadas anteriormente.
            System.out.println("Ejercicio 9 - Tipo de name: " + ((Object)name).getClass().getSimpleName());
            System.out.println("Ejercicio 9 - Tipo de age: " + ((Object)age).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
            int c;
            c = 20;
            System.out.println("Ejercicio 10 - Valor de c: " + c);
    }
}
