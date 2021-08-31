package unidad2;

public class Funcion {

    public static void saludar() {
        System.out.println("Hola Mundo!");
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        saludar();
        double resultado = sumar(4, 456);
        System.out.println("La suma de 4 + 456 = " + resultado);
    }
}
