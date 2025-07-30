 package br.unimontes.ccet.dcc.pg1.desktop.view.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografar {
    public static String encriptografar(String senha){
        String encriptada = "";
        MessageDigest md;
        try{
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1,md.digest(senha.getBytes()));
            encriptada = hash.toString(16);
        }
        catch(NoSuchAlgorithmException e){}
        return encriptada;
    }
}
