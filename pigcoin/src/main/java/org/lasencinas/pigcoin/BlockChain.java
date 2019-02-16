
package org.lasencinas.pigcoin;

import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;


public class BlockChain {
    
    //Iniciando variables
    List <Transaction>Blockchain= new LinkedList();
    
    //Fin inicio variables
    
    
    //Constructor
    public BlockChain(){
        
    }
    //Fin Constructir
    
    
    //Iniciando Getters y setters
    public List<Transaction> getBlockchain(){
        return this.Blockchain;
    }
    
    //Fin getters y setters
    
    
    //Inicio metodos
    
    
    public void addOrigin (Transaction transaccion){
        getBlockchain().add(transaccion);
    }
  
    
    public void summarize(){
       for(Transaction transaction : getBlockchain()) {
           System.out.println(transaction.toString());
        }
    }
    
    
    public void summarize(int index) {
        System.out.println(getBlockchain().get(index).toString());
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
}
