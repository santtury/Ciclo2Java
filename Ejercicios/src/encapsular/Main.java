package encapsular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante e1 = new Estudiante();

        System.out.println("Nombre del estudiante");
        e1.setNombre(sc.nextLine());

        System.out.println("Digite la nota 1");
        e1.setNota1(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite la nota 2");
        e1.setNota2(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite la nota 3");
        e1.setNota3(Double.parseDouble(sc.nextLine()));

        System.out.println("Nombre del estudiante: " + e1.getNombre());
        System.out.println("Promedio del estudiante: " + e1.promedio(e1.getNota1(), e1.getNota2(), e1.getNota3()));
        sc.close();
    }
}
