/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo08ExcepcionesAssert;

import java.io.IOException;

class A2 {

    public void process() {
        System.out.println("A, ");
    }
}

class B2 extends A2 {
    // No se puede sobreescribir un metodo con mas errores
    // de los que tiene, en este caso no tiene ni uno.
    public void process() throws IOException {
        super.process();
        System.out.println("B,");
        throw new IOException();
    }  
    public static void main(String[] args) {
        try {
            new B2().process();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
