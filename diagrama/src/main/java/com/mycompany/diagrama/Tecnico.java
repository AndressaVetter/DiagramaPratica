/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagrama;

/**
 *
 * @author aluno
 */
public class Tecnico extends Curso {
    
    private String eixoTecnologico;
    private int chEstagio;
    
       
    @Override
    public void realizarMatricula(){
        
    }

    /**
     * @return the eixoTecnologico
     */
    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    /**
     * @param eixoTecnologico the eixoTecnologico to set
     */
    public void setEixoTecnologico(String eixoTecnologico) {
        this.eixoTecnologico = eixoTecnologico;
    }

    /**
     * @return the chEstagio
     */
    public int getChEstagio() {
        return chEstagio;
    }

    /**
     * @param chEstagio the chEstagio to set
     */
    public void setChEstagio(int chEstagio) {
        this.chEstagio = chEstagio;
    }
     public boolean verificarEstagioObrigatorio(){
        return EstagioObrigatorio;
    }

}
