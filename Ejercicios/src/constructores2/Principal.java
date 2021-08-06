package constructores2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Definición de variables
        char resp;
        boolean aa;
        String matricula;
        int numSillas;
        int sillasAdic;
        Scanner sc = new Scanner(System.in);

        // Creación de objetos v1, v2 y v3 instanciando la superclase Vehículo
        Vehiculo v1 = new Vehiculo();
        System.out.println("El vehículo con placa " + v1.getMatricula() + " tiene " + v1.getNumSillas() + " sillas");

        Vehiculo v2 = new Vehiculo("QHU381");
        System.out.println("El vehículo con placa " + v2.getMatricula() + " tiene " + v2.getNumSillas() + " sillas");

        Vehiculo v3 = new Vehiculo("UZX234", 4);
        System.out.println("El vehículo con placa " + v3.getMatricula() + " tiene " + v3.getNumSillas() + " sillas");

        // Creación de objetos t1, t2 y t3 instanciando la subclase Taxi
        System.out.print("Primer taxi, Tiene aire acondicionado?(S/N): ");
        resp = sc.next().charAt(0); // Leer un caracter
        aa = resp == 'S' || resp == 's'; // Prueba de operador ||
        Taxi t1 = new Taxi(aa);
        System.out.printf("El primer taxi con matricula %s tiene %d sillas y %s%n", t1.getMatricula(),
                t1.getNumSillas(), (t1.isAA() ? "Tiene AA" : "No tiene AA"));

        System.out.print("Segundo taxi, Número de matricula: ");
        matricula = sc.next();
        System.out.print("Segundo taxi, Tiene aire acondicionado?(S/N): ");
        resp = sc.next().charAt(0);
        aa = resp == 'S' || resp == 's';
        Taxi t2 = new Taxi(matricula, aa);
        System.out.printf("El segundo taxi con matricula %s tiene %d sillas y %s%n", t2.getMatricula(),
                t2.getNumSillas(), (t2.isAA() ? "Tiene AA" : "No tiene AA"));

        System.out.print("Tercer taxi, Número de sillas: ");
        numSillas = sc.nextInt();
        System.out.print("Tercer taxi, Número de matricula: ");
        matricula = sc.next();
        System.out.print("Tercer taxi, Tiene aire acondicionado?(S/N): ");
        resp = sc.next().charAt(0);
        aa = resp == 'S' || resp == 's';
        Taxi t3 = new Taxi(matricula, numSillas, aa);
        System.out.printf("El tercer taxi con matricula %s tiene %d sillas y %s%n", t3.getMatricula(),
                t3.getNumSillas(), (t3.isAA() ? "Tiene AA" : "No tiene AA"));

        // Creación de objeto c1 instanciando la subclase Camioneta
        System.out.print("Camioneta, Número de matricula: ");
        matricula = sc.next();
        System.out.print("Camioneta, Número de sillas adicionales: ");
        sillasAdic = sc.nextInt();
        System.out.print("Camioneta, Tiene aire acondicionado?(S/N): ");
        resp = sc.next().charAt(0);
        aa = resp == 'S' || resp == 's';
        Camioneta c1 = new Camioneta(matricula, aa);
        c1.setSillasAdicionales(sillasAdic);
        System.out.printf("La camioneta con matricula %s tiene %d sillas y %s%n", c1.getMatricula(), c1.getNumSillas(),
                (c1.isAA() ? "Tiene AA" : "No tiene AA"));

        sc.close();
    }
}
