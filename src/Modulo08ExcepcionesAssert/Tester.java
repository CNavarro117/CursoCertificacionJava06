/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo08ExcepcionesAssert;

class A3{
    void foo() throws Exception{ throw new Exception();}
}
class SubB2 extends A3{
    void foo() {System.out.println("B");}
}

public class Tester {
    public static void main(String[] args) {
        A3 a = new SubB2();
        a.foo(); // error por la exception que marca la class A3
    }
}
