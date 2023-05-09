
/**
 * User: Gusifer
 * Date: 05/01/2023
 */

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        // se hace la insercion de los nodos en la matriz
        matriz.insertar(1, 1, "QWE-123", "Rojo", "Mitsubishi", 2002, "Juan Perez");
        matriz.insertar(1, 2, "ASD-456", "Verde", "Honda", 2019, "Marco Polo");
        matriz.insertar(2, 1, "ZXC-789", "Amarillo", "Ferrari", 2023, "Fernando Arriga");
        matriz.insertar(2, 2, "QAZ-741", "Blanco", "Mustang", 2022, "Maria Alonso");
        System.out.println("\n Buscar nodo [1,2] ");
        matriz.buscar(1, 2);
        System.out.println("------------------------------");

        System.out.println("\n Buscar nodo [2,1] ");
        matriz.buscar(3, 1);
        System.out.println("------------------------------");

        System.out.println("\n\n imprimir los nodos ");
        matriz.imprimir();
        System.out.println("------------------------------");

        System.out.println("\n\n eliminar nodo buscado [1,2] ");
        matriz.eliminar(1, 2);
        System.out.println("------------------------------");

        System.out.println("\n\n volver a Buscar nodo [1,2] ");
        matriz.buscar(1, 2);
        System.out.println("------------------------------");

        System.out.println("\n\n imprimir los nodos ");
        matriz.imprimir();

    }
}
