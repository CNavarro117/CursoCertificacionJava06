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
public class TestAssert02 {

    public static void main(String[] args) {
        someMethod(null);
    }

    public static void someMethod(Object value) {
        if (value == null) {
            throw new IllegalArgumentException("value is null");
        }
        /*
        if(value == null){
            throw new AssertionException("value is null");
        }
        assert value != null, "value is null";
        assert value == null;
         */
        System.out.println(value.getClass());
    }
}
