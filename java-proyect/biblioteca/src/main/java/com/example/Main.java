package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);

        System.err.println(libro1);

        libro1.prestar();

        System.err.println(libro1);

        libro1.devolver();
        libro1.devolver();

        System.err.println(libro1);

        double costImpresion = libro1.imprimir(0.005);

        System.err.println("El coste ha sido de $" +costImpresion);

        Libro libro2 = new Libro("123456789", "Cinco años de soledad", 500, "Gabriel Garcia Marquez", false);

        if (libro1.equals(libro2)) {
            System.err.println("Los libros son iguales");
        } else {
            System.err.println("Los libros no son iguales");
        
        }


    }
}