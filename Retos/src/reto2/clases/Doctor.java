package reto2.clases;

/**
 * La clase Doctor es una subclase de empleado y añade un atributo de
 * especialidad al empleado convirtiendolo en doctor
 * 
 * @author Santtury
 */
public class Doctor extends Empleado {
    // Atributos
    private String especialidad;

    // Constructor
    public Doctor(String nombre, String tipoContrato, int salario, String especialidad) {
        super(nombre, tipoContrato, salario);
        this.especialidad = especialidad;
    }

    // Gets y Sets
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
