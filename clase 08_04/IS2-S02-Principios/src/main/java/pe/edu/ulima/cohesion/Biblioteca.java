package pe.edu.ulima.cohesion;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
       private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregaLibro(Libro l) {
        libros.add(l);
    }

    public void muestraLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void imprimeResumen() {
        System.out.println("Cantidad de Libros: " + libros.size());
    }
}
