package Actividades.Actividad_1;
public class Hanoi { 
    public static void main(String[] args) { 
        torresHanoi(5, 1, 2, 3); 
    }

    // Método recursivo para la solución de las Torres de Hanoi
    public static void torresHanoi(int discos, int torre1, int torre2, int torre3) { 
        // Caso base
        if (discos == 1) { 
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3); 
        } else { 
            // Mueve los discos superiores a la torre auxiliar
            torresHanoi(discos - 1, torre1, torre3, torre2);
            // Mueve el disco más grande a la torre de destino
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
            // Mueve los discos de la torre auxiliar a la torre de destino
            torresHanoi(discos - 1, torre2, torre1, torre3);
        } 
    }
}
