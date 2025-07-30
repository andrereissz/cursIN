package br.unimontes.ccet.dcc.pg1.desktop.view.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument {
    public enum TipoEntrada{NOME, CPF, DATA, USER, SENHA, NUM;};
    
    private int quantidadeCaracteres;
    private TipoEntrada tipoEntrada;

    public LimitaCaracteres(int quantidadeCaracteres, TipoEntrada tipoEntrada) {
        this.quantidadeCaracteres = quantidadeCaracteres;
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null || getLength() == quantidadeCaracteres){
            return;
        }
        
        int totalCaracteres = getLength() + str.length();
        
        String restricao = "";
        switch(tipoEntrada){
            case NOME -> {
                restricao = "[^\\p{IsLatin} ]";
            }
            case CPF -> {
                restricao = "[^0-9.\\-]";
            }
            case DATA -> {
                restricao = "[^0-9/]";
            }
            case USER -> {
                restricao = "[^A-Za-z0-9]";
            }
            case SENHA -> {
                restricao = "[^A-Za-z0-9!@#$%&*]";
            }
            case NUM -> {
                restricao = "[^0-9]";
            }
        }
        str = str.replaceAll(restricao, "");
        
        if(totalCaracteres <= quantidadeCaracteres){
            super.insertString(offs, str, a);    
        }else{
            String novaString = str.substring(0,quantidadeCaracteres);
            super.insertString(offs, novaString, a);
        }
        
    }
    
    
    
}
