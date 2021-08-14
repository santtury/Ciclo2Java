package reto3.clases;

/**
 * En esta clase se hacen las pruebas para verificar el correcto funcionamiento
 * del proyecto
 * 
 * @author Santtury
 */
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doctor1 = new Doctor("Hugo", "Termino Fijo", 1200000, "Dermatología");

        System.out.println(
                "El valor de la seguridad social del empleado es: $" + hospital.liquidarSaludEmpleado(doctor1));
        System.out.println("El valor de la nomina del empleado es: $" + hospital.liquidarNominaEmpleado(doctor1));
        System.out.println("El valor de las prestaciones sociales del empleado es: $"
                + hospital.liquidarPrestacionesEmpleado(doctor1));
        System.out.println("El valor de los aportes a parafiscales del empleado es: $"
                + hospital.liquidarParafiscalesEmpleado(doctor1));
    }

}
