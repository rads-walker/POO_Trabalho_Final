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
import javax.swing.JOptionPane;

/**
 *
 * @author Dionisio
 */
public class recepcionistaDAO {
    
    public boolean checkLogin(String login, String senha) {

        Connection con = conecao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =  null;
        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM recepcionista WHERE usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao logar!");
        }finally{
            conecao.closeConnection(con, stmt, rs);
        }
        return check;

    }
}
