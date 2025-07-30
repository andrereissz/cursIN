package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.desktop.view.util.Session;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Usuario;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDao implements Dao<Usuario> {
    private Connection conn;

    public UsuarioDao() throws SQLException{
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    
    @Override
    public int save(Usuario entidade) throws DAOException {
        int linhasGravadas = 0;
        
        try {
            String query = "INSERT INTO usuarios(username, nome, senha, foto) VALUES(?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, entidade.getUsername());
            st.setString(2, entidade.getNome());
            st.setString(3, entidade.getSenha());
            st.setString(4, null);

            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar cadastrar entidade Usuario: "+ex.getSQLState());
        }
        return linhasGravadas;
    }

    @Override
    public int update(Usuario entidade) throws DAOException {
        int linhasAfetadas = 0;
        
        try {
            String query = "UPDATE usuarios SET nome = ?, senha = ?, foto = ? WHERE username = ?";

            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getSenha());
            st.setString(3, entidade.getFoto());
            st.setString(4, entidade.getUsername());

            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar atualizar entidade Usuario: " + ex.getMessage());
        }      
        return linhasAfetadas;
    }

    @Override
    public int delete(Usuario entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "DELETE FROM usuarios WHERE username = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getUsername());
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar deletar entidade Usuario: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public List<Usuario> findAll() throws DAOException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM usuarios";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                String user = res.getString("username");
                String nome = res.getString("nome");
                String senha = res.getString("senha");
                String foto = res.getString("foto");
                usuarios.add(new Usuario(user,nome,senha,foto));
            }
        } 
        catch (SQLException ex) {
            throw new DAOException("Erro ao tentar encontrar todos Usuarios: "+ex.getMessage());
        }
        
        return usuarios;
    }

    @Override
    public Usuario findOne(Usuario entidade) throws DAOException {
        Usuario usuario = new Usuario(entidade.getUsername());
        
        try{
            String query = "SELECT * FROM usuarios WHERE username = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getUsername());
            ResultSet res = st.executeQuery();
            usuario.setNome(res.getString("nome"));
            usuario.setSenha(res.getString("senha"));
            usuario.setFoto(res.getString("foto"));
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar encontrar um Aluno: "+ex.getMessage());
        }
        
        return usuario;
    }
    
    public int verificaLogin(Usuario usuario, String senha) throws DAOException{
        try{
            String query = "SELECT username, nome, senha FROM usuarios WHERE username = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, usuario.getUsername());
            ResultSet res = st.executeQuery();
            if(res.next()){
                if(res.getString("senha").compareTo(senha) == 0){
                    Session.setSessionNome(res.getString("nome"));
                    return 1;
                }
                else{
                    return 2;
                }
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao buscar Usuario"); 
        }
        return 3;
    }
    
    public boolean verificaUser(Usuario entidade) throws DAOException{
        try{
            String query = "SELECT username FROM usuarios where username = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getUsername());
            ResultSet res = st.executeQuery();
            if(res.next()){
                return true;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao verificar Usuario");
        }
        return false;
    }
}
