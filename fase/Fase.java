/**
 * @author Sandra Mesquita
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class bla {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
     //qtdNum = quantidade de competidoes.
     //qtdCamo = quantidade de Campeoes (clssificados).
       int qtdNum, qtdCamp ;
       
       qtdNum = teclado.nextInt();
       qtdCamp = teclado.nextInt();
       
       ArrayList<String> competidores = new ArrayList<String>(); 
       for (int i = 0; i < qtdNum; i++){
           int numero = teclado.nextInt();
           competidores.add("" + numero);
       }
       // ordenando de forma decescente.
       Collections.sort(competidores, Collections.reverseOrder());       
       
       
       int count = 0;
       String str = "";
        
        //verificando os classificados.
       while( count < competidores.size()){
           
           
           if (count < qtdCamp || competidores.get(count).equalsIgnoreCase(competidores.get(count -1) ) ){
                count ++;
                str = ""+ count;
            }
           else
               break;
        
       }
       System.out.println (str );
             
    }
    
}
