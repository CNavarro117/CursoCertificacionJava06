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
public class Emu {

    static String s = "-";

    public static void main(String[] args) {
//        int[] x = {7,6,5,4,3,2,1};
// // insert code here
//  for(int y: x){
// System.out.print(y + " ");
// }
        
        try {
            throw new Exception();
        } catch (Exception e) {
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
        } finally {
            s += "of ";
        }
        System.out.println(s);
    }
}
