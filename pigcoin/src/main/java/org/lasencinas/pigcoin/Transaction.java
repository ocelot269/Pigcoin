
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
    
    public Transaction(String hash, String prev_hash, PublicKey key,
            PublicKey clave,double pigcoins,String mensaje ){
        this.hash=hash;
        this.prev_hash=prev_hash;
        this.pKey_sender=key;
        this.pKey_recipient=clave;
        this.pigcoins=pigcoins;
        this.message=mensaje;
    }
    



@Override
    public String toString() {
        return "\n" + "Hash = " + this.hash + "\n" +
                      "Prev_hash = " + this.prev_hash + "\n" +
                      "pKey_sender = " + this.pKey_sender.hashCode() + "\n" +
                      "pKey_recipient = " + this.pKey_recipient.hashCode() + "\n" +
                      "pigcoins = " + this.pigcoins + "\n" +
                      "message = " + this.message + "\n";
    }









}

