package AED_07_Laboratorio_1.Actividades.Actividad_2;

import java.util.Scanner;
public class Principa {
    
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);

        System.out.println("Ingrese la primera esquina del primer rectangulo");
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();

        System.out.println("Ingrese la segunda esquina del primer rectangulo");
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();

        Coordenada c1=new Coordenada(x1,y1);
        Coordenada c2=new Coordenada(x2,y2);
        Rectangulo r1=new Rectangulo(c1, c2);

        System.out.println("Ingrese la primera esquina del segundo rectangulo");
        double x3=scan.nextDouble();
        double y3=scan.nextDouble();

        System.out.println("Ingrese la segunda esquina del segundo rectangulo");
        double x4=scan.nextDouble();
        double y4=scan.nextDouble();

        Coordenada c3=new Coordenada(x3,y3);
        Coordenada c4=new Coordenada(x4,y4);
        Rectangulo r2=new Rectangulo(c3, c4);


        if(Verificador.esSobrePos(r1, r2)){
            System.out.println("Los dos rectangulo esta sobrepuestos");
            System.out.println("El area del area sobrepuesta es: "+Rectangulo.CalculoArea(r1, r2));
        }else if(Verificador.esJunto(r1,r2)){
            System.out.println("Los dos rectangulos se encuentran juntos");
        }else{
            System.out.println("Los dos rectangulos se encuentran separados");
        }
        

        
        
        scan.close();
    }
}
