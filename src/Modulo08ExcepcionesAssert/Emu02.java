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
public class Emu02 {

    static String s = "-";

    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    s += "ic ";
                }
                throw new Exception();
            } catch (Exception x) {
                s += "mc ";
            } finally {
                s += "mf ";
            }
            throw new Exception();

        } catch (Exception e) {

        } finally {
            s += "of ";
        }
        System.out.println(s);
    }

}
