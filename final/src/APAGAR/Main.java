/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APAGAR;

import Model.Responsavel;
import dao.responsavelDAO;
/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
		 System.out.println("Eu sou o seu primeiro programa.");
		 //criando um objeto da classe PrimerioPrograma
		/*Aluno p = new Aluno();
		 //chamado os metódos do objeto da classe PrimeiroPrograma
		 p.setNome("Danilo");
                 p.setCpf(115258963);
                 p.setMatricula(145);
                 p.setEmail("@gmail");
                 p.setTelefone("1147852369");
                 p.setEndereco_id(1);
                 p.setResponsavel_cpf(1233456789);
                 p.setTurma_idturma(0);
                 
                 alunoDAO pd = new alunoDAO();
                 pd.create(p);*/
                 
                /*
                 Responsavel p = new Responsavel();
                 responsavelDAO pd = new responsavelDAO();
                  p.setNome("Fabio");
                 p.setCpf(115288963);
                 p.setEmail("@gmail");
                 p.setTelefone("1147852369");
                 p.setEndereco_id(1);;
                 pd.create(p);*/
                 responsavelDAO pd = new responsavelDAO();
                 pd.read(115288963);
                 
                 
	 }	 
    
}
