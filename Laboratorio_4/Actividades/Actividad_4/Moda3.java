package Actividades.Actividad_4;

import java.util.*;

public class Moda3 {

    static class Segment {
        int[] array;
        int start;
        int end;

        Segment(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        int length() {
            return end - start + 1;
        }
    }

    public static int moda3(int[] a, int start, int end) {
        PriorityQueue<Segment> heterogeneo = new PriorityQueue<>(
            (s1, s2) -> Integer.compare(s2.length(), s1.length()) // orden descendente por longitud
        );
        PriorityQueue<Segment> homogeneo = new PriorityQueue<>(
            (s1, s2) -> Integer.compare(s2.length(), s1.length())
        );

        heterogeneo.add(new Segment(a, start, end));

        while (!heterogeneo.isEmpty() &&
            (homogeneo.isEmpty() || heterogeneo.peek().length() > homogeneo.peek().length())) {

            Segment p = heterogeneo.poll();
            int mediana = p.array[(p.start + p.end) / 2];

            int[] bounds = pivotear(p.array, p.start, p.end, mediana);
            int izq = bounds[0];
            int der = bounds[1];

            if (p.start <= izq - 1) heterogeneo.add(new Segment(p.array, p.start, izq - 1));
            if (der <= p.end)       heterogeneo.add(new Segment(p.array, der, p.end));
            if (izq <= der - 1)     homogeneo.add(new Segment(p.array, izq, der - 1));
        }

        if (homogeneo.isEmpty()) {
            return a[start];
        }

        return homogeneo.poll().array[start];
    }

    // Esta función divide el arreglo en tres regiones:
    // < mediana | == mediana | > mediana
    private static int[] pivotear(int[] array, int start, int end, int pivot) {
        int i = start;
        int j = start;
        int k = end;

        while (j <= k) {
            if (array[j] < pivot) {
                swap(array, i, j);
                i++;
                j++;
            } else if (array[j] > pivot) {
                swap(array, j, k);
                k--;
            } else {
                j++;
            }
        }

        return new int[]{i, j}; // i = comienzo de iguales, j = fin de iguales
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 2, 5, 3, 2, 4, 3, 2, 2, 1, 2, 12, 12, 12, 12, 2, 2, 2, 12, 1212, 12, 12};
        System.out.println("Moda: " + moda3(array, 0, array.length - 1));
    }
}
