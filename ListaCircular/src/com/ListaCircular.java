package com;

import java.util.HashSet;
import java.util.Set;

public class ListaCircular {
  private Nodo ultimo;

    //Metodo Ingresar
    public void Ingresar(Object obj) {

        Nodo nuevo = new Nodo(obj);

        if (ultimo == null) {
            nuevo.setSig(nuevo);
            ultimo = nuevo;
        } else {
            nuevo.setSig(ultimo.getSig());
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
    }

    //Metodo Retirar
    public Object Retirar(String codigo) {
        if (ultimo != null) {
            if (ultimo.getSig() == ultimo) {
                if (((Productos) ultimo.getInfo()).getCodigo().equals(codigo)) {
                    Nodo aux = ultimo;
                    ultimo = null;
                    return aux.getInfo();
                } else {
                    return null;
                }
            } else {
                Nodo Iterador = ultimo.getSig();
                Nodo Obtenido;
                while (!((Productos) Iterador.getSig().getInfo()).getCodigo().equals(codigo)) {
                    Iterador = Iterador.getSig();
                    if (Iterador == ultimo.getSig()) {
                        return null;
                    }
                }
                Nodo aux = Iterador;
                Obtenido = Iterador.getSig();
                aux.setSig(Iterador.getSig().getSig());
                if (ultimo == Obtenido) {
                    ultimo = aux;
                }
                return Obtenido.getInfo();
            }
        } else {

            return null;
        }
    }

    //Metodo Reporte
    public String Reporte() {
        if (ultimo == null) {
            return "No hay productos en la lista.";
        }

        Set<String> codigos = new HashSet<>();  // Conjunto para almacenar los códigos de productos ya incluidos en el reporte
        String reporte = "Reporte de Productos:\n";
        Nodo actual = ultimo.getSig();

        do {
            Productos producto = (Productos) actual.getInfo();
            String codigo = producto.getCodigo();

            // Verificar si el código ya ha sido agregado al reporte
            if (!codigos.contains(codigo)) {
                reporte += producto.Imprimir() + "\n";
                codigos.add(codigo);  // Agregar el código al conjunto
            }

            actual = actual.getSig();
        } while (actual != ultimo);

        Productos producto = (Productos) actual.getInfo();
        String codigo = producto.getCodigo();

        // Verificar si el código ya ha sido agregado al reporte
        if (!codigos.contains(codigo)) {
            reporte += producto.Imprimir() + "\n";
            codigos.add(codigo);  // Agregar el código al conjunto
        }

        return reporte;
    }   
}
