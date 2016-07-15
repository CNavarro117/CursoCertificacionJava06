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
public class Gotcha {

    public static void main(String[] args) {
        // insert code here
        /* Bloque 1
//        new Gotcha().go();
        ------------------------------------------
         */
        // Bloque 2 ------------------------------
//        try {
//            new Gotcha().go();
//        } catch (Error e) {
//            System.out.println("ouch");
//        }

        try {
            new Gotcha().go();
        } catch (Exception e) {
            System.out.println("ouch");
        }
    }

    void go() {
        go();
    }
}
