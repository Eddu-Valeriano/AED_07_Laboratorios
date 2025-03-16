package AED_07_Laboratorio_1.Ejercicios.Ejercicio_Final;

public class Coordenada{
    //Atributos de la clase coordenada
    private double x;
    private double y;
    //Constructor de la clase coordenada con parametros
    public Coordenada(double x, double y){
        this.x=x;
        this.y=y;
    }
    //Constructor por defecto
    public Coordenada(){}
    //Constructor que copia los valores de otra coordenada
    public Coordenada(Coordenada c){
        this.x=c.getX();
        this.y=c.getY();
    }
    
    void setX(double x){
        this.x=x;
    }
    void setY(double y){
        this.y=y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    //Metodo encargadao de hallar la distancia euclediana al origen
    double distanciaOrigen() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    //Metodo que calcula la distancia entre las dos coordenadas del rectangulo
    static double distancia(Rectangulo r){
        Coordenada c1= r.getEsquina1();
        Coordenada c2= r.getEsquina2();
        return Math.sqrt(Math.pow((c2.getX()-c1.getX()),2)+Math.pow((c2.getY()-c1.getY()),2));
    }
    //Metodo que devuelve una cadena que representa al objeto
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
}