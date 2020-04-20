/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 *
 * @author bragh
 */
public abstract class construccion {
    private String tipEdificio, cliente, arqui;
    private int pisos;
    
    public construccion(String tipEdificio, String cliente, String arqui, int pisos){
        this.tipEdificio = tipEdificio;
        this.cliente = cliente;
        this.arqui = arqui;
        this.pisos = pisos;
    }
    
    public abstract String FecFinalizacion();
    
    public String getTipEdificio() {
        return tipEdificio;
    }

    public void setTipEdificio(String tipEdificio) {
        this.tipEdificio = tipEdificio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArqui() {
        return arqui;
    }

    public void setArquitecto(String arqui) {
        this.arqui = arqui;
    }
}
