public class NodoMatriz {
    int fila;
    int columna;
    String placa;
    String color;
    String linea;
    int modelo;
    String propietario;
    NodoMatriz arriba;
    NodoMatriz abajo;
    NodoMatriz izquierda;
    NodoMatriz derecha;

    public NodoMatriz(int fila, int columna, String placa, String color, String linea, int modelo, String propietario) {
        this.fila = fila;
        this.columna = columna;
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }
}
