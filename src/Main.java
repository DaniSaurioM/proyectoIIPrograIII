public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        // Insertar un nodo en la posición (2, 3)
        matriz.insertar(2, 3, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        matriz.insertar(5, 3, "ABC-123", "Rojo", "Sedan", 2020, "Juan Perez");
        // Buscar un nodo en la posición (2, 3)
        NodoMatriz nodo = matriz.buscar(2, 3);

        if (nodo != null) {
            System.out.println("Placa: " + nodo.placa);
            System.out.println("Color: " + nodo.color);
            System.out.println("Linea: " + nodo.linea);
            System.out.println("Modelo: " + nodo.modelo);
            System.out.println("Propietario: " + nodo.propietario);
        } else {
            System.out.println("El nodo no existe en la matriz");
        }

        // Eliminar el nodo en la posición (2, 3)
        matriz.eliminar(2, 3);

        NodoMatriz nodo1 = matriz.buscar(2, 3);
        if (nodo1 != null) {
            System.out.println("Placa: " + nodo.placa);
            System.out.println("Color: " + nodo.color);
            System.out.println("Linea: " + nodo.linea);
            System.out.println("Modelo: " + nodo.modelo);
            System.out.println("Propietario: " + nodo.propietario);
        } else {
            System.out.println("El nodo no existe en la matriz");
        }

    }
}
