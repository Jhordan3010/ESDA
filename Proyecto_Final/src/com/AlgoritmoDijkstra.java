package com;

import java.util.Arrays;
import java.util.PriorityQueue;


public class AlgoritmoDijkstra {
    public Grafo grafo;
    public int[] distancia;
    public int inicio;

    public AlgoritmoDijkstra(Grafo grafo, int inicio) {
        this.grafo = grafo;
        this.distancia = new int[grafo.tamaño()];
        this.inicio = inicio;
    }

    public void dijkstra() {
        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();

        Arrays.fill(distancia, Integer.MAX_VALUE);

        colaPrioridad.add(new Nodo(inicio, 0));
        distancia[inicio] = 0;

        while (!colaPrioridad.isEmpty()) {
            Nodo nodoActual = colaPrioridad.poll();

            int verticeActual = nodoActual.vertice;
            int pesoActual = nodoActual.peso;

            if (pesoActual > distancia[verticeActual]) {
                continue;
            }

            for (Arista vecino : grafo.obtenerVecinos(verticeActual)) {
                int nuevaDistancia = distancia[verticeActual] + vecino.getPeso();

                if (nuevaDistancia < distancia[vecino.getDestino()]) {
                    distancia[vecino.getDestino()] = nuevaDistancia;
                    colaPrioridad.add(new Nodo(vecino.getDestino(), nuevaDistancia));
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < distancia.length; i++) {
            result.append("Distancia mínima desde ").append(inicio).append(" hasta ").append(i).append(": ");
            result.append((distancia[i] == Integer.MAX_VALUE) ? "-" : distancia[i]);
            result.append("\n");
        }
        return result.toString();
}

}