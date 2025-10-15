package com.mycompany.ds.SeccionA;

public class Articulo {
    private String contenido;

    public Articulo(String contenido) {
        this.contenido = contenido;
    }

    public void generarArticulo() {
        System.out.println("Generando artículo: " + contenido);
    }

    public String mostrarContenido() {
        return contenido;
    }
}

class ArticleSaver {
    public void save(Articulo articulo, String filename) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(articulo.mostrarContenido());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


class DurationCalculator1 {
    public int calcular(Object media) {
        if (media instanceof Cancion) {
            Cancion c = (Cancion) media;
            return c.getMinutos() * 60; // duración en segundos
        } else if (media instanceof Podcast) {
            Podcast1 p = (Podcast1) media;
            return p.getMinutos() * 60;
        } else if (media instanceof Video) {
            Video1 v = (Video1) media;
            return v.getMinutos() * 60;
        }
        return 0;
    }
}

class Cancion {
    private int minutes;
    Cancion(int minutes) { this.minutes = minutes; }
    public int getMinutos() { return minutes; }
}

class Podcast1 {
    private int minutes;
    Podcast1(int minutes) { this.minutes = minutes; }
    public int getMinutos() { return minutes; }
}

class Video1 {
    private int minutos;
    Video1(int minutos) { this.minutos = minutos; }
    public int getMinutos() { return minutos; }
}




interface Media {
    int getDuracionEnSegundos();
}

class Song implements Media {
    private int minutes;
    Song(int minutes) { this.minutes = minutes; }
    public int getDuracionEnSegundos() { return minutes * 60; }
}

class Podcast implements Media {
    private int minutes;
    Podcast(int minutes) { this.minutes = minutes; }
    public int getDuracionEnSegundos() { return minutes * 60; }
}

class Video implements Media {
    private int minutes;
    Video(int minutes) { this.minutes = minutes; }
    public int getDuracionEnSegundos() { return minutes * 60; }
}

class DurationCalculator {
    public int calculate(Media media) {
        return media.getDuracionEnSegundos();
    }
}




class Device1 {
    public void conectarWifi() {
        System.out.println("Conectado al WiFi");
    }
}

class RadioVieja extends Device1 {
    @Override
    public void conectarWifi() {
        throw new UnsupportedOperationException("No tengo WiFi");
    }
}



// Clase base más general
class Device {
    public void turnOn() {
        System.out.println("Encendiendo dispositivo...");
    }
}

// Interfaz para los dispositivos que sí pueden conectarse a WiFi
interface WifiConnectable {
    void connectToWifi();
}

// Dispositivo moderno que sí tiene WiFi
class SmartTV extends Device implements WifiConnectable {
    @Override
    public void connectToWifi() {
        System.out.println("SmartTV conectada al WiFi");
    }
}

// Dispositivo sin WiFi
class OldRadio extends Device {
    // No implementa WifiConnectable
}




interface SchoolMember {
    void teach();
    void estudiar();
}

class Teacher1 implements SchoolMember {
    public void teach() {
        System.out.println("Profesor enseñando");
    }

    public void estudiar() {
        throw new UnsupportedOperationException("Los profesores no estudian en clase");
    }
}


// Cada interfaz tiene una responsabilidad separada
interface Teacher {
    void teach();
}

interface Student {
    void study();
}

// Solo las clases que realmente enseñan implementan Teacher
class Professor implements Teacher {
    public void teach() {
        System.out.println("Profesor enseñando");
    }
}

// Y las clases que estudian implementan Student
class Alumno implements Student {
    public void study() {
        System.out.println("Estudiante estudiando");
    }
}

// Si alguien puede hacer ambas cosas, implementa ambas interfaces
class TeachingAssistant implements Teacher, Student {
    public void teach() {
        System.out.println("Asistente enseñando");
    }

    public void study() {
        System.out.println("Asistente estudiando");
    }
}




class Car1 {
    public void startEngine() {
        System.out.println("Motor encendido");
    }

    public void stopEngine() {
        System.out.println("Motor apagado");
    }
}

class Key1 {
    private Car1 car;

    public Key1(Car1 car) {
        this.car = car;
    }

    public void turn() {
        car.startEngine();
    }
}




interface Switchable {
    void turnOn();
    void turnOff();
}

// Clase concreta: un carro que puede encenderse o apagarse
class Car implements Switchable {
    public void turnOn() {
        System.out.println("Motor del carro encendido");
    }

    public void turnOff() {
        System.out.println("Motor del carro apagado");
    }
}

// Otra clase que también podría ser controlada por una llave
class Motorcycle implements Switchable {
    public void turnOn() {
        System.out.println("Moto encendida");
    }

    public void turnOff() {
        System.out.println("Moto apagada");
    }
}

// La llave depende de la interfaz, no de una clase concreta
class Key {
    private Switchable device;

    public Key(Switchable device) {
        this.device = device;
    }

    public void turn() {
        device.turnOn();
    }

    public void remove() {
        device.turnOff();
    }
}

