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
public class Professor extends Pessoa{
    private ArrayList<Aula> aulas;
    private String siap;

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public String getSiap() {
        return siap;
    }

    public void setSiap(String siap) {
        this.siap = siap;
    }
}
