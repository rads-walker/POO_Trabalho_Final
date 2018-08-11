/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Model.Endereco;
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
public class enderecoDAO {
    
    public void create(Endereco t){
        
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO endereco (rua, numero, bairro) VALUES (?,?,?)");
           
            stmt.setString(1, t.getRua());
            stmt.setInt(2, t.getNumero());
            stmt.setString(3, t.getBairro());
            System.out.println(stmt);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com successo!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }finally{
            conecao.closeConnection(con, stmt);
        }
    }
    
    
    public List<Endereco> read(Integer Busca){
        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        
        List enderecos = new ArrayList<>();
        //Aluno aluno = new Aluno();
        
        try {
            stmt = con.prepareStatement("select * from endereco where id = ?");
            stmt.setInt(1, Busca);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setBairro(rs.getString("bairro"));
                enderecos.add(endereco);                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar do banco!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return enderecos;
    }
}
