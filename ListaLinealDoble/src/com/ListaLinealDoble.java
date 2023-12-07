package com;

public class ListaLinealDoble {

    private NodoDoble ultimo;
    private NodoDoble inicio;

    //Método para ingresar al inicio de la lista
    public void IngresarAlInicio(Productos producto) {
        NodoDoble nuevoNodo = new NodoDoble(producto);

        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSig(inicio);
            inicio.setAnt(nuevoNodo);
            inicio = nuevoNodo;
        }
    }

    //Método para ingresar al final de la lista
    public void IngresarAlFinal(Productos producto) {
        NodoDoble nuevoNodo = new NodoDoble(producto);

        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnt(ultimo);
            ultimo.setSig(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    //Método para eliminar un elemento de la lista
    public Object EliminarElemento(String codigo) {
        NodoDoble iterador = inicio;

        while (iterador != null) {
            if (((Productos) iterador.getInfo()).getCodigo().equals(codigo)) {
                break;
            }
            iterador = iterador.getSig();
        }

        if (iterador != null) {
            if (iterador == inicio && iterador == ultimo) {//Si hay un unico nodo
                inicio = null;
                ultimo = null;
            } else if (iterador == inicio) {//si esta al inicio
                inicio = iterador.getSig();
                inicio.setAnt(null);
            } else if (iterador == ultimo) {//si esta en el ultimo
                ultimo = iterador.getAnt();
                ultimo.setSig(null);
            } else {
                iterador.getAnt().setSig(iterador.getSig());
                iterador.getSig().setAnt(iterador.getAnt());
            }

            return iterador.getInfo();
        } else {
            return null;
        }
    }

    //Método reporte desde el inicio de la lista
    public String ReporteInicio() {
        StringBuilder reporte = new StringBuilder();
        NodoDoble iterador = inicio;

        while (iterador != null) {
            reporte.append(((Productos) iterador.getInfo()).toString()).append("\n");
            iterador = iterador.getSig();
        }

        return reporte.toString();
    }

    //Método reporte desde el final de la lista
    public String ReporteFinal() {
        StringBuilder reporte = new StringBuilder();
        NodoDoble iterador = ultimo;

        while (iterador != null) {
            reporte.append(((Productos) iterador.getInfo()).toString()).append("\n");
            iterador = iterador.getAnt();
        }

        return reporte.toString();
    }

}
