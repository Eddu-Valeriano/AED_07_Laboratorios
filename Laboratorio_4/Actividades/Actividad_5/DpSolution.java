package Actividades.Actividad_5;

public class DpSolution {

    // Método que implementa la solución con Programación Dinámica
    static int getValue(int[] values, int rodLength) {
        int[] subSolutions = new int[rodLength + 1]; // Arreglo para almacenar soluciones parciales

        // Itera sobre todas las longitudes de barra posibles
        for (int i = 1; i <= rodLength; i++) {
            int tmpMax = -1; // Valor máximo temporal
            // Prueba todos los cortes posibles para la longitud i
            for (int j = 0; j < i; j++) {
                // Compara el valor actual con el valor de cortar en j + solución restante
                tmpMax = Math.max(tmpMax, values[j] + subSolutions[i - j - 1]);
            }
            subSolutions[i] = tmpMax; // Almacena el mejor valor para longitud i
        }

        return subSolutions[rodLength]; // Devuelve el valor máximo para la longitud completa
    }

    public static void main(String[] args) {
        int[] values = new int[]{3, 7, 1, 3, 9}; // Valores por longitud de corte (1 a 5)
        int rodLength = values.length; // Longitud total de la barra
        System.out.println("El valor máximo: " + getValue(values, rodLength)); // Imprime resultado
    }
}
