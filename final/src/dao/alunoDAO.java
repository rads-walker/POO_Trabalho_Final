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
import Model.Aluno;

/**
 *
 * @author Danilo
 */
public class alunoDAO {
        
    public List<Aluno> read(Integer Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List alunos = new ArrayList<>();
        //Aluno aluno = new Aluno();
        
        try {
            stmt = con.prepareStatement("select * from aluno where nome = ?");
            stmt.setInt(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno aluno = new Aluno();              
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setCpf(rs.getInt("idade"));
                aluno.setTelefone(rs.getString("idade"));
                aluno.setEmail(rs.getString("idade"));
                aluno.setEndereco_id(rs.getInt("idade"));
                alunos.add(aluno);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return alunos;
    }
}
