package com;

import java.util.Scanner;

public class Arreglos {

    int[] a;

    public Arreglos(int[] a) {
        this.a = a;
    }

    public Arreglos(int indice) {
        this.a = new int[indice];
    }

//    public void ingresarDatos() {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("Valor posición " + (i + 1) + ": ");
//            a[i] = scanner.nextInt();
//        }
//    }

    public int Sumar() {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            r += a[i];
        }
        return r;
    }

    public double Promedio() {
        double promedio = 0;
        for (int i = 0; i < a.length; i++) {
            promedio += a[i];
        }
        promedio /= a.length;
        return promedio;
    }

    public int NumMayor() {
        int mayor = a[0];
        for (int i = 0; i < a.length; i++) {
            if (mayor < a[i]) {
                mayor = a[i];
            }
        }
        return mayor;
    }

    public int NumMenor() {
        int menor = a[0];
        for (int i = 0; i < a.length; i++) {
            if (menor > a[i]) {
                menor = a[i];
            }
        }
        return menor;
    }
    
    public boolean Buscar(int num){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    public Arreglos Ordenar(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int n = a[i];
                    a[i] = a[j];
                    a[j] = a[i];
                }
            }
        }
        return new Arreglos(a);
    }
    
    public Arreglos Invertir(){
        int ul = a.length-1;
        for (int p = 0; p < ul -p; p++) {
            int n = a[p];
            a[p] = a[ul-p];
            a[ul - p] = n;
        }
        return new Arreglos(a);
    }
    
    public String Imprimir(){
        String imp ="";
        for (int i = 0; i < a.length; i++) {
            imp += a[i] +" ";
        }
        return imp;
    }
}
