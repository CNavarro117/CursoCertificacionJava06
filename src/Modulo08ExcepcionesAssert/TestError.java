/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo08ExcepcionesAssert;

/**
 *
 * @author CNR
 */
public class TestError {

    // Codigo valido de static;
    static int[] x2 = {7, 6, 5, 4};

    static {
        x2[1] = 8;
//        x2[4] = 3; // java.lang.ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
//        counter(1); // stackOverFlowError
//        doOne(1); // stackOverFlowError

//        int[] x = {1, 2, 3, 4, 5};
//        for (int y = 0; y < 6; y++) {
//            System.out.println(x[y]); // ArrayIndexOutOfBoundsException
//        }
        
        // ---------------------------------
        for(int y = 10; y <10;y++){
            System.out.println("llamada a metodo");
        }
        
        for(int x3 = 0; x3 <1000000000;x3++){
            System.out.println("llamada a metodo");
        }

    }

    // Causa un stackOverFlowError
    static void counter(int i) {
        counter(++i);
    }

    static void doOne(int x) {
        doTwo(x);
    }

    static void doTwo(int y) {
        doThree(y);
    }

    static void doThree(int z) {
        doTwo(z);
    }

}
