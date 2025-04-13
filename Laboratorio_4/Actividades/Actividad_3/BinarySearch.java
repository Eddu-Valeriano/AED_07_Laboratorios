package Actividades.Actividad_3;

public class BinarySearch {

    // Búsqueda binaria recursiva
    int binarySearch(int arr[], int lo, int hi, int x) {
        if (hi >= lo && lo < arr.length - 1) {
            int mid = lo + (hi - lo) / 2; // Calcula el punto medio

            if (arr[mid] == x) return mid; // Si se encuentra el elemento

            if (arr[mid] > x) // Buscar en la mitad izquierda
                return binarySearch(arr, lo, mid - 1, x);

            return binarySearch(arr, mid + 1, hi, x); // Buscar en la mitad derecha
        }
        return -1; // Elemento no encontrado
    }

    // Clase interna para búsqueda binaria iterativa
    static class BinarySearchIterativo {
        int binarySearch(int arr[], int x) {
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (arr[mid] == x) return mid;
                if (arr[mid] < x) lo = mid + 1;
                else hi = mid - 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5, 6, 12, 43, 122, 320, 502};
        int x = 12;

        int position = ob.binarySearch(arr, 0, arr.length - 1, x);
        if (position == -1)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element found at index: " + position);

        BinarySearchIterativo ob2 = new BinarySearchIterativo();
        int arr2[] = {1, 2, 3, 4, 5};
        int x2 = 3;

        int position2 = ob2.binarySearch(arr2, x2);
        if (position2 == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + position2);
    }
}
