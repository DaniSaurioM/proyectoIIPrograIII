public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        System.out.println("se ingresan los nodos");
        System.out.println("----------------------------");
        // Insertar un nodo en la posición (2, 3)
        matriz.insertar(2, 3, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        matriz.insertar(5, 3, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        matriz.insertar(5, 1, "ABC-255", "Rojo", "Sedan", 2020, "Juan Perez");
        System.out.println("se busca nodo 2, 3");
        System.out.println("----------------------------");
        // Buscar un nodo en la posición (2, 3)
        matriz.buscar(5, 1);

        System.out.println("se imprimen ambos nodos");
        System.out.println("----------------------------");
        // Imprimir nodos
        matriz.imprimir();

        System.out.println("eliminamos nodos 2, 3");
        System.out.println("----------------------------");
        // Eliminar el nodo en la posición (2, 3)
        matriz.eliminar(2, 3);

        System.out.println(" volvemos a buscar nodo 2, 3");
        System.out.println("----------------------------");
        matriz.buscar(2, 3);

        System.out.println("se imprimen  nodos");
        System.out.println("----------------------------");
        // Imprimir nodos
        matriz.imprimir();

    }
}
