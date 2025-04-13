import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Ejercicio1 {
    
    // Método que verifica si un número es potencia de dos
    public static boolean esPotenciaDeDos(int n) {
        if (n <= 0) return false; // Si el número es menor o igual a cero, no es potencia de dos
        return (n & (n - 1)) == 0; // Utiliza la operación bit a bit para verificar si es potencia de dos
    }
    
    // Método que selecciona un conjunto de números basado en condiciones específicas
    public static boolean SeleccionarConjunto(List<Integer> arreglo){
        // Elimina el primer elemento (cantidad) y el último (sumaEsperada)
        int cantidad = arreglo.remove(0); 
        int sumaEsperada = arreglo.remove(arreglo.size() - 1); 
        int sumaTotal = 0; // Variable para acumular la suma de los números seleccionados
        int num;
        
        // Recorre el arreglo restante
        for (int i = 0; i < arreglo.size(); i++) {
            num = arreglo.get(i); // Obtiene el número actual del arreglo
            
            // Si el número es potencia de dos o es múltiplo de 5 y es el último número
            if (esPotenciaDeDos(num) || (num % 5 == 0 && i == arreglo.size() - 1)) {
                sumaTotal += num; // Suma el número
            } 
            // Si el número es múltiplo de 5 y el siguiente número es par
            else if (num % 5 == 0 && arreglo.get(i + 1) % 2 == 0) {
                sumaTotal += num; // Suma el número
            }
        }
        
        // Compara la suma total con la suma esperada
        if (sumaTotal == sumaEsperada) {
            return true; // Si coinciden, devuelve true
        }
        return false; // Si no coinciden, devuelve false
    }
    
    // Método principal
    public static void main(String[] args) {
        // Crea un arreglo de enteros
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 8, 10, 12, 5, 27)); 
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 4, 8, 10, 3, 6, 27));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 2, 16, 5, 6, 10, 33));
        // Llama al método SeleccionarConjunto y muestra el resultado
        System.out.println(arr);
        System.out.println(SeleccionarConjunto(arr)); 
        System.out.println(arr1);
        System.out.println(SeleccionarConjunto(arr1)); 
        System.out.println(arr2);
        System.out.println(SeleccionarConjunto(arr2)); 
    }
}
