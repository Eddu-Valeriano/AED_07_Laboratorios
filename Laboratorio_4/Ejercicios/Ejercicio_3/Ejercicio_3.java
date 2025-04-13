package Ejercicios.Ejercicio_3;

public class Ejercicio_3 {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] T = {
            {0, 3, INF, 7, INF},
            {INF, 0, 1, INF, 8},
            {INF, INF, 0, 2, INF},
            {INF, INF, INF, 0, 3},
            {INF, INF, INF, INF, 0}
        };

        int n = T.length;
        int[][] C = new int[n][n];

        // Inicializamos C con los valores de T
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = T[i][j];
            }
        }

        // Lógica de programación dinámica
        for (int l = 2; l <= n; l++) { // l es la longitud del segmento
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                for (int k = i + 1; k < j; k++) {
                    if (C[i][k] != INF && C[k][j] != INF) {
                        C[i][j] = Math.min(C[i][j], C[i][k] + C[k][j]);
                    }
                }
            }
        }

        // Imprimir matriz de costes mínimos
        System.out.println("Matriz C de costos mínimos:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (C[i][j] == INF) System.out.print("INF\t");
                else System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        // Ejemplo: menor costo de 0 a 4
        System.out.println("\nCosto mínimo de 0 a 4: " + C[0][4]);
    }
}
