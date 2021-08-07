package polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        System.out.println("Datos para la suma");
        suma1.pedirValor();
        suma1.operacion();
        System.out.println("El resultado de la suma es: " + suma1.mostrarResultado());
        System.out.println("");

        Resta resta1 = new Resta();
        System.out.println("Datos para la resta");
        resta1.pedirValor();
        resta1.operacion();
        System.out.println("El resultado de la resta es: " + resta1.mostrarResultado());
        System.out.println("");
    }
}
