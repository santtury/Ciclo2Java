package unidad2;

public class Cliente {

    private int edad;
    private int id;
    private char sexo;
    private boolean estado;
    private String direccion;
    private String nombre;
    private long puntos;
    private String compras[];

    public Cliente() {
        System.out.println("Por defecto");
    }

    public Cliente(boolean bandera) {
        if (bandera) {
            inicio();
        }

        asignarId();
    }

    public Cliente(int edad, char sexo, String nombre) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        asignarId();
    }

    public void asignarId() {
        this.id = (int) Math.round(Math.random() * 1000);
    }

    public void inicio() {
        System.out.println("Método inicial");
    }

    public void imprimirValoresPorDefecto() {
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado: " + estado);
        System.out.println("Direccion: " + direccion);
        System.out.println("Puntos: " + puntos);
        System.out.println("Compras: " + compras);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
