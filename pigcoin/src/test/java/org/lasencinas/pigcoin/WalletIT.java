/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.pigcoin;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class WalletIT {
    
    public WalletIT() {
    }
    
    @Test
    public void constructor_test(){
        Wallet cartera = new Wallet();
        assertNotNull(cartera);
    }
    
      @Test
    public void generate_key_pair_test() {
        Wallet wallet = new Wallet();
        assertNotNull(wallet);
        wallet.generateKeyPair();
        assertNotNull(wallet.getAddress());
        assertNotNull(wallet.getSK());
    }

//    @Test
//    public void testGetSK() {
//        Wallet cartera = new Wallet ();
//        cartera.setSK();
//        assertEquals(20, cartera.getsK());
//    }
//    
}
