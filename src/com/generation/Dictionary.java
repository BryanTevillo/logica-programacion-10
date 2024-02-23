package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Dictionary {

  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
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
    dictionary.put("Head", "Cabeza");
    dictionary.put("Popcorn", "Palomitas");
    dictionary.put("Impresora", "Printer");
    dictionary.put("Carro", "Car");
    dictionary.put("Silla", "Chair");
    dictionary.put("Tarjeta", "Card");
    dictionary.put("Mama", "Mom");
    dictionary.put("Papa", "Dad");
    dictionary.put("Tenedor", "Fork");
    dictionary.put("Tio", "Uncle");

    Set<String> setKey = dictionary.keySet();
    List<String> listKey = new ArrayList<>(setKey);
    for (int i = 4; i >= 0; i--) {
      System.out.println(listKey.get(new Random().nextInt(20)));
    }
  }
}
