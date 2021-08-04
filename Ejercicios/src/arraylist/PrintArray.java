package arraylist;

import java.util.ArrayList;

public class PrintArray {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        Persona p1 = new Persona("Daniela", 1001, 14);
        Persona p2 = new Persona("Andrea", 1002, 10);
        Persona p3 = new Persona("Maria", 1003, 20);

        // Se adicionan los objetos al array
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);

        // Se imprime el array y size: Devuelve la cantidad de elementos agregados
        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.println(listaPersona.get(i).toString());
            System.out.println(listaPersona.get(i).getNombre());
        }

        // Se hace el recorrido pero con un foreach
        for (Persona elemento : listaPersona) {
            System.out.println(elemento);
            System.out.println(elemento.getNombre());
        }

        // Remover un elemento de la lista
        listaPersona.remove(1);
        System.out.println(listaPersona.size());

        // Cambiar un elemento de la lista
        listaPersona.get(0).setNombre("Sofía");
        for (Persona elemento : listaPersona) {
            System.out.println(elemento.getNombre());
        }

        // Se implementa el método saludar
        for (Persona elemento : listaPersona) {
            elemento.saludar();
        }
    }
}
