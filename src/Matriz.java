
public class Matriz {
    NodoMatriz inicio;

    /*
     * La clase Matriz tiene un campo privado inicio que apunta al primer nodo de la
     * matriz.
     * Cuando se inserta el primer nodo en la matriz, inicio se establece en ese
     * nodo. Si la matriz está vacía, inicio es null.
     */

    public Matriz() {
        inicio = null;
    }

    /*
     * La inserción y eliminación de nodos se realiza siguiendo el algoritmo de
     * búsqueda en la matriz.
     * Si el nodo ya existe en la posición dada, se actualizan sus datos.
     * Si no existe, se crea un nuevo nodo y se inserta en la posición
     * correspondiente de la matriz.
     * La eliminación de un nodo implica la eliminación de las referencias al nodo
     * en las listas adyacentes.
     */

    /*
     * busca un nodo en la matriz dado su fila y columna.
     * Si lo encuentra, llama al método imprimirNodo para imprimir los datos del
     * nodo y devuelve el nodo encontrado.
     * Si no lo encuentra, imprime un mensaje de error y devuelve null.
     */
    public NodoMatriz buscar(int fila, int columna) {
        NodoMatriz actual = inicio;
        while (actual != null) {
            if (actual.fila == fila && actual.columna == columna) {
                imprimirNodo(actual); // Llamar a la función imprimirNodo si se encuentra el nodo
                return actual;
            } else if (actual.fila > fila) {
                actual = actual.arriba;
            } else if (actual.fila < fila) {
                actual = actual.abajo;
            } else if (actual.columna > columna) {
                actual = actual.izquierda;
            } else if (actual.columna < columna) {
                actual = actual.derecha;
            }
        }
        System.out.println("El nodo no existe en la matriz");
        return null;
    }

    /* imprime los datos de un nodo en la consola. */
    public void imprimirNodo(NodoMatriz nodo) {
        System.out.println("Placa: " + nodo.placa);
        System.out.println("Color: " + nodo.color);
        System.out.println("Linea: " + nodo.linea);
        System.out.println("Modelo: " + nodo.modelo);
        System.out.println("Propietario: " + nodo.propietario);
    }

    /*
     * inserta un nuevo nodo en la matriz, o actualiza los datos de un nodo
     * existente si ya existe en esa posición.
     */
    public void insertar(int fila, int columna, String placa, String color, String linea, int modelo,
            String propietario) {
        NodoMatriz nuevoNodo = new NodoMatriz(fila, columna, placa, color, linea, modelo, propietario);

        if (inicio == null) {
            inicio = nuevoNodo;
            return;
        }

        NodoMatriz actual = inicio;
        while (actual != null) {
            if (actual.fila == fila && actual.columna == columna) {
                actual.placa = placa;
                actual.color = color;
                actual.linea = linea;
                actual.modelo = modelo;
                actual.propietario = propietario;
                return;
            } else if (actual.fila > fila) {
                if (actual.arriba == null) {
                    actual.arriba = nuevoNodo;
                    nuevoNodo.abajo = actual;
                    return;
                } else {
                    actual = actual.arriba;
                }
            } else if (actual.fila < fila) {
                if (actual.abajo == null) {
                    actual.abajo = nuevoNodo;
                    nuevoNodo.arriba = actual;
                    return;
                } else {
                    actual = actual.abajo;
                }
            } else if (actual.columna > columna) {
                if (actual.izquierda == null) {
                    actual.izquierda = nuevoNodo;
                    nuevoNodo.derecha = actual;
                    return;
                } else {
                    actual = actual.izquierda;
                }
            } else if (actual.columna < columna) {
                if (actual.derecha == null) {
                    actual.derecha = nuevoNodo;
                    nuevoNodo.izquierda = actual;
                    return;
                } else {
                    actual = actual.derecha;
                }
            }
        }
    }

    /* elimina un nodo de la matriz dado su fila y columna. */
    public void eliminar(int fila, int columna) {
        NodoMatriz nodoAEliminar = buscar(fila, columna);

        System.out.println("NODO ELIMINADO");
        if (nodoAEliminar == null) {
            return;
        }

        if (nodoAEliminar.izquierda != null) {
            nodoAEliminar.izquierda.derecha = nodoAEliminar.derecha;
        }
        if (nodoAEliminar.derecha != null) {
            nodoAEliminar.derecha.izquierda = nodoAEliminar.izquierda;
        }
        if (nodoAEliminar.arriba != null) {
            nodoAEliminar.arriba.abajo = nodoAEliminar.abajo;
        }
        if (nodoAEliminar.abajo != null) {
            nodoAEliminar.abajo.arriba = nodoAEliminar.arriba;
        }

        if (nodoAEliminar == inicio) {
            inicio = nodoAEliminar.abajo != null ? nodoAEliminar.abajo : nodoAEliminar.derecha;
        }
    }

    /*
     * imprime la matriz completa en forma de matriz, es decir,
     * como una tabla donde cada celda es una entrada de la matriz
     * y los valores de las celdas se muestran en su posición correspondiente en la
     * tabla.
     */
    public void imprimir() {
        NodoMatriz actual = inicio;
        while (actual != null) {
            NodoMatriz aux = actual;
            while (aux != null) {
                System.out.print("[" + aux.fila + "," + aux.columna + "] ");
                aux = aux.derecha;
            }
            System.out.println();
            actual = actual.abajo;
        }
    }

}
