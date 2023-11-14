package com;

public class ListaLineal {

    private Nodo inicio;
    private Nodo fin;

    public String ingresarInicio(Object elem) {
        String r = "nodo ingresado correctamente";
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
        return r;
    }

    public String ingresaarFin(Object elem) {
        String r = "nodo ingresado correctamente";
        Nodo aux = inicio;
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        return r;
    }

    public Nodo RetirarInicio() {
        
        Nodo aux = inicio;
        if (inicio != null) {
            inicio = inicio.getSig();
        }
        return aux;
    }
    
     public String ReporteInicio() {
        StringBuilder reporte = new StringBuilder();
        Nodo iterador = inicio;

        while (iterador != null) {
            reporte.append(((Producto) iterador.getInfo()).toString()).append("\n");
            iterador = iterador.getSig();
        }

        return reporte.toString();
    }
}
