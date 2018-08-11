/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class responsavelDAO {
    
    public void create(Responsavel t){
        
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO responsavel (cpf, nome, telefone, email, endereco_id) VALUES (?,?,?,?,?)");
           
            stmt.setInt(1, t.getCpf());
            stmt.setString(2, t.getNome());
            stmt.setInt(3, t.getTelefone());
            stmt.setString(4, t.getEmail());
            stmt.setInt(5, t.getEndereco_id());
            System.out.println(stmt);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com successo!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }finally{
            conecao.closeConnection(con, stmt);
        }
    }
    
    
    public List<Responsavel> read(Integer Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List responsaveis = new ArrayList<>();
        //Aluno aluno = new Aluno();
        
        try {
            stmt = con.prepareStatement("select * from responsavel where cpf like ?");
            stmt.setInt(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Responsavel responsavel = new Responsavel();              
                responsavel.setNome(rs.getString("nome"));
                responsavel.setCpf(rs.getInt("cpf"));
                responsavel.setTelefone(Integer.parseInt(rs.getString("telefone")));
                responsavel.setEmail(rs.getString("email"));
                responsavel.setEndereco_id(rs.getInt("endereco_id"));
                responsaveis.add(responsavel);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return responsaveis;
    }
   
}
