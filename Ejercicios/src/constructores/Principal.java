package constructores;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Mateo", 5000, "Sistemas");
        System.out.println("Gerente 1: " + gerente1.detalles());
        imprimir(gerente1);

        Empleado empleado1 = new Empleado("Henry", 6000);
        System.out.println("Empleado 1: " + empleado1.detalles());
        imprimir(empleado1);
    }

    public static void imprimir(Empleado empleado) {
        System.out.println("Empleado: " + empleado.detalles());
    }
}
