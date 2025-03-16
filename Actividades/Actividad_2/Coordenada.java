package AED_07_Laboratorio_1.Actividades.Actividad_2;




public class Coordenada{
    private double x;
    private double y;

    public Coordenada(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Coordenada(){}
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
    double distanciaOrigen() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    static double distancia(Coordenada c1, Coordenada c2){
        return Math.sqrt(Math.pow((c2.getX()-c1.getX()),2)+Math.pow((c2.getY()-c1.getY()),2));
    }
    public String toString(){
        return "X= "+this.x+"\n"+"Y="+this.y;
    }
    
}