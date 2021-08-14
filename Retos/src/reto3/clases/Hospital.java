package reto3.clases;

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
        double salud = 0.04; // 4%
        double pension = 0.04; // 4%
        double deducciones = empleado.getSalario() * (salud + pension);

        return empleado.getSalario() - deducciones;
    }

    /**
     * Este método cálcula la liquidadción de la salud de un empleado a partir del
     * salario y los conceptos de seguridad social.
     * 
     * @param empleado Objeto empleado al que se le va a obtener el salario y
     *                 calcular su nómina
     * @return El valor de la seguridad social del empleado
     */
    public static double liquidarSaludEmpleado(Empleado empleado) {
        double salud = 0.085; // 8.5%
        double pension = 0.12; // 12%
        double riesgosLaborales = 0.00522; // 0.522%
        /*
         * Los valores de los conceptos están en porcentajes entonces se dividen por
         * 100.
         */
        return empleado.getSalario() * (salud + pension + riesgosLaborales);
    }

    /**
     * Este método calcula las prestaciones sociales de un empleado. Las
     * prestaciones sociales se componen de los conceptos de prima de servicios
     * (Equivale a 8,33% del salario de un empleado), cesantías (Equivale a 8,33%
     * del salario de un empleado), intereses sobre las cesantías (Equivale a 12%
     * sobre las cesantias) y vacaciones (Equivale a 4.16% del salario de un
     * empleado).
     * 
     * @param empleado Objeto empleado del cual se obtiene el salario
     * @return El valor de la suma de todas las prestaciones sociales de un empleado
     */
    public static double liquidarPrestacionesEmpleado(Empleado empleado) {
        double primaServicios = 0.0833 * empleado.getSalario(); // 8.33%
        double cesantias = 0.0833 * empleado.getSalario(); // 8.33%
        double interesesCesantias = 0.12 * cesantias; // 12%
        double vacaciones = 0.0416 * empleado.getSalario(); // 4.16%

        return primaServicios + cesantias + interesesCesantias + vacaciones;
    }

    /**
     * Este método calcula la liquidación de los aportes a parafiscales, se obtienen
     * los porcentajes de caja de compensación (4%), ICBF (3%) y SENA (2%), que se
     * calculan sobre el salario de un empleado (excluyendo el auxilio de
     * transporte).
     * 
     * @param empleado Objeto empleado del cual se obtiene el salario
     * @return El valor de la liqidación de los aportes a parafiscales
     */
    public static double liquidarParafiscalesEmpleado(Empleado empleado) {
        double cajaCompensacion = 0.04; // 4%
        double icbf = 0.03; // 3%
        double sena = 0.02; // 2%

        return empleado.getSalario() * (cajaCompensacion + icbf + sena);
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
