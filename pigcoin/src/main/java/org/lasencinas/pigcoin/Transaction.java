
package org.lasencinas.pigcoin;

import java.security.PublicKey;


public class Transaction {
    private String hash = "";
    private String prev_hash="";
    private PublicKey pKey_sender=null;
    private PublicKey pKey_recipient=null;
    private double pigcoins=0d;
    private String message = null;
    private byte[] signature=null;

    //Constructor
    public Transaction() {
    
    }
    
    
    //sobrecarga de constructor
    public Transaction(String hash, String prev_hash, PublicKey key,
            PublicKey clave,double pigcoins,String mensaje ){
        this.hash=hash;
        this.prev_hash=prev_hash;
        this.pKey_sender=key;
        this.pKey_recipient=clave;
        this.pigcoins=pigcoins;
        this.message=mensaje;
    }
    
    //Fin constructor
    
    
    //getters y setters
    
    
   
    
    public String getHash (){
        return this.hash;
    }
    
    
    public String getPrev_hash () {
        return this.prev_hash;
    }
    
    
    public PublicKey getPkeySender ()  {
        return this.pKey_sender;
    }
    
    
    public PublicKey getPkey_recipient () {
        return this.pKey_recipient;
    }
    
    
    public double getPigcoins (){
        return this.pigcoins;
    }
    
    
    public String getMessage () {
        return this.message;
    }
            
    //fin getters y setters
    
    //Inicio metodos
    
    
   


@Override
    public String toString() {
        return "\n" + "Hash = " + getHash() + "\n" +
                      "Prev_hash = " + getPrev_hash() + "\n" +
                      "pKey_sender = " + getPkeySender().hashCode() + "\n" +
                      "pKey_recipient = " + getPkey_recipient().hashCode() + "\n" +
                      "pigcoins = " + getPigcoins() + "\n" +
                      "message = " + getMessage() + "\n";
    }









}

