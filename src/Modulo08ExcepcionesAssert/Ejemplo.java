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
public class Ejemplo {
    static void test(){
        try{
            String x = null;
            System.out.println(x.toString() + " ");
        } finally {
            System.out.println("finally");
        }
    }
    
    public static void main(String[] args) {
        try{test();}
        catch (Exception ex) {System.out.println("exception");}
    }
}
