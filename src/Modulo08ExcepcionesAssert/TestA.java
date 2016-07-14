/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo08ExcepcionesAssert;

/**
 *
 * @author CNavarro117
 */
class TestException extends Exception{}
class A02{
    public String sayHello(String name) throws TestException{
        if(name == null) throw new TestException();
        return "Hello " + name;
    }
}
public class TestA {
    public static void main(String[] args){
        // Se necesita un try, catch para poder ejecutar
        // el metodo , ya que el metodo sayHello de A02
        // lanza un throws TestException y necesita ser
        // cachado por un bloque o el metodo que lo implemente
        // necesita declarar el throws TestException
        new A02().sayHello("Aiko"); 
    }
}
