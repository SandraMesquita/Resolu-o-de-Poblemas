package despojados;

/**
 * @author Sandra Mesquita
 */
import java.lang.Math;
import java.util.Scanner;

public class Despojados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long numero = teclado.nextLong();
        //variavel para contar a quantidade de divisores;        
        double contDiv = 0;
        //variaveis para gardar os primos anteriores e os atuais; 
        int pAnt, pAtu;

        pAnt = 0;
    
        // Fatoracao;
        if (numero == 1) {
            contDiv = 1;
        } 
        else {
            //incializando com o primeiro primo;
            for (pAtu = 2;numero != 0 && pAtu <= Math.sqrt(numero);) {
                //verifica a divisao
                while (numero % pAtu == 0) {
                  numero = numero/pAtu;
                  //impede numeros igual de serem contados
                  if (pAnt != pAtu){
                    contDiv ++;
                    
                    pAnt = pAtu;
                  }
                  
                }
                // passa para o proximo primo;
                 if (pAtu == 2){
                     pAtu = 3;
                 }
                 else
                     pAtu +=2;
            }
        }
        //se sobrar algo da fatoração acima, entao esse numero e um primo.
        if (numero> 1){
            contDiv ++;
        }
        /**
         * Baseado em Conjunto de Potencia, tem-se o calculo da quantidade de
         * todos os cojuntos possiveis ignorando o vazio e os de 1 item.
         */
        int resultado = (int) (Math.pow(2, contDiv) - (contDiv + 1));
             
        System.out.println(resultado);
        
    }

}
