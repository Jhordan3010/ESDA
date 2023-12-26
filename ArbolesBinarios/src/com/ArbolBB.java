package com;
public class ArbolBB {
    //atributo
    private NodoABB raiz;
    
    //constructor
    public ArbolBB(){
        raiz = null;
    }
    
    //metodos
    public String Ingresar(Object elem){
        NodoABB nuevo = new NodoABB(elem);
        String res= "";
        if (raiz == null) {
            raiz = nuevo;
            res = "Nod Raiz Ingresado";
        }else{
            int r;
            NodoABB aux = raiz;
            while (aux != null) {                
                r = ((Producto) elem).getCodigo().compareTo(((Producto) aux.getInfo()).getCodigo());
                if (r < 0) {
                    if (aux.getHijoIzq() == null) {
                        aux.setHijoIzq(nuevo);
                        res = "Nodo hijo Izquierdo ingresado correctamente";
                        break;
                    }else{
                        aux = aux.getHijoIzq();
                    }
                }else if (r > 0) {
                    if (aux.getHijoDer() == null) {
                        aux.setHijoDer(nuevo);
                        res = "Nodo gijo Derecho ingresado correctamente";
                        break;
                    }else{
                        aux = aux.getHijoDer();
                    }
                }else{
                    res = "Codigo Iguales";
                    break;
                }
            }
        }
        return res;
    }
}
