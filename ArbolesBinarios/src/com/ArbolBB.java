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
                r = 
            }
        }
    }
}
