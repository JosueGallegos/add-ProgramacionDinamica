import java.util.ArrayList;
import java.util.List;

import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio Uno
        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<List<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        printList(result);

        // Ejercicio Dos
        EjercicioDos ejerDos = new EjercicioDos();
        int n = 1;
        List<String> result1 = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(result1);
        
        n = 3;
        List<String> result2 = ejerDos.generateParenthesis(n);
        System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
        System.out.println(result2);

        // Ejemplo de cadena y StringBuilder
        String cadena = "Hola";
        System.out.println("Cadena Original: " + cadena.hashCode() + " " + cadena + " Mundo");
        cadena += " Mundo";
        System.out.println("Cadena Modificada: " + cadena.hashCode() + " " + cadena);

        StringBuilder sb = new StringBuilder("Hola");
        System.out.println("StringBuilder Original: " + sb.hashCode() + " " + sb.toString());
        sb.append(" Mundo");
        System.out.println("StringBuilder Modificado: " + sb.hashCode() + " " + sb.toString());
    }
    private static void printList(List<?> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


