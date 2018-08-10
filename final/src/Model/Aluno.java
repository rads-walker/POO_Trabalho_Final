/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ifnmg
 */
public class Aluno extends Pessoa{
    private Responsavel responsavel;
    private Integer matricula;
    private Integer responsavel_cpf;
    private Integer turma_idturma;

    public Integer getResponsavel_cpf() {
        return responsavel_cpf;
    }

    public void setResponsavel_cpf(Integer responsavel_cpf) {
        this.responsavel_cpf = responsavel_cpf;
    }

    public Integer getTurma_idturma() {
        return turma_idturma;
    }

    public void setTurma_idturma(Integer turma_idturma) {
        this.turma_idturma = turma_idturma;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
