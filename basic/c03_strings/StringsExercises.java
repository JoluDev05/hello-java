package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
            String firstName = "Jorge";
            String lastName = "Arce";
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);

        // 2. Muestra la longitud de una cadena de texto.
            System.out.println(fullName.length());

        // 3. Muestra el primer y último carácter de un string.
            System.out.println("Primer caracter: " + fullName.charAt(0));
            System.out.println("Último caracter: " + fullName.charAt(fullName.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
            System.out.println(fullName.toUpperCase());
            System.out.println(fullName.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
            System.out.println(fullName.contains("Jorge"));

        // 6. Formatea un string con un entero.
            int age = 22;
            String formatedString = String.format("Hola, %s. Tengo %d.", fullName, age);
            System.out.println(formatedString);

        // 7. Elimina los espacios en blanco al principio y final de un string.
            String stringWithSpaces = " Hola, me llamo Jorge ";
            System.out.println(stringWithSpaces.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
            System.out.println(" Hola, bro ".replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
            String string1 = "Hola";
            String string2 = "Hola";
            System.out.println("Son iguales?: " + string1.equals(string2));

        // 10. Comprueba si dos strings tienen la misma longitud.
            System.out.println("Tienen la misma longitud?: " + (string1.length() == string2.length()));

    }
}
