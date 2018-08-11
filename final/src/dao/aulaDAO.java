/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Model.Aula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Danilo
 */
public class aulaDAO {
    
        public List<Aula> buscaNome(String Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,turma_idturma from professor,aula where professor.siap = aula.professor_siap and professor.nome like ?");
            stmt.setString(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
        
        public List<Aula> buscaSiap(String Siap){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,turma_idturma from professor,aula where professor.siap = aula.professor_siap and professor.siap = ?");
            stmt.setString(1, Siap);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
    
        public List<Aula> buscacpf(Integer CPF){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,turma_idturma from professor,aula where professor.siap = aula.professor_siap and professor.cpf = ?");
            stmt.setInt(1, CPF);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
        
        public List<Aula> buscaAluno(String Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,aluno.turma_idturma from aula, aluno where aluno.turma_idturma = aula.turma_idturma and aluno.nome like ?");
            stmt.setString(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
        public List<Aula> buscacpfaluno(Integer CPF){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,aluno.turma_idturma from aluno,aula where aluno.turma_idturma = aula.turma_idturma and aluno.cpf = ?");
            stmt.setInt(1, CPF);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
    
        public List<Aula> buscamatricula(Integer CPF){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,aluno.turma_idturma from aluno,aula where aluno.turma_idturma = aula.turma_idturma and aluno.matricula = ?");
            stmt.setInt(1, CPF);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
        
        public List<Aula> busca(){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List aulas = new ArrayList<>();
                        
        try {
            stmt = con.prepareStatement("select horario,duracao,turma_idturma from aula");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Aula aula = new Aula();
            aula.setDuracao(rs.getNString("duracao"));
            
            aula.setTurma_idturma(rs.getInt("turma_idturma"));
            Date data = rs.getDate("horario"); // a data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // formato de data desejado
            
            aula.setHorario(data);
            aulas.add(aula);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return aulas;
    }
     
    public void create(Aula t){
        
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO aula (codigosala, duracao, professor_siap, turma_idturma,horario) VALUES (?,?,?,?,?)");
            stmt.setInt(1, t.getCodigosala());
            stmt.setString(2, t.getDuracao());
            stmt.setInt(3, t.getProfessor_siap());
            stmt.setInt(4, t.getTurma_idturma());
            stmt.setDate(5, (java.sql.Date) t.getHorario());

            System.out.println(stmt);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com successo!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }finally{
            conecao.closeConnection(con, stmt);
        }
    }
}
