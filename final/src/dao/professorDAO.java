/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Professor;

/**
 *
 * @author Danilo
 */
public class professorDAO {
        
    public Professor buscaNome(Integer Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        Professor professor = new Professor();                      
        
        try {
            stmt = con.prepareStatement("select horario,duracao,turma_idturma from professor,aula where professor.siap = aula.professor_siap and professor.nome like ?");
            stmt.setInt(1, Busca);
            rs = stmt.executeQuery();
            //professor.set
        //(rs.getString("nome"));
        }
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
       return null /*alunos*/;
    }
    
     public List<Professor> read(Integer Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List alunos = new ArrayList<>();
        //Aluno aluno = new Aluno();
        
        try {
            stmt = con.prepareStatement("select * from professor where nome = ?");
            stmt.setInt(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                /*Aluno aluno = new Aluno();              
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setCpf(rs.getInt("idade"));
                aluno.setTelefone(rs.getString("idade"));
                aluno.setEmail(rs.getString("idade"));
                aluno.setEndereco_id(rs.getInt("idade"));
                alunos.add(aluno);*/
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return alunos;
    }
}
