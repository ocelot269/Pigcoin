
package org.lasencinas.pigcoin;

import java.security.PrivateKey;
import java.security.PublicKey;


public class Wallet {
    
//-------------------------Inicianlizando variables----------------------------------//
   
    
   private PrivateKey sKey=null;
   private PublicKey address=null;
   
   
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
   
   
//---------------------------Fin Getters and Setters-----------------------------------//

//---------------------------Inicio Metidos-------------------------------------------------//

public void generateKeyPair(){
    setAddress(GenSig.generateKeyPair().getPublic());
}


}
