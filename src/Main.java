public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        // se hace la insercion de los nodos en la matriz
        matriz.insertar(1, 1, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        matriz.insertar(1, 2, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        matriz.insertar(3, 1, "ABC-255", "Rojo", "Sedan", 2020, "Juan Perez");

        System.out.println("\n Buscar nodo [1,2] ");
        matriz.buscar(1, 2);
        System.out.println("------------------------------");
        System.out.println("\n Buscar nodo [3,1] ");
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
