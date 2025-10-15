package com.mycompany.ds.SeccionA;

public class Article {
    private String contenido;

    public Article(String contenido) {
        this.contenido = contenido;
    }

    public void publicarArticulo() {
        System.out.println("Publicando artículo: " + contenido);
    }

    public void guardar(String filename) {
        // La clase hace más de una cosa: generar y guardar
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
