package com.qualitas.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanCalculadora {
    
    private int dato1;
    private int dato2;
    private int resultado;
    
    
    public void sumar(){
        resultado= dato1 + dato2;
    } 
    
    public void restar(){
        resultado= dato1 - dato2;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
