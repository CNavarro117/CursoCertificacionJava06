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
public class CastException {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("two"); // java.lang.NumberFormatException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
