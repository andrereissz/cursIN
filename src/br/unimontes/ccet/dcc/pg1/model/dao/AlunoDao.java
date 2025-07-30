package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class AlunoDao implements Dao<Aluno> {

    private Connection conn;

    public AlunoDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public int save(Aluno entidade) throws DAOException {
        int linhasGravadas = 0;

        try {
            String query = "INSERT INTO alunos(cpf, nome, data_nascimento) VALUES(?,?,?)";
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, entidade.getCpf());
            st.setString(2, entidade.getNome());
            st.setString(3, entidade.getAnoNascimento());

            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23505")) {
                return 2;
            } else {
                throw new DAOException("Erro ao tentar gravar entidade Aluno, SQLState: " + ex.getSQLState());
            }
        }

        return linhasGravadas;
    }

    @Override
    public int update(Aluno entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "UPDATE alunos SET nome = ?, data_nascimento = ? WHERE cpf = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getAnoNascimento());
            st.setString(3, entidade.getCpf());

            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar atualizar entidade Aluno: " + ex.getMessage());
        }
        return linhasAfetadas;
    }

    @Override
    public int delete(Aluno entidade) throws DAOException {
        int linhasAfetadas = 0;

        try {
            String query = "DELETE FROM alunos WHERE cpf = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpf());
            linhasAfetadas = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar deletar entidade Aluno: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public List<Aluno> findAll() throws DAOException {
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            String query = "SELECT * FROM alunos ORDER BY nome";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                String cpf = res.getString("cpf");
                String nome = res.getString("nome");
                String anoNascimento = res.getString("data_nascimento");
                alunos.add(new Aluno(cpf, nome, anoNascimento));
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar encontrar todos Alunos: " + ex.getMessage());
        }

        return alunos;
    }

    @Override
    public Aluno findOne(Aluno entidade) throws DAOException {
        Aluno aluno = new Aluno(entidade.getCpf());

        try {
            String query = "SELECT * FROM alunos WHERE cpf = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, entidade.getCpf());
            ResultSet res = st.executeQuery();
            if (res.next()) {
                aluno.setCpf(res.getString("cpf"));
                aluno.setNome(res.getString("nome"));
                aluno.setAnoNascimento(res.getString("data_nascimento"));
                return aluno;
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar encontrar um Aluno: " + ex.getMessage());
        }

        return null;
    }

    public boolean verificarCpf(String cpf) throws DAOException {
        try {
            String query = "SELECT * FROM alunos WHERE cpf = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, cpf);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                return true;
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao tentar buscar CPF: " + ex.getMessage());
        }
        return false;
    }
    
    
    public List<Aluno> buscarNome(String nome) throws DAOException{
        ArrayList<Aluno> alunos = new ArrayList();
        try{
            String query = "SELECT * FROM alunos WHERE nome LIKE '"+nome+"%' ORDER BY nome";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while(res.next()){
                alunos.add(new Aluno(res.getString("cpf"),res.getString("nome"),res.getString("data_nascimento")));
            }
            if(alunos.isEmpty() == true){
                return null;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar buscar aluno pelo nome: "+ ex.getMessage());
        }
        return alunos;
    }
    
    public List<Aluno> buscarCpf(String cpf) throws DAOException{
        ArrayList<Aluno> alunos = new ArrayList();
        try{
            String query = "SELECT * FROM alunos WHERE cpf = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, cpf);
            ResultSet res = st.executeQuery();
            while(res.next()){
                alunos.add(new Aluno(res.getString("cpf"),res.getString("nome"),res.getString("data_nascimento")));
            }
            if(alunos.isEmpty() == true){
                return null;
            }
        }
        catch(SQLException ex){
            throw new DAOException("Erro ao tentar buscar aluno pelo cpf: "+ ex.getMessage());
        }
        return alunos;
    }
}
