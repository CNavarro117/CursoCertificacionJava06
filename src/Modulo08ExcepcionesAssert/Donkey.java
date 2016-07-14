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
public class Donkey {

    /*
        Prueba cuando se ejecuta sin los assert no hay salida
        Cuando se prenden los assert, es decir se ejecuta la classe con"-ea"
        ocurre un "An AssertionError is thrown"
     */
    public static void main(String[] args) {
        boolean assertsOn = false;
        assert (assertsOn) : assertsOn = true;
        if (assertsOn) {
            System.out.println("assert is on");
        }
    }
}
