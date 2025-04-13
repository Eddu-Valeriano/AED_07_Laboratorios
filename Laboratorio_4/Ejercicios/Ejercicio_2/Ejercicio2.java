
public class Ejercicio2 {

    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1); // k-1 porque usamos índice 0
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high) return arr[low];

        int pivotIndex = partition(arr, low, high);
        
        if (k == pivotIndex) return arr[k];
        else if (k < pivotIndex) return quickSelect(arr, low, pivotIndex - 1, k);
        else return quickSelect(arr, pivotIndex + 1, high, k);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i]; arr[i] = arr[high]; arr[high] = temp;
        return i;
    }

    // Prueba
    public static void main(String[] args) {
        int[] arreglo = {4, 2, 7, 10, 4, 1, 6};
        int k = 5;
        System.out.println("{4, 2, 7, 10, 4, 1, 6}");
        System.out.println("El " + k + "° menor elemento es: " + quickSelect(arreglo, k));
    }
}
