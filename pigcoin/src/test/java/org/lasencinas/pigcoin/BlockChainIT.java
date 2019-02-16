
package org.lasencinas.pigcoin;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.pigcoin.Transaction;
import org.lasencinas.pigcoin.Wallet;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class BlockChainIT {
    private BlockChain bChain = null;
    private Transaction trx = null;

    @Before
    public void setUp(){

        bChain = new BlockChain();
    }

    @Test
    public void setLinkedListTest(){

        Wallet wallet = new Wallet();
        trx = new Transaction("hash_1", "0", wallet.getAddress(), wallet.getAddress(), 20, "bacon eggs");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_2", "1", wallet.getAddress(), wallet.getAddress(), 10, "spam spam spam");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_3", "hash_1", wallet.getAddress(), wallet.getAddress(), 20, "a flying pig!");
        bChain.addOrigin(trx);

        for(int i = 0 ; i < bChain.getBlockchain().size();i++){
        assertNotNull(bChain.getBlockchain().get(i));}
    }


    @Test
    public void summarizeTest(){
        for(Transaction transaction: bChain.getBlockchain()) {
            assertNotNull(transaction.toString());}


        Wallet wallet = new Wallet();
        trx = new Transaction("hash_1", "0", wallet.getAddress(), wallet.getAddress(), 20, "bacon eggs");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_2", "1", wallet.getAddress(), wallet.getAddress(), 10, "spam spam spam");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_3", "hash_1", wallet.getAddress(), wallet.getAddress(), 20, "a flying pig!");
        bChain.addOrigin(trx);


        for(int i = 0 ; i < bChain.getBlockchain().size();i++){
            assertEquals(bChain.getBlockchain().get(i).getHash(),"hash_"+(i+1));}

     
    }
    
}