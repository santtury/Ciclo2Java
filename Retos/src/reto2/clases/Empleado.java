package reto2.clases;

/**
 * La clase Empleado es la superclase que tiene los atributos comúnes de todos
 * los empleados del hospital
 * 
 * @author Santtury
 */
public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String tipoContrato;
    private int salario;

    // Constructor
    public Empleado(String nombre, String tipoContrato, int salario) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.id = 0;
    }

    // Gets y Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
