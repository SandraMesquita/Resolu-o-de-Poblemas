/**
 * @author Sandra Mesquita
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
public class Fase {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       
     //qtdNum = quantidade de competidoes.
     //qtdCamo = quantidade de Campeoes (clssificados).
       int qtdNum, qtdCamp ;
       
       qtdNum = teclado.nextInt();
       qtdCamp = teclado.nextInt();
       
       ArrayList<Integer> competidores = new ArrayList<>(); 
       for (int i = 0; i < qtdNum; i++){
           int numero = teclado.nextInt();
           competidores.add(numero);
       }
       
       // ordenando de forma decescente.
       Collections.sort(competidores, Collections.reverseOrder());       
       System.out.println(competidores);
       
       int count = 0;
               
        //passar por todos os itens
       while( count < competidores.size()){
           
           /* verifico diretamente o problema, parto da comparação do que ficaria
           *  na minha ultima colocação e comparo sempre com o anterior, pelo fato
           *  de evitar comparar com uma posição vazia.
           */
           if (qtdCamp < qtdNum && Objects.equals(competidores.get(qtdCamp), competidores.get(qtdCamp - 1)) ){
                qtdCamp ++;
            }
           else
               break;
        }

        System.out.println (""+ qtdCamp );
             
    }
    
}
