package constructores;

public class Empleado {
    protected String nombre;
    protected int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String detalles() {
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
}
