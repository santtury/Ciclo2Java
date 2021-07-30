package reto1;

/**
 * El reto 1 trata sobre realizar el cálculo de la liquidación de la seguridad
 * social de un empleado del hospital.
 * 
 * @author Santtury
 * @version 1.0
 */
public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String email;
    private String tipoContrato;
    private int salario;
    private String especialidad;

    // Método constructor
    public Empleado(String nombre, String email, String tipoContrato, int salario, String especialidad) {
        this.nombre = nombre;
        this.email = email;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.especialidad = especialidad;
    }

    /**
     * Este método cálcula la liquidadción de la seguridad social de un empleado a
     * partir del salario y los conceptos de seguridad social.
     * 
     * @param empleado Objeto empleado de donde se obtiene el salario del empleado.
     * @return El cálculo de la liquidación.
     */
    public double liquidarSalud(Empleado empleado) {
        double salud = 8.5;
        double pension = 12;
        double riesgosLaborales = 0.522;
        /*
         * Los valores de los conceptos están en porcentajes entonces se dividen por
         * 100.
         */
        return empleado.getSalario() * ((salud + pension + riesgosLaborales) / 100);
    }

    // Métodos get y set
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
