package unidad2;

public class Elefante {

    private String nombre;
    private int edad;
    private String origen;
    private float peso;
    private float estatura;

    public void alimentarse(String comida) {
        System.out.println("Esta comiendo " + comida);
    }

    public void beber(String liquido) {

    }

    public String emitirSonido() {
        return "sonido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

}
