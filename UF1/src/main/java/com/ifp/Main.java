package com.ifp;

import com.ifp.cifradoDES.CifradoDES;

import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {

        CifradoDES.cifradoDES();
        
    }
}
