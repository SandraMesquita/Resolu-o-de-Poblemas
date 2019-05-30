package fase;
/**
 * @author Sandra Mesquita
 */
public class Lista {
   
    private Node inicio;
    
    public Lista (){
        inicio = null;
    }
    
    public void inserir(int chave){
        Node novo = new Node (chave);
        
        if (inicio == null){
           
           inicio = novo;                    
        }
        else if (inicio.getChave() <= chave){
             Node aux = inicio;
               inicio = novo;
               novo.setProx(aux);
        }
        else{
           
           for ( Node i = inicio; i != null ; i = i.getProx()){
              
               if (i.getProx() != null && chave <= i.getChave() && chave >= i.getProx().getChave()){
                   Node aux =i.getProx();
                   i.setProx(novo);
                   novo.setProx(aux);
                   break;
               }
               else if (chave <= i.getChave() && i.getProx() == null){
                    i.setProx(novo);
                    break;
               }
               
           }
        }
    }
    public String imprimir(int n){
        String str = "";
        Node p = inicio;
        
        for (int count = 1; count < n || p.getChave() == p.getProx().getChave(); p = p.getProx()){
            count ++;
            
            str = "" + count;
        }
        return str;
    }
    public String imprimir (){
        String str ="";
        for (Node p = inicio; p != null; p= p.getProx()){
            str= str + "" + p.getChave();
        }
        return str;
    }
}
