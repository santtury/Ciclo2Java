package reto2.clases;

import java.util.ArrayList;

/**
 * La clase Hospital contiene a todos los empleados, además de los métodos para
 * liquidarlos
 * 
 * @author Santtury
 */
public class Hospital {
    // Atributos
    private String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();

    /**
     * Este método calcula la nómina de un empleado del hospital, tomando su salario
     * devengado y restándole las deducciones de salud y pensión
     * 
     * @param empleado Objeto empleado al que se le va a obtener el salario y
     *                 calcular su nómina
     * @return El valor de la nómina del empleado
     */
    public static double liquidarNominaEmpleado(Empleado empleado) {
        double salud = 4;
        double pension = 4;
        double deducciones = empleado.getSalario() * ((salud + pension) / 100);

        return empleado.getSalario() - deducciones;
    }

    /**
     * Este método cálcula la liquidadción de salud de un empleado a partir del
     * salario y los conceptos de seguridad social.
     * 
     * @param empleado Objeto empleado al que se le va a obtener el salario y
     *                 calcular su nómina
     * @return El valor de la seguridad social del empleado
     */
    public static double liquidarSaludEmpleado(Empleado empleado) {
        double salud = 8.5;
        double pension = 12;
        double riesgosLaborales = 0.522;
        /*
         * Los valores de los conceptos están en porcentajes entonces se dividen por
         * 100.
         */
        return empleado.getSalario() * ((salud + pension + riesgosLaborales) / 100);
    }

    // Gets y Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
