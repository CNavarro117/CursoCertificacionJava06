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
class MyException extends Exception {
}

class Tire {
    void doStuff(){
    }
}

public class Retread extends Tire {

    public static void main(String[] args) {
        new Retread().doStuff();
    }

    // insert code here
//    void doStuff() {
//        void doStuff() throws MyException 
    void doStuff() throws RuntimeException {
//    void doStuff() throws ArithmeticException {
        System.out.println(
                7 / 0);
    }
}
