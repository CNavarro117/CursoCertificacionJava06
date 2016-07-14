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
public class testAssert {
    public static void main(String[] args) {
        
    }
    
    public void go (int x){
        assert(x > 0);
        switch(x){
            case 2:;
            default: assert false;
        }
    }
    
    private void go2(int x){assert(x<0);}
    
}
