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
public class TestAssert03 {

    static void test() throws Error {
        if (true) {
            throw new AssertionError();
        }
        System.out.println("test");
    }

    public static void main(String[] args) {
//      Salida es Exception in thread "main" java.lang.AssertionError
//      Exception lanzada por main.
        try {
            test();
        } catch (Exception ex) {
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
