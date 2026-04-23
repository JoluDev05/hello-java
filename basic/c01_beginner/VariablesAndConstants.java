package basic.c01_beginner;

/*
Clase 15 - Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=5294
*/

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Jorge";
        System.out.println(name);

        name = "JoluDev";
        System.out.println(name);

        // name = 37; Error (no podemos cambiar el tipo de dato)

        int age = 37;
        System.out.println(age);

        var email = "mouredev@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL1 = "mouredev@gmail.com";
        // EMAIL = "brais@gmail.com"; Es constante
        System.out.println(EMAIL1);

        final String EMAIL2 = "arcehuertajorge@gmail.com";
        System.out.println(EMAIL2);
    }
}
