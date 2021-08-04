package arraylist;

public class Persona {
    // Atributos
    private String nombre;
    private int id;
    private int edad;

    // Constructor con parametros
    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    // Constructor vacio
    public Persona() {
    }

    // Gets y Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // El método toString muestra la información completa de un objeto, es decir, el
    // valor de sus atributos
    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", id=" + id + ", nombre=" + nombre + "]";
    }

    public void saludar() {
        System.out.printf("Hola soy s% n%", nombre);
    }

}
