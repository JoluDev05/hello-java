package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Array antes de modificar: " + array[2]);
        array[2] = 10;
        System.out.println("Array después de modificar: " + array[2]);
        // 3. Crea un ArrayList vacío.
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("ArrayList antes de eliminar: " + arrayList);
        arrayList.remove(3); // Elimina el valor en el índice 3 (valor 4)
        System.out.println("ArrayList después de eliminar: " + arrayList);
        // 5. Crea un HashSet con 2 valores diferentes.
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        hashSet.add("Valor1");
        hashSet.add("Valor2");
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashSet.add("Valor2");
        hashSet.add("Valor3");
        System.out.println("HashSet después de añadir valores: " + hashSet);
        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove("Valor3");
        System.out.println("Hashit despues de eliminar un valor: " + hashSet);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        java.util.HashMap<String, String> hashMap = new java.util.HashMap<>();
        hashMap.put("Emergencias", "911");
        hashMap.put("Policia", "062");
        hashMap.put("Bomberos", "080");
        System.out.println("HashMap con contactos: " + hashMap);
        // 9. Modifica uno de los contactos y elimina otro.
        hashMap.replace("Bomberos", "505");
        hashMap.remove("Policia", "062");
        System.out.println("HashMap después de modificar y eliminar contactos: " + hashMap);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        int[] array2 = {1, 2, 3, 4, 5};
        java.util.ArrayList<Integer> arrayList2 = new java.util.ArrayList<>();
        for (int num : array2) {
            arrayList2.add(num);
        }
        System.out.println("ArrayList después de transformar el Array: " + arrayList2);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        java.util.HashSet<Integer> hashSet2 = new java.util.HashSet<>(arrayList2);
        System.out.println("HashSet después de transformar el ArrayList: " + hashSet2);
        java.util.HashMap<Integer, Integer> hashMap2 = new java.util.HashMap<>();
        for (Integer num : hashSet2) {
            hashMap2.put(num, num);
        }
        System.out.println("HashMap después de transformar el HashSet: " + hashMap2);
    }
}
