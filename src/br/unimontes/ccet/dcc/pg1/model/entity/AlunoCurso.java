package br.unimontes.ccet.dcc.pg1.model.entity;

public class AlunoCurso /*implements Comparable<AlunosCursos>*/ {
    private String cpfAluno;
    private Integer idCurso;
    private Integer creditosCursados;
    private String cadastroNomeUsuario;

    public AlunoCurso(String cpfAluno, Integer idCurso, Integer creditosCursados, String cadastroNomeUsuario) {
        this.cpfAluno = cpfAluno;
        this.idCurso = idCurso;
        this.creditosCursados = creditosCursados;
        this.cadastroNomeUsuario = cadastroNomeUsuario;
    }
    
    public AlunoCurso(String cpfAluno, Integer idCurso, Integer creditosCursados){
        this.cpfAluno = cpfAluno;
        this.idCurso = idCurso;
        this.creditosCursados = creditosCursados;
    }
    
    public AlunoCurso(String cpfAluno, Integer idCurso) {
        this.cpfAluno = cpfAluno;
        this.idCurso = idCurso;
        this.creditosCursados = 0;
    }
    
    public AlunoCurso(Integer idCurso, Integer creditosCursados) {
        this.idCurso = idCurso;
        this.creditosCursados = creditosCursados;
    }

    public AlunoCurso(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public AlunoCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }


    
    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getCreditosCursados() {
        return creditosCursados;
    }

    public void setCreditosCursados(Integer creditosCursados) {
        this.creditosCursados = creditosCursados;
    }

    public String getCadastroNomeUsusario() {
        return cadastroNomeUsuario;
    }

    public void setCadastroNomeUsuario(String cadastroNomeUsuario) {
        this.cadastroNomeUsuario = cadastroNomeUsuario;
    }
    
    
}
