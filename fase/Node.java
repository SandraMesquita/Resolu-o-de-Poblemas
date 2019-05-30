/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase;

/**
 *
 * @author Sandra Mesquita;
 */
public class Node {
    private int chave;
    private Node prox;
    
    public Node (int chave){
        this.chave = chave;
        this.prox = null;
    }
    public void setChave (int chave){
        this.chave = chave;
    }
    public int getChave (){
        return chave;
    }
    public void setProx (Node prox){
        this.prox = prox;
    }
    public Node getProx(){
        return prox;
    }
}
