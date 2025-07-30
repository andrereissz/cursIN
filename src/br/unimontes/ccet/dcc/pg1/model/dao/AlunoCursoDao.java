package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Session;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoCursoDao implements Dao<AlunoCurso> {
    private Connection conn;
    
    public AlunoCursoDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    @Override
    public int save(AlunoCurso entidade) throws DAOException {
        int linhasGravadas = 0;
        
        try {
            String query = "INSERT INTO alunoscursos(cpf_aluno, id_curso, creditos_cursados, cadastro_nome_usuario) VALUES(?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1,entidade.getCpfAluno());
            st.setInt(2, entidade.getIdCurso());
            st.setInt(3,entidade.getCreditosCursados());
            st.setString(4, Session.getSessionNome());
            if(verificaMatricula(entidade) == true){
                return 2;
            }             
            linhasGravadas = st.executeUpdate();
        }catch(SQLException ex){
                throw new DAOException("Erro ao tentar gravar entidade AlunoCurso, SQLState: " + ex.getSQLState());
        }
        return linhasGravadas;
    }

    @Override
    public int update(AlunoCurso entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try {
            String query = "UPDATE alunoscursos SET creditos_cursados = ? WHERE cpf_aluno = ? and id_curso = ?";

            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, entidade.getCreditosCursados());
            st.setString(2, entidade.getCpfAluno());
            st.setInt(3,entidade.getIdCurso());
            
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar atualizar entidade AlunoCurso: " + ex.getMessage());
        }
        
        return linhasAfetadas;
    }

    @Override
    public int delete(AlunoCurso entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "DELETE FROM alunoscursos WHERE cpf_aluno = ? and id_curso = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            st.setInt(2, entidade.getIdCurso());
            
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar deletar entidade AlunoCurso: " + ex.getMessage());
        }
        return linhasAfetadas;
    }

    @Override
    public ArrayList<AlunoCurso> findAll() throws DAOException {
        ArrayList<AlunoCurso> alunoscursos = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM alunoscursos";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                String cpfAluno = res.getString("cpf_aluno");
                int idCurso = res.getInt("id_curso");
                int creditosCursados = res.getInt("creditos_cursados");
                String cadastroNomeUsuario = res.getString("cadastro_nome_usuario");
                alunoscursos.add(new AlunoCurso(cpfAluno, idCurso, creditosCursados, cadastroNomeUsuario));
            }
        } 
        catch (SQLException ex) {
            throw new DAOException("Erro ao tentar encontrar todos AlunosCursos: "+ex.getMessage());
        }
        
        return alunoscursos;
    }

    @Override
    public AlunoCurso findOne(AlunoCurso entidade) throws DAOException {
        AlunoCurso alunocurso = new AlunoCurso(entidade.getCpfAluno(),entidade.getIdCurso());
        
        try{
            String query = "SELECT * FROM alunocursos WHERE cpf_aluno = ? and id_curso = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            st.setInt(2,entidade.getIdCurso());
            ResultSet res = st.executeQuery();
            alunocurso.setCreditosCursados(res.getInt("creditos_cursados"));
            alunocurso.setCadastroNomeUsuario(res.getString("cadastro_nome_usuario"));
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar encontrar um Curso: "+ex.getMessage());
        }
        
        return alunocurso;
    }
    
    public boolean verificaMatricula(AlunoCurso entidade) throws DAOException{
        try{    
            String query = "SELECT * FROM alunoscursos where cpf_aluno = ? and id_curso = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            st.setInt(2, entidade.getIdCurso());
            ResultSet res = st.executeQuery();
            if(res.next()){
                return true;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao verificar AlunoCurso");
        }
        return false;
    }
    
    public boolean verificaMatriculaCpf(AlunoCurso entidade) throws DAOException{
        try{    
            String query = "SELECT * FROM alunoscursos where cpf_aluno = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            ResultSet res = st.executeQuery();
            if(res.next()){
                return true;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao verificar AlunoCurso");
        }
        return false;
    }
    
    public ArrayList<Curso> buscaCursosMatriculados(AlunoCurso entidade) throws DAOException{
        ArrayList<Curso> cursos = new ArrayList();
        try{
            String query = "SELECT cursos.id, cursos.nome, cursos.creditos FROM alunoscursos, cursos WHERE cursos.id = (SELECT alunoscursos.id_curso WHERE alunoscursos.cpf_aluno = ?) ORDER BY cursos.id";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            ResultSet res = st.executeQuery();
            while(res.next()){
                cursos.add(new Curso(res.getInt("id"),res.getString("nome"),res.getInt("creditos")));
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao buscar Cursos Matriculados: "+ex.getMessage());
        }
        return cursos;
    }
    
    public ArrayList<Curso> buscaCursosMatriculadosExceto(AlunoCurso entidade) throws DAOException{
        ArrayList<Curso> cursos = new ArrayList();
        try{
            String query = "SELECT cursos.id, cursos.nome, cursos.creditos FROM alunoscursos, cursos WHERE cursos.id = (SELECT alunoscursos.id_curso WHERE alunoscursos.cpf_aluno = ? and alunoscursos.id_curso != ?) ORDER BY cursos.id";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            st.setInt(2, entidade.getIdCurso());
            ResultSet res = st.executeQuery();
            while(res.next()){
                cursos.add(new Curso(res.getInt("id"),res.getString("nome"),res.getInt("creditos")));
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao buscar Cursos Matriculados: "+ex.getMessage());
        }
        return cursos;
    }
    
    public int desmatricularTodosAlunos(Integer id) throws DAOException{
        int linhasafetadas = 0;
        try{
            String query = "DELETE FROM alunoscursos WHERE id_curso = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, id);
            linhasafetadas = st.executeUpdate();
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao buscar Cursos Matriculados: "+ex.getMessage());
        }
        return linhasafetadas;
    }
    
    public int deleteTodasMatriculas(AlunoCurso entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "DELETE FROM alunoscursos WHERE cpf_aluno = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpfAluno());
            
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar deletar entidade AlunoCurso: " + ex.getMessage());
        }
        return linhasAfetadas;
    }
    
    public List<String[]> consultarTodasMatriculas(String nomeCurso) throws DAOException{
        ArrayList<String[]> linhas = new ArrayList();
        try{
            String query = "SELECT alunoscursos.id_curso, cursos.nome, alunos.nome AS aluno FROM alunoscursos,cursos,alunos WHERE alunoscursos.id_curso = (SELECT cursos.id WHERE cursos.nome = ?) and alunoscursos.cpf_aluno = alunos.cpf ORDER BY aluno";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, nomeCurso);
            ResultSet res = st.executeQuery();
            while(res.next()){
                String[] temp = {""+res.getInt("id_curso"),res.getString("nome"),res.getString("aluno")};
                linhas.add(temp);
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao consultar todos alunos matriculados na disciplina: "+ ex.getMessage());
        }
        return linhas;
    }
    
    public int updateMatriculaCurso(AlunoCurso matricula) throws DAOException{
        int linhasAfetadas = 0;
        try{
            String query = "UPDATE alunoscursos SET creditos_cursados = ?, cadastro_nome_usuario = ? where id_curso = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, matricula.getCreditosCursados());;
            st.setString(2, Session.getSessionNome());
            st.setInt(3, matricula.getIdCurso());
            
            linhasAfetadas = st.executeUpdate();
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao atualizar o curso de uma matricula: "+ex.getMessage());
        }
        return linhasAfetadas;
    }
}
