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
public class Clumsy {

    /* 
    Todas las declaraciones del "assert" son correctas
    Menos la del metodo doStuff(); ya que regresa un void, 
    un vacio que no puede convertirse a String.
     */
    public static void main(String[] args) {
        int j = 7;
        assert false : null;
        assert (++j > 7);
        assert (++j > 8) : "hi";
        assert (j > 10) : j = 12;
        assert (j == 12) : doStuff();
        assert (j == 12) : new Clumsy();
    }

    static void doStuff() {
    }
}
