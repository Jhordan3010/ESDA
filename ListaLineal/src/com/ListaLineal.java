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
    
    public String Reporte() {
        String r = "";
        Nodo aux = inicio;
        while (aux != null) {
            Producto s = (Producto) aux.getInfo();
            r += "Codigo: "+s.getCodigo() + "\t" +"Nombre: "+ s.getNombre() + "\t"
                    + "Cantidad: "+s.getCantidad() + "\t" + "Precio: "+s.getPrecio() + "\t" +"Minimo: "+ s.getMinimo() + "\n\n";
            // Asumiendo que hay un método getNombre() en la clase Producto
            aux = aux.getSig();
        }
        return r;
    }
}
