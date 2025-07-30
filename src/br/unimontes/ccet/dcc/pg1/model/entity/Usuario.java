/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.model.entity;

/**
 *
 * @author andre
 */
public class Usuario implements Comparable<Usuario>{
    private String username;
    private String nome;
    private String senha;
    private String foto;

    public Usuario(String username, String nome, String senha, String foto) {
        this.username = username;
        this.nome = nome;
        this.senha = senha;
        this.foto = foto;
    }

    public Usuario(String username) {
        this.username = username;
        nome = null;
        senha = null;
        foto = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    @Override
    public int compareTo(Usuario o) {
        return username.compareTo(o.getUsername());
    }

}
