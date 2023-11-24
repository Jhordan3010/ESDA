package com;

public class Inicial {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");

        int[] a = {7, 3, 2, -5, 4};
        Arreglos b = new Arreglos(5);
//        b.ingresarDatos();
        System.out.println("Sumar:" + b.Sumar());
        System.out.println("Promedio: " + b.Promedio());
        System.out.println("Numero mayor: " + b.NumMayor());
        System.out.println("Numero menor: " + b.NumMenor());
        System.out.println("Buscar numero: " + b.Buscar(2));
        System.out.println("Ordenar: " + b.Ordenar().Imprimir());
        System.out.println("Invertir: " + b.Invertir().Imprimir());
    }
}
