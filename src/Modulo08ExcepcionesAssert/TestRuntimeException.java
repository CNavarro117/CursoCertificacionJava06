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
public class TestRuntimeException {
    static void test() throws RuntimeException{
        try{
            System.out.println("test ");
            throw new RuntimeException();
        } catch(Exception ex){System.out.println("exception ");}
    }
    
    /*
    La salida es "test exception end"
    El metodo "test()" lanza una nueva Exception, 
    Que es cachada por el bloque try-catch
    que invoca el metodo "test()"
    */
    public static void main(String[] args) {
        try{
            test();
        } catch(RuntimeException ex){
            System.out.println("runtime ");
        }
        System.out.println("end ");
    }
}
