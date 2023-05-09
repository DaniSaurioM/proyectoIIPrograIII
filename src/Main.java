
/**
 * User: Gusifer
 * Date: 05/01/2023
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Buscar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Imprimir matriz");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("Ingrese los datos del nodo:");
                    System.out.print("Fila: ");
                    int fila = scanner.nextInt();
                    System.out.print("Columna: ");
                    int columna = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Línea: ");
                    String linea = scanner.nextLine();
                    System.out.print("Modelo: ");
                    int modelo = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Propietario: ");
                    String propietario = scanner.nextLine();

                    matriz.insertar(fila, columna, placa, color, linea, modelo, propietario);
                    System.out.println("---------------------------");
                    break;

                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Ingrese la posición del nodo a buscar:");
                    System.out.print("Fila: ");
                    int filaBuscar = scanner.nextInt();
                    System.out.print("Columna: ");
                    int columnaBuscar = scanner.nextInt();

                    matriz.buscar(filaBuscar, columnaBuscar);
                    System.out.println("---------------------------");
                    break;

                case 3:
                    System.out.println("---------------------------");
                    System.out.println("Ingrese la posición del nodo a eliminar:");
                    System.out.print("Fila: ");
                    int filaEliminar = scanner.nextInt();
                    System.out.print("Columna: ");
                    int columnaEliminar = scanner.nextInt();

                    matriz.eliminar(filaEliminar, columnaEliminar);
                    System.out.println("---------------------------");
                    break;

                case 4:
                    System.out.println("---------------------------");
                    matriz.imprimir();
                    System.out.println("---------------------------");
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el programa!");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}
