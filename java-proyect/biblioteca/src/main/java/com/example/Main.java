package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);

        System.out.println(libro1);

        libro1.prestar();

        System.out.println(libro1);

        libro1.devolver();
        libro1.devolver();

        System.out.println(libro1);

        double costImpresion = libro1.imprimir(0.005);

        System.out.println("El coste ha sido de $" +costImpresion);

        Libro libro2 = new Libro("123456789", "Cinco años de soledad", 500, "Gabriel Garcia Marquez", false);

        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales");
        } else {
            System.out.println("Los libros no son iguales");
        
        }


    }
}