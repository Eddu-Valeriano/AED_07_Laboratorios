package AED_07_Laboratorio_1.Ejercicios.Ejercicio_Final;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
    }
    
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = coo;
    }
    
    public void setEsquina2(Coordenada coo) {
        this.esquina2 = coo;
    }
    
    public Coordenada getEsquina1() {
        return esquina1;
    }
    
    public Coordenada getEsquina2() {
        return esquina2;
    }
    
    public double getXMin() {
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
    
    public static double calcularArea(Rectangulo r) {
        return (r.getXMax() - r.getXMin()) * (r.getYMax() - r.getYMin());
    }
    
    public static double calcularAreaInterseccion(Rectangulo r1, Rectangulo r2) {
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
    
    @Override
    public String toString() {
        return  esquina1.toString() + esquina2.toString();
    }
}
