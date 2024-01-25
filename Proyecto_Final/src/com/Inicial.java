package com;

import java.util.*;

public class Inicial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Crear grafo vacío
        Map<String, Map<String, Integer>> graph = new HashMap<>();

        // Obtener información del grafo desde el usuario
        try {
            System.out.println("Ingrese el número de aristas:");
            int numEdges = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese las aristas en el formato 'nodo1 nodo2 peso':");
            for (int i = 0; i < numEdges; i++) {
                String node1 = scanner.next();
                String node2 = scanner.next();
                
                // Validar que el próximo token sea un entero
                if (scanner.hasNextInt()) {
                    int weight = scanner.nextInt();
                    
                    // Agregar arista al grafo
                    graph.computeIfAbsent(node1, k -> new HashMap<>()).put(node2, weight);
                    graph.computeIfAbsent(node2, k -> new HashMap<>()).put(node1, weight);
                } else {
                    System.out.println("Error: Se esperaba un valor entero para el peso.");
                    return;
                }
            }

            // Nodo de inicio
            System.out.println("Ingrese el nodo de inicio:");
            String startNode = scanner.next();

            // Crear una instancia de la clase AlgoritmoDijkstra
            AlgoritmoDijkstra algoritmoDijkstra = new AlgoritmoDijkstra();

            // Obtener y mostrar los resultados utilizando el método de la clase AlgoritmoDijkstra
            Map<String, Integer> result = algoritmoDijkstra.dijkstra(graph, startNode);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingreso inválido. Asegúrate de ingresar valores numéricos correctamente.");
        } finally {
            scanner.close();
        }
    }
}
