package ejeHashMap.eje03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario {

	public static void main(String[] args) {
		var diccionario = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 10 Palabras
		diccionario.put("hola", "hello");
		diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("ordenador", "computer");
        diccionario.put("mesa", "table");
        diccionario.put("ventana", "window");
        diccionario.put("manzana", "apple");
        diccionario.put("libro", "book");
        diccionario.put("coche", "car");
        diccionario.put("perro", "dog");
		
        System.out.println("Seleccionando palabras...");
		ArrayList<String>seleccionadas = obtenerPalabras(diccionario,5);
		
		int puntos = 0;
		for (String palabra:seleccionadas) {
			System.out.println("Palabra en español " + palabra);
			System.out.println("Palabra en ingles ");
			String palabraUsuario = sc.nextLine();
			if (diccionario.get(palabra).equalsIgnoreCase(palabraUsuario)) {
				System.out.println("Respuesta correcta");
				puntos++;
			} else {
				System.out.println("Respuesta incorrecta");
			}
		}
		System.out.println("Total de puntos = " + puntos);
	}

	// Primera version
	private static ArrayList<String> obtenerPalabras(HashMap<String, String> diccionario, int numPalabras) {
		var listaEspañol = new ArrayList <String> (diccionario.keySet());
		var listaSeleccionada = new ArrayList <String> ();
		var rd = new Random();
		
		for (int i = 1; i <= numPalabras; i++) {
			boolean nueva = false;
			do {
				int posicion = rd.nextInt(listaEspañol.size());
				String palabra = listaEspañol.get(posicion);
				if (!listaSeleccionada.contains(palabra)) {
					listaSeleccionada.add(palabra);
					nueva = true;
				}
			} while (!nueva);
		}
		
		return listaSeleccionada;
	}
	
	// Segunda version
	private static ArrayList<String> obtenerPalabras2(HashMap<String, String> diccionario, int numPalabras) {
		
		List <String> resu = new ArrayList<String>(diccionario.keySet());
		// Barajeo
		Collections.shuffle(resu);
		
		resu = resu.subList(0, numPalabras);
		
		return new ArrayList<String>(resu);
		
	}
}