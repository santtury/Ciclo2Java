package constructores;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Mateo", 5000, "Sistemas");
        System.out.println("Gerente 1: " + gerente1.detalles());
    }
}
