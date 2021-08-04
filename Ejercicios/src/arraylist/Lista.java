package arraylist;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList lista1 = new ArrayList();

        lista1.add(10);
        lista1.add(13);
        lista1.add(true);

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("Que contiene mi lista: " + lista1.get(i));
        }
    }
}
