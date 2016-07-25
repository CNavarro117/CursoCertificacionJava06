package GenericsAndCollections;

import java.util.*;

/**
 *
 * @author CNR
 */

public class EjemploHashSet {
    /**
     * HashSet 
     * No permite duplicados
     * No esta ordenado
     * @param args 
     */
    public static void main(String[] args) {
        Set<String> s0 = new HashSet<String>();
        HashSet<String> s1 = new HashSet<String>();
        s1.add("Hola");
        s1.add("Hola amigo");
        s1.add("Encantado de conocerte");
        s1.add("Se me hace tarde");
        s1.add("Espero verte pronto");
        s1.add("Adios"); // metodo "add" para agregar

        s1.add("Adios"); //Intentamos añadir un duplicado.
        
        System.out.println("Numero de elementos: " + s1.size());
        System.out.println("Esta vacio: " + s1.isEmpty());
        System.out.println("Contiene \"Hola\": " + s1.contains("Hola"));
        // falso, hay que mandar un Set para que compare si son iguales
        System.out.println("Igual: "  + s1.equals("Hola"));
        System.out.println("To String: "  + s1.toString());
        
        Iterator i = s1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        s1.remove("Hola"); // elimina un elemento
      
        
    }
}
