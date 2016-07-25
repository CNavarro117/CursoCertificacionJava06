/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndCollections;

import java.util.*;

/**
 *
 * @author CNR
 */
public class EjemploLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> s2 = new LinkedHashSet<String>();
        s2.add("Hola");
        s2.add("Hola amigo");
        s2.add("Encantado de conocerte");
        s2.add("Se me hace tarde");
        s2.add("Espero verte pronto");
        s2.add("Adios");

        s2.add("Adios"); //Intentamos añadir un duplicado.

//        System.out.println("Numero de elementos: " + s2.size() + "\n");
        System.out.println("Numero de elementos: " + s2.size());
        System.out.println("Esta vacio: " + s2.isEmpty());
        System.out.println("Contiene \"Hola\": " + s2.contains("Hola"));
        // falso, hay que mandar un Set para que compare si son iguales
        System.out.println("Igual: " + s2.equals("Hola"));
        System.out.println("To String: " + s2.toString());
        Iterator i = s2.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        s2.remove("Hola"); // elimina un elemento
    }
}
