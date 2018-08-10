/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpf.dao;

/**
 *
 * @author Gabri
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConectaBanco {

    private static Connection conexao;
    private static String url;
    private static String usuario;
    private static String senha;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String aUrl) {
        url = aUrl;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String aSenha) {
        senha = aSenha;
    }

    private ConectaBanco() {
    }

    public static void ajustaParametros(String url, String usuario, String senha) {
        ConectaBanco.setUrl(url);
        ConectaBanco.setUsuario(usuario);
        ConectaBanco.setSenha(senha);
    }

    public static void lerParametros() {
        ConectaBanco.setUrl(lePropriedade("url"));
        ConectaBanco.setUsuario(lePropriedade("usuario"));
        ConectaBanco.setSenha(lePropriedade("senha"));
    }

    public static Connection getConexao() {
        if (conexao == null) {
            if (url == null) {
                lerParametros();
            }
            try {
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conexao;
    }

    protected static void fechaConexao() {
        url = null;
        usuario = null;
        senha = null;

        try {
            if (conexao != null) {
                conexao.close();
                conexao = null;
            }
        } catch (Exception ex) {
            System.out.println("Falha em ConectaBanco.fechaConexao().");
        }
    }

    @Override
    protected void finalize() {
        System.out.println("ConectaBanco.finalize()");

        try {
            super.finalize();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

        fechaConexao();
    }

    /**
     * Carrega propriedades para conexão com banco de dados a partir de um
     * arquivo.
     *
     * @return URL de conexão com banco de dados.
     */
    private static String lePropriedade(String propriedade) {
        Properties prop = new Properties();
        try {
            prop.load(ConectaBanco.class.getClassLoader().getResourceAsStream("config.properties"));
            return prop.getProperty(propriedade);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
