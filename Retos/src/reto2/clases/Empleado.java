package reto2.clases;

public class Empleado {
    private int id;
    private String nombre;
    private String tipoContrato;
    private int salario;

    public Empleado(String nombre, String tipoContrato, int salario) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.id = id++;
    }

}
