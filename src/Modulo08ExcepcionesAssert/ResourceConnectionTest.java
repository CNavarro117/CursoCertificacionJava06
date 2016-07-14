package Modulo08ExcepcionesAssert;

/**
 *
 * @author CNR
 */
public class ResourceConnectionTest {
    public static void main(String[] args) {
        try{
            System.out.println("01");
            int i = 1/0;
            // Esta linea ya no es ejecutada debido al error anterior
            System.out.println("02"); 
        } catch(Exception e){
            System.out.println("Entro al catch");
            System.out.println(e.getMessage());
        }
        System.out.println("Regresa un valor");
    }
}
