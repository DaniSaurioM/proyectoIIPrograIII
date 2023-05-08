public class Matriz {
    NodoMatriz inicio;

    public Matriz() {
        inicio = null;
    }

    public NodoMatriz buscar(int fila, int columna) {
        NodoMatriz actual = inicio;
        while (actual != null) {
            if (actual.fila == fila && actual.columna == columna) {
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
        return null;
    }

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

    public void eliminar(int fila, int columna) {
        NodoMatriz nodoAEliminar = buscar(fila, columna);
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

}