/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ifnmg
 */
public class Aula {
    private Date horario;
    private Integer professor_siap;
    private Integer codigosala;
    private String duracao;
    private Integer turma_idturma;

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Integer getProfessor_siap() {
        return professor_siap;
    }

    public void setProfessor_siap(Integer professor_siap) {
        this.professor_siap = professor_siap;
    }

    public Integer getCodigosala() {
        return codigosala;
    }

    public void setCodigosala(Integer codigosala) {
        this.codigosala = codigosala;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Integer getTurma_idturma() {
        return turma_idturma;
    }

    public void setTurma_idturma(Integer turma_idturma) {
        this.turma_idturma = turma_idturma;
    }
}
