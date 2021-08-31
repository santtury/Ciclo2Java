package reto5.clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
     * @return El valor de la liquidación de los aportes a parafiscales
     */
    public static double liquidarParafiscalesEmpleado(Empleado empleado) {
        double cajaCompensacion = 0.04; // 4%
        double icbf = 0.03; // 3%
        double sena = 0.02; // 2%

        return empleado.getSalario() * (cajaCompensacion + icbf + sena);
    }

    /**
     * Este método cálcula el costo para el hospital de un doctor que tiene contrato
     * a término indefinido (Brinda las prestaciones sociales, un respectivo
     * porcentaje de la seguridad social y los parafiscales)
     * 
     * @param doctor Objeto doctor del cual se obtiene el salario del doctor
     * @return El valor del contrato del doctor
     */
    public static double costoDoctorPorContratoIndefinido(Doctor doctor) {
        // Seguridad social
        double salud = 0.125;
        double pension = 0.16;
        double riesgosLaborales = 0.00522;
        double seguridad1 = doctor.getSalario() * riesgosLaborales;
        double debitado = doctor.getSalario() * 0.40;
        double seguridad2 = debitado * (salud + pension);
        double seguridadSocial = seguridad1 + seguridad2;

        // Prestaciones sociales
        double prestaciones = liquidarPrestacionesEmpleado(doctor);

        // Parafiscales
        double parafiscales = liquidarParafiscalesEmpleado(doctor);

        return doctor.getSalario() + seguridadSocial + prestaciones + parafiscales;
    }

    /**
     * Este método cálcula el costo para el hospital de un doctor que tiene contrato
     * a término fijo (Lo mismo que el indefinido pero las responsabilidades
     * contractuales deben ser canceladas con respecto al tiempo de vinculación
     * laboral.)
     * 
     * @param doctor  Objeto doctor del cual se obtiene el salario del doctor
     * @param ingreso Fecha en que ingresa el doctor
     * @param retiro  Fecha en que se retira el doctor
     * @return El valor del contrato del doctor
     */
    public static double costoDoctorPorContratoFijo(Doctor doctor, String ingreso, String retiro) {

        // Calcular dias de trabajo
        LocalDate diaIngreso = LocalDate.parse(ingreso);
        LocalDate diaRetiro = LocalDate.parse(retiro);
        long diasTrabajados = ChronoUnit.DAYS.between(diaIngreso, diaRetiro);

        // Seguridad social
        // Aquí se usan los porcentajes originales y NO los que están en el pdf del reto
        // 5
        double seguridadSocial = (liquidarSaludEmpleado(doctor) / 30) * diasTrabajados;

        // Prestaciones sociales
        // Se eliminan los porcentajes que están en el método de liquidarPrestaciones
        double primaServicios = (doctor.getSalario() * diasTrabajados) / 360;
        double cesantias = (doctor.getSalario() * diasTrabajados) / 360;
        double interesesCesantias = (0.12 * (360 * cesantias)) / 360;
        double vacaciones = (doctor.getSalario() * diasTrabajados) / 720;
        double prestaciones = primaServicios + cesantias + interesesCesantias + vacaciones;

        // Parafiscales
        double parafiscales = (liquidarParafiscalesEmpleado(doctor) / 30) * diasTrabajados;

        // Salario
        double salario = (doctor.getSalario() / 30) * diasTrabajados;

        return salario + seguridadSocial + prestaciones + parafiscales;
    }

    /**
     * Este método cálcula el costo para el hospital de un doctor que tiene contrato
     * por prestación de servicios (Solo se pagan sus honorarios)
     * 
     * @param doctor Objeto doctor del cual se obtiene el salario del doctor
     * @return El valor del contrato del doctor
     */
    public static double costoDoctorPorContratoPorPrestaciones(Doctor doctor) {
        return doctor.getSalario();
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
