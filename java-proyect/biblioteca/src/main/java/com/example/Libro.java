package com.example;

import java.util.Objects;

public class Libro {
    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    
    public Libro() {
        this("", "", 0, "", false);
    }


    public Libro(String iSBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }


    public String getISBN() {
        return ISBN;
    }


    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public boolean isPrestado() {
        return prestado;
    }


    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    //Operaciones


    public void prestar() {
        if (this.prestado) {
            System.out.println("Este libro ya está prestado");
        } else {
            this.prestado = true;
            System.err.println("Este libro se ha prestado");
        }
    }

    public void devolver() {
        if (this.prestado) {
            System.out.println("Este libro no está prestado");
        } else {
            this.prestado = false;
            System.err.println("Este libro se ha devuelto");
        }
    }

    public double imprimir(double coste) {
        return coste * this.numeroPaginas;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (ISBN == null) {
            if (other.ISBN != null)
                return false;
        } else if (!ISBN.equals(other.ISBN))
            return false;
        return Objects.equals(this.ISBN, other.ISBN);
    }


    @Override
    public String toString() {

        String mensaje = "El libro" + this.ISBN + " con título " + this.titulo + " y autor" + this.autor +" tiene" + this.numeroPaginas + "páginas y ";

        if (!this.prestado) mensaje += " no ";

        mensaje += "está prestado";

        return mensaje;
    }


    

    


    
}
