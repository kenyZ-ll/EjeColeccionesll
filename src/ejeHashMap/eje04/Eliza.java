package ejeHashMap.eje04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Eliza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var diccionario = new HashMap <String,String>();
		Scanner sc = new Scanner(System.in);
		diccionario.put("HOLA", "Hola qué tal");
		diccionario.put("ENCANTADO", "Encantado de conocerte, yo tambien");
		diccionario.put("HORA", "Lo siento, no tengo reloj");
		diccionario.put("ADIOS", "Adios, espero volver a verte pronto");
		diccionario.put("NOMBRE", "Mi nombre es Eliza");
		
		
		String msgDefault ="Lo siento, no te comprendo";
		System.out.println("Bienvenido al sistema ELIZA");
		
		String frase;
		var fin = false;
		
		do {
			frase=sc.nextLine();
	
			boolean encontrar=false;
			for(String clave:diccionario.keySet()) {
				
				if(frase.toUpperCase().contains(clave)) {
					encontrar=true;
					System.out.println(diccionario.get(clave));
					if(frase.toUpperCase().contains("ADIOS")) {
						fin=true;
					}
					break;
					
				}
				
				
			}
			if (!encontrar) {
				System.out.println("No te comprendo");
			}
			
		}while (! fin);
		System.out.println("Gracias por su visita");
	
		
		
	}
}