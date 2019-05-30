package fase;
/**
 * @author Sandra Mesquita
 */
import java.util.Scanner;
public class Fase {

    public static void main(String[] args) {
       Lista list = new Lista ();
       
       list.inserir(1);
       list.inserir(2);
       list.inserir(3);
       list.inserir(4);
       list.inserir(5);
     
       list.inserir(4);
       list.inserir(3);
       list.inserir(2);
       list.inserir(1);    
      
      
       
       
       System.out.println (list.imprimir(3) );
       System.out.print (list.imprimir() );
       
       
       
    }
    
}
