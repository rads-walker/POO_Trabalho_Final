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
    private Integer siap;

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public Integer getSiap() {
        return siap;
    }

    public void setSiap(Integer siap) {
        this.siap = siap;
    }
}
