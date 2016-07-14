package Modulo08ExcepcionesAssert;

public class TestB {

    public static void main(String[] args) {
        new B().process();
    }
    
    static class A1 {
        void process() throws Exception {
            throw new Exception();
        }
    }

    static class B extends A1 {
        void process(){
            System.out.println("B");
        }
    }
    
    
}
