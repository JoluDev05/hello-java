package basic.c08_oop;

/*
Clase 57 - Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=19902
*/

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Jorge", 22, "123456789A");

//        person.name = "Brais";
//        person.age = 38;

        person.sayHello();

        person.name = "Jorge Luis";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(23);
        System.out.println(person.getAge());

        var person2 = new Person("Jolu", 18, "123456789B");
        person2.sayHello();
    }
}