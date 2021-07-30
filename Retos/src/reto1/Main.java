package reto1;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Hugo", "hugo@email.com", "Termino Fijo", 1200000, "Dermatología");
        System.out.println("El valor de la seguridad social del empleado es: $" + emp1.liquidarSalud(emp1));
    }
}
