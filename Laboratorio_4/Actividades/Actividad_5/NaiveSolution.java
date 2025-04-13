package Actividades.Actividad_5;

public class NaiveSolution {

    // Método recursivo para obtener el valor máximo de corte de barra
    static int getValue(int[] values, int length) {
        if (length <= 0) // Caso base: si la longitud es 0 o menor, el valor es 0
            return 0;

        int tmpMax = -1; // Inicializa el valor máximo temporal
        // Recorre todas las posibles longitudes de corte
        for (int i = 0; i < length; i++) {
            // Compara y actualiza el máximo entre el actual y el valor
            // del corte más el valor del problema restante
            tmpMax = Math.max(tmpMax, values[i] + getValue(values, length - i - 1));
        }

        return tmpMax; // Devuelve el valor máximo encontrado
    }

    public static void main(String[] args) {
        int[] values = new int[]{3, 7, 1, 3, 9}; // Valores asociados a cortes de longitud 1 a 5
        int rodLength = values.length; // Longitud total de la barra
        System.out.println("El valor máximo: " + getValue(values, rodLength)); // Llama al método y muestra el resultado
    }
}
