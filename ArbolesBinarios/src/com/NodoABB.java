package com;
public class NodoABB {
    private Object info;
    private NodoABB hijoIzq;
    private NodoABB hijoDer;
    
    public NodoABB(Object info){
        this.info = info;
    }
    
    @Override
    public String toString() {
        return info.toString();
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodoABB getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoABB hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoABB getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoABB hijoDer) {
        this.hijoDer = hijoDer;
    }
}
