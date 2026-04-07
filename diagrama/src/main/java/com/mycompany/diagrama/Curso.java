/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagrama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class Curso {

    private int codigo;
    private String nome;
    private int chTotal;
    private int duracao;
    private String tipoDuracao;
    private String modalidade;
    private boolean status;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the chTotal
     */
    public int getChTotal() {
        return chTotal;
    }

    /**
     * @param chTotal the chTotal to set
     */
    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the tipoDuracao
     */
    public String getTipoDuracao() {
        return tipoDuracao;
    }

    /**
     * @param tipoDuracao the tipoDuracao to set
     */
    public void setTipoDuracao(String tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    /**
     * @return the modalidade
     */
    public String getModalidade() {
        return modalidade;
    }

    /**
     * @param modalidade the modalidade to set
     */
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
       public abstract void realizarMatricula();
        
    }

