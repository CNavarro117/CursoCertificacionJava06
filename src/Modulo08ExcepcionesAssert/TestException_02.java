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
public class TestException_02 {
    static void test(){
        try{
            String x = null;
            System.out.print(x.toString() + " ");
        } finally{
            System.out.print("finally ");
        }
    }
    
    public static void main(String[] args) {
        try{
            test();
        } catch(Exception ex){
            System.out.print("exception ");
        }
    }
    
}
