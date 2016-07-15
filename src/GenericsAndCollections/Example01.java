/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CNR
 */
public class Example01 {

    public static void main(String[] args) {
// INSERT DECLARATION HERE
// List<List<Integer>> table = new List<List<Integer>>(); // List is abstract; cannot be instantiated
 List<List<Integer>> table = new ArrayList<List<Integer>>(); // Correcto
// List<List<Integer>> table = new ArrayList<ArrayList<Integer>>(); // incompatible types: ArrayList<ArrayList<Integer>> cannot be converted to List<List<Integer>>
// List<List, Integer> table = new List<List, Integer>(); // Mal sintaxis
// List<List, Integer> table = new ArrayList<List, Integer>();
// List<List, Integer> table = new ArrayList<ArrayList, Integer>();
// None of the above
        for (int i = 0; i <= 10; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= 10; j++) {
                row.add(i * j);
            }
            table.add(row);
        }
        for (List<Integer> row : table) {
            System.out.println(row);
        }
    }
}
