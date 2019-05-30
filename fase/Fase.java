package fase;
/**
 * @author Sandra Mesquita
 */
import java.util.Scanner;
public class Fase {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        Lista list = new Lista ();
       int qtdNum, qtdCamp ;
       
       qtdNum = teclado.nextInt();
       qtdCamp = teclado.nextInt();
       
       for (int i = 0; i < qtdNum; i++){
           int numero = teclado.nextInt();
           list.inserir(numero);
       }
              
       System.out.println (list.imprimir(qtdCamp) );
       System.out.print (list.imprimir() );
       
       
       
    }
    
}
