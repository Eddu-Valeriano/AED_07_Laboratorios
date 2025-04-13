package AED_07_Laboratorio_1.Ejercicios.Ejercicio_Final;


import java.util.Scanner;
public class Principa {
    
    public static void main(String[]args){
        
        Scanner scan= new Scanner(System.in);
        int n=1;//Cantidad de rectangulos a ingresar
        ContainerRect contenedor=new ContainerRect(n);//Creacion de la clase donde se va almacenar los objetos de la clas Rectangulo
        for(int i=0;i<n;i++){
            //Entrada por teclado de las coordenadas del rectangulo
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
        System.out.println(contenedor);//Muestra del contenido de la clase Container antes de finalizar el main
        

        
        scan.close();
    }
}
