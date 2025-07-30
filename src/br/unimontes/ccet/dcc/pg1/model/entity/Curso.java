package br.unimontes.ccet.dcc.pg1.model.entity;

public class Curso implements Comparable<Curso>{
    private Integer id;
    private String nome;
    private Integer creditos;
    
    public Curso(Integer id){
        this.id = id;
        this.creditos = 0;
    }
    
    public Curso(String nome){
        this.nome = nome;
        this.creditos = 0;
    }
    
    public Curso(String nome, Integer creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    public Curso(Integer id, String nome, Integer creditos) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    
    @Override
    public String toString(){
        return "Curso ("+id+"): "+nome;
    }
    
    @Override
    public int compareTo(Curso o) {
        return id.compareTo(o.getId());
    }
    
}
