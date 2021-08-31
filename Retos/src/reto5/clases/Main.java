package reto5.clases;

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
                Doctor doctor2 = new Doctor("Oscar", "Termino Indefinido", 1800000, "Alergología");
                Doctor doctor3 = new Doctor("Pedro", "Prestación de Servicios", 1500000, "Cardiología");

                // System.out.println("El valor de la seguridad social del empleado es: $"
                // + hospital.liquidarSaludEmpleado(doctor1));
                // System.out.println(
                // "El valor de la nomina del empleado es: $" +
                // hospital.liquidarNominaEmpleado(doctor1));
                // System.out.println("El valor de las prestaciones sociales del empleado es: $"
                // + hospital.liquidarPrestacionesEmpleado(doctor1));
                // System.out.println("El valor de los aportes a parafiscales del empleado es:
                // $"
                // + hospital.liquidarParafiscalesEmpleado(doctor1));

                System.out.println(
                                "Valor del contrato indefinido: " + hospital.costoDoctorPorContratoIndefinido(doctor2));
                System.out.println("Valor del contrato fijo: "
                                + hospital.costoDoctorPorContratoFijo(doctor1, "2020-01-01", "2020-12-30"));
                System.out.println("Valor del contrato por prestaciones: "
                                + hospital.costoDoctorPorContratoPorPrestaciones(doctor3));

        }

}
