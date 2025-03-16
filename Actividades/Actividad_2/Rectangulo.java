package AED_07_Laboratorio_1.Actividades.Actividad_2;



public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
        
    
    public static double CalculoArea(Rectangulo r1, Rectangulo r2){
        double xMinInter = Math.max(r1.getXMin(), r2.getXMin());  
        double xMaxInter = Math.min(r1.getXMax(), r2.getXMax());  
        double yMinInter = Math.max(r1.getYMin(), r2.getYMin());  
        double yMaxInter = Math.min(r1.getYMax(), r2.getYMax());  
    
        if (xMinInter < xMaxInter && yMinInter < yMaxInter) {
            return (xMaxInter - xMinInter) * (yMaxInter - yMinInter);
        } else {
            
            return 0; 
        }
    }
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
    public String toString() {
        return "Esquina 1:"+esquina1.toString()+"Esquina 2:"+esquina2.toString();
    }
    public double getXMin(){ return Math.min(esquina1.getX(), esquina2.getX());}
    public double getXMax() {return Math.max(esquina1.getX(),esquina2.getX());}
    public double getYMin(){return Math.min(esquina1.getY(),esquina2.getY()); }
    public double getYMax(){ return Math.max(esquina1.getY(), esquina2.getY()); }
}
