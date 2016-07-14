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
public class TestException_04 {
    public static void main(String[] args) {
        try{
            // si se genera una excepcion 
            // cual salida es posible
            // Respuesta "abc"
        } catch(NullPointerException e1){
            System.out.println("a");
        } catch(Exception e2){
            System.out.println("b");
        } finally{
            System.out.println("c");
        }
        
    }
          
}
