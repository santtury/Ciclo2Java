package unidad2;

public class Programa {
    public static void main(String[] args) {
        // Actividad 1
        Elefante e; // Declaración
        e = new Elefante(); // Inicialización
        e.setNombre("Dumbo"); // Asignación
        e.setEdad(20);
        e.alimentarse("manzana");
        System.out.println("El elefante se llama " + e.getNombre());
        System.out.println("El elefante tiene" + e.getEdad() + "años");

        // Actividad 3
        Cliente c1, c2;
        c1 = new Cliente(20, 'F', "Juana");
        c2 = new Cliente(true);

        System.out.println("Objeto " + c1.getId());
        c1.imprimirValoresPorDefecto();
        System.out.println("Objeto " + c2.getId());
        c2.imprimirValoresPorDefecto();

    }
}
