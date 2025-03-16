package AED_07_Laboratorio_1.Ejercicios.Ejercicio_Final;


import java.util.Scanner;
public class Principa {
    
    public static void main(String[]args){
        
        Scanner scan= new Scanner(System.in);
        int n=1;
        ContainerRect contenedor=new ContainerRect(n);
        for(int i=0;i<n;i++){
            System.out.println("Ingrese la primera esquina del rectangulo N"+i);
            double x1=scan.nextDouble();
            double y1=scan.nextDouble();
    
            System.out.println("Ingrese la segunda esquina del rectangulo N"+i);
            double x2=scan.nextDouble();
            double y2=scan.nextDouble();
    
            Coordenada c1=new Coordenada(x1,y1);
            Coordenada c2=new Coordenada(x2,y2);
            Rectangulo r1=new Rectangulo(c1, c2);
            contenedor.addRectangulo(r1);
        }
        System.out.println(contenedor);
        

        
        scan.close();
    }
}
