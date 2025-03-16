package AED_07_Laboratorio_1.Ejercicios.Ejercicio_Final;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
        
    //Constructor que usa la agregacion de una objeto de la clase Coordenada 
    public Rectangulo(Coordenada c1,Coordenada c2){
        esquina1=c1;
        esquina2=c2;
    }
    public void setEsquina1 (Coordenada coo) {
        esquina1.setX(coo.getX());
    }
    public void setEsquina2 (Coordenada coo) {
        esquina2.setX(coo.getX());
    }
    public Coordenada getEsquina1 () {
        return esquina1;
    }
    public Coordenada getEsquina2 () {
        return esquina2;
    }
    //Metodo que devuelve una cadena de String al momento de la salida por pantalla en el main
    
    //Metodos que halla x y maximo y minimo entre los dos rectangulos
    public double getXMin() { //X menor 
        return Math.min(esquina1.getX(), esquina2.getX());
    }
    
    public double getXMax() {
        return Math.max(esquina1.getX(), esquina2.getX());
    }
    
    public double getYMin() {
        return Math.min(esquina1.getY(), esquina2.getY());
    }
    
    public double getYMax() {
        return Math.max(esquina1.getY(), esquina2.getY());
    }
    //Metodo que calcula el area de un rectangulo
    public static double calcularArea(Rectangulo r) {
        return (r.getXMax() - r.getXMin()) * (r.getYMax() - r.getYMin());
    }
    //Metodo que hall el area de intersecciónm entre dos rectangulos
    public static double calcularAreaInterseccion(Rectangulo r1, Rectangulo r2) {
        double xMinInter = Math.max(r1.getXMin(), r2.getXMin());  
        double xMaxInter = Math.min(r1.getXMax(), r2.getXMax());  
        double yMinInter = Math.max(r1.getYMin(), r2.getYMin());  
        double yMaxInter = Math.min(r1.getYMax(), r2.getYMax());  
        
        
        return (xMaxInter - xMinInter) * (yMaxInter - yMinInter);
        
    }
    //Metodo que devuelve la representacion de un objeto en cadena del tipo String
    @Override
    public String toString() {
        return  esquina1.toString() + esquina2.toString();
    }
}
