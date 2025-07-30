package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDao implements Dao<Curso> {

    private Connection conn;
    
    public CursoDao() throws SQLException{
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    @Override
    public int save(Curso entidade) throws DAOException {
        int linhasGravadas = 0;
        
        try {
            String query = "INSERT INTO cursos(nome, creditos) VALUES(?,?)";
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1,entidade.getNome());
            st.setInt(2, entidade.getCreditos());
            if(verificaNome(new Curso(entidade.getNome())) == true){
                return 2;
            }
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar gravar entidade Curso, SQLState: " + ex.getSQLState());
        }
        
        return linhasGravadas;
    }

    @Override
    public int update(Curso entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try {
            String query = "UPDATE cursos SET nome = ?, creditos = ? WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getNome());
            st.setInt(2, entidade.getCreditos());
            st.setInt(3,entidade.getId());

            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar atualizar entidade Curso: " + ex.getMessage());
        }
        
        return linhasAfetadas;
    }

    @Override
    public int delete(Curso entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "DELETE FROM cursos WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, entidade.getId());
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar deletar entidade Curso: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public List<Curso> findAll() throws DAOException {
        ArrayList<Curso> cursos = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM cursos ORDER BY nome";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int creditos = res.getInt("creditos");
                cursos.add(new Curso(id, nome, creditos));
            }
        } 
        catch (SQLException ex) {
            throw new DAOException("Erro ao tentar encontrar todos Cursos: "+ex.getMessage());
        }
        
        return cursos;
    }

    @Override
    public Curso findOne(Curso entidade) throws DAOException {
        Curso curso = new Curso(entidade.getId());
        
        try{
            String query = "SELECT * FROM cursos WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, entidade.getId());
            ResultSet res = st.executeQuery();
            if(res.next()){
                curso.setNome(res.getString("nome"));
                curso.setCreditos(res.getInt("creditos"));
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar encontrar um Curso: "+ex.getMessage());
        }
        
        return curso;
    }
    
    public Curso buscaNome(String nome) throws DAOException {
        Curso curso = new Curso(nome);
        
        try{
            String query = "SELECT * FROM cursos WHERE nome = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, curso.getNome());
            ResultSet res = st.executeQuery();
            if(res.next()){
                curso.setId(res.getInt("id"));
                curso.setCreditos(res.getInt("creditos"));
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar encontrar um Curso: "+ex.getMessage());
        }
        
        return curso;
    }
    
    public boolean verificaNome(Curso entidade) throws DAOException{
        try{
            String query = "SELECT * FROM cursos where nome = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getNome());
            ResultSet res = st.executeQuery();
            if(res.next()){
                return true;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao verificar Curso");
        }
        return false;
    }
    
    public List<Curso> buscarNome(String nome) throws DAOException{
        ArrayList<Curso> cursos = new ArrayList();
        try{
            String query = "SELECT * FROM cursos WHERE nome LIKE '"+nome+"%'";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while(res.next()){
                cursos.add(new Curso(res.getInt("id"),res.getString("nome"),res.getInt("creditos")));
            }
            if(cursos.isEmpty() == true){
                return null;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar buscar curso pelo nome: "+ ex.getMessage());
        }
        return cursos;
    }
    
    public List<Curso> buscarId(Integer id) throws DAOException{
        ArrayList<Curso> cursos = new ArrayList();
        try{
            String query = "SELECT * FROM cursos WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, id);
            ResultSet res = st.executeQuery();
            while(res.next()){
                cursos.add(new Curso(res.getInt("id"),res.getString("nome"),res.getInt("creditos")));
            }
            if(cursos.isEmpty() == true){
                return null;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar buscar curso pelo ID: "+ ex.getMessage());
        }
        return cursos;
    }
}
