/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ifnmg
 */
public class Responsavel extends Pessoa{
    private ArrayList<Aluno> filhos;

    public ArrayList<Aluno> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Aluno> filhos) {
        this.filhos = filhos;
    }
    
}
