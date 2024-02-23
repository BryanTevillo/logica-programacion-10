
package com.generation;

//Importaciones de la api de java utilizadas
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Se declara HashMap para almacenar el diccionario
    HashMap<String, String> dictionary = new HashMap<>();

    // Se guardan pares clave/valor
    dictionary.put("Correr", "Run");
    dictionary.put("Hablar", "Talk");
    dictionary.put("Computadora", "Computer");
    dictionary.put("Escuela", "School");
    dictionary.put("Perro", "Dog");
    dictionary.put("Gato", "Cat");
    dictionary.put("Mesa", "Table");
    dictionary.put("Codigo", "Code");
    dictionary.put("Juguete", "Toy");
    dictionary.put("Libro", "Book");
    dictionary.put("Ventana", "Window");

    dictionary.put("Mano", "Hand");
    dictionary.put("Cabeza", "Head");
    dictionary.put("Palomitas", "Popcorn");
    dictionary.put("Impresora", "Printer");
    dictionary.put("Carro", "Car");
    dictionary.put("Silla", "Chair");
    dictionary.put("Tarjeta", "Card");
    dictionary.put("Mama", "Mom");
    dictionary.put("Papa", "Dad");
    dictionary.put("Tenedor", "Fork");
    dictionary.put("Tio", "Uncle");

    // Se realiza una ArrayList del conjunto de claves del diccionario
    List<String> listKey = new ArrayList<>(dictionary.keySet());
    int count = 0;
    int numberQuestions = 5;

    // Se realiza un for para las pregntas 5
    for (int i = numberQuestions; i >= 1; i--) {
      // se obtiene una key random usando metodo nextInt de la clase Random
      String spanishWord = listKey.get(new Random().nextInt(20));
      System.out.println("Ingresa la traduccion del ingles de la siguiente palabra: " + spanishWord);
      String englishWord = in.nextLine();
      // Se valida cuantas respues buenas obtuvo el cliente
      if (englishWord.toUpperCase().equals(dictionary.get(spanishWord).toUpperCase())) {
        count++;
      }
    }

    // Se imprime el resultado
    System.out.println("Respuestas correctas: " + count + " | Respuestas incorrectas: " + (count - numberQuestions)
        + " | " + "De un total de preguntas: " + numberQuestions);

    in.close();
  }
}
