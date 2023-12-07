package com;

public class NodoDoble {
//Atributos

    private Object info;
    private NodoDoble sig;
    private NodoDoble ant;

    //Constructor
    public NodoDoble(Object elemento) {
        this.info = elemento;
        this.sig = null;
        this.ant = null;
    }

    //Getters y Setters
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
}
