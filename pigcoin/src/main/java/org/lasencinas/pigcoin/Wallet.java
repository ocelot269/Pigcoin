
package org.lasencinas.pigcoin;

import java.security.PrivateKey;
import java.security.PublicKey;


public class Wallet {
    
//-------------------------Inicianlizando variables----------------------------------//
   
    
   private PrivateKey sKey=null;
   private PublicKey address=null;
   private double total_input=0;
   private double total_output=0;
   private double balance = total_input - total_output;
   private double inputTransacions=0;
   private double outputTransactions=0;
   
//-------------------------------Fin variables---------------------------------------//   
   
   
   public Wallet() {
        

 }
   
   
//----------------------------Getters and Setters--------------------------------------//   

   
   public PrivateKey getSK(){
       return sKey;
   }
   
   
   public void setSK(PrivateKey sKey){
       this.sKey= sKey;
   }
   
   
   public PublicKey getAddress(){
       return address;
   }
   
   public void setAddress(PublicKey key){
       this.address=key;
   }
   
   
   public double getTotalInput(){
       return this.total_input;
   }
   
   
   public void setTotalInput(double transaccion){
       this.total_input+=transaccion;
   }
   
   
   public double getTotalOutput(){
       return this.total_output;
   }
   
   
   public void setTotalOutput(double transaccion){
       this.total_output+=transaccion;
   }
   
   
   public double getBalance () {
       return this.balance;
   }
   
   
   
//---------------------------Fin Getters and Setters-----------------------------------//

//---------------------------Inicio Metidos-------------------------------------------------//



@Override
    public String toString() {
        return "\n" + "Wallet = " + getAddress().hashCode() + "\n" +
                      "Total input = " + getTotalInput() + "\n" +
                      "Total output = " + getTotalOutput() + "\n" +
                      "Balance = " + getBalance() + "\n";
    }


public void generateKeyPair(){
    setAddress(GenSig.generateKeyPair().getPublic());
}


public void loadCoins(BlockChain block){
    for (Transaction i : block.getBlockchain()){
        if (i.getPkey_recipient() == getAddress()){
            setTotalInput(i.getPigcoins());
       }
        else {
           setTotalOutput(i.getPigcoins()) ; 
        }
    }
}





}
