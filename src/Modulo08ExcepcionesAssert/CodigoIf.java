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
public class CodigoIf {

    public static void main(String[] args) {
        Float pi = new Float(3.14f);
        if (pi > 3) {
            System.out.println("pi is bigger than 3.");
        } else {
            System.out.println("pi is not bigger than 3.");
        } finally { // Compilation fails
                System.out.println("Have a nice day");
        }
    }
}
