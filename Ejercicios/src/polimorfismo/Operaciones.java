package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones {
    protected int valorUno;
    protected int valorDos;
    protected int resultado;
    Scanner input = new Scanner(System.in);

    // Método para pedir valores
    public void pedirValor() {
        System.out.print("Ingrese el primer valor: ");
        valorUno = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo valor: ");
        valorDos = Integer.parseInt(input.nextLine());
    }

    // Método abstracto
    public abstract void operacion();

    // Método para mostrar
    public int mostrarResultado() {
        return resultado;
    }
}
