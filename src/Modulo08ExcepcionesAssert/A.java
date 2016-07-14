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
public class A {

    public void method1() {
        try {
            B b = new B();
            b.method2();          
            // More code here
        } catch (TestException te) {
            throw new RuntimeException(te);
        } 
    }

    public static void main(String[] args) {
        A a = new A();
//        try {
            a.method1(); // Line 33 must be called within a try block
//        } catch (Exception e){
//            System.out.println("error del metodo a");
//        }
    }
}

class B {
    public void method2() throws TestException {
        // More code here
    }

    void process() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void process() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class TestException extends Exception {
}
