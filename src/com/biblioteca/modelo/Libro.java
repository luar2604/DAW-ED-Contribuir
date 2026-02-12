package com.biblioteca.modelo;
import java.util.ArrayList;

/**
 * Representa un libro en el sistema de biblioteca
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int añoPublicacion;
    private boolean disponible;

    private ArrayList<String> usuarios = new ArrayList<>();
    private ArrayList<Integer> puntuaciones = new ArrayList<>();
    private ArrayList<String> comentarios = new ArrayList<>();
    private ArrayList<Calificacion> calificaciones = new ArrayList<>();


    public Libro(String titulo, String autor, String isbn, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (Calificacion c : calificaciones) {
            suma += c.getPuntuacion();
        }

        return (double) suma / calificaciones.size();
    }

    public void mostrarCalificaciones() {
        for (Calificacion c : calificaciones) {
            System.out.println(c);
        }
    }


    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return String.format("Libro: %s | Autor: %s | ISBN: %s | Año: %d | Disponible: %s",
                titulo, autor, isbn, añoPublicacion, disponible ? "Sí" : "No");
    }
}
