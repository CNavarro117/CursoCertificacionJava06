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
public class TestException_03 {
    public static void main(String[] args) {
        try {
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        } catch (Exception ex){
            System.out.println("Exception");
        } catch (NullPointerException npe){ 
            // Error la excepcion padre cacha todas las posibles
            // excepciones y no deja acceder a esta segunda excepcion
            System.out.println("NullPointerException");
        }
    }
}
