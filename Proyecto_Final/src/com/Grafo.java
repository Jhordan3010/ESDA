package com;
import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private final List<List<Arista>> listaDeAdyacencia;

    public Grafo(int tamanio) {
        listaDeAdyacencia = new ArrayList<>(tamanio);

        for (int i = 0; i < tamanio; i++) {
            listaDeAdyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino, int peso) {
        listaDeAdyacencia.get(origen).add(new Arista(destino, peso));
    }

    public List<Arista> obtenerVecinos(int vertice) {
        return listaDeAdyacencia.get(vertice);
    }

    public int tamaño() {
        return listaDeAdyacencia.size();
    }

}
