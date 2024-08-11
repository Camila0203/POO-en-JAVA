package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Lista de libros
        ArrayList<Libro> libros = new ArrayList<>();
        // Mapa de usuarios
        HashMap<String, Usuario> usuarios = new HashMap<>();
        // Cola de préstamos
        Queue<Prestamo> prestamos = new LinkedList<>();

        // Añadir libros a la biblioteca
        libros.add(new Libro("1984", "George Orwell", "Secker & Warburg", 1949, 328));
        libros.add(new Libro("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 281));

        // Registrar usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "juan.perez@example.com", "12345");
        Usuario usuario2 = new Usuario("Ana", "Gómez", "ana.gomez@example.com", "67890");
        usuarios.put(usuario1.getNumeroIdentificacion(), usuario1);
        usuarios.put(usuario2.getNumeroIdentificacion(), usuario2);

        // Realizar préstamos
        Date fechaPrestamo = new Date();
        Date fechaDevolucion = new Date(fechaPrestamo.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 días después
        prestamos.add(new Prestamo(libros.get(0), usuario1, fechaPrestamo, fechaDevolucion));
        prestamos.add(new Prestamo(libros.get(1), usuario2, fechaPrestamo, fechaDevolucion));

        // Mostrar información de préstamos
        for (Prestamo prestamo : prestamos) {
            System.out.println("Libro: " + prestamo.getLibro().getTitulo());
            System.out.println("Prestado a: " + prestamo.getUsuario().getNombre() + " " + prestamo.getUsuario().getApellido());
            System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
            System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
            System.out.println();
        }
    }
}

