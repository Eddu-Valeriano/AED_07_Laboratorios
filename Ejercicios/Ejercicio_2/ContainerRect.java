package AED_07_Laboratorio_1.Ejercicios.Ejercicio_2;

public class ContainerRect {
    private Rectangulo[] contenedorRe;
    private double[] contenedorDi;
    private double[] contenedorAr;
    private int n;
    private int numRec;

    public ContainerRect(int n) {
        this.n = n - 1;
        contenedorRe = new Rectangulo[n];
        contenedorDi = new double[n];
        contenedorAr = new double[n];
        numRec = 0;
    }
    public void addRectangulo(Rectangulo r) {
        if (n >= 0) {
            contenedorRe[n] = r;
            contenedorDi[n] = Coordenada.distancia(r);
            contenedorAr[n] = Rectangulo.calcularArea(r);
            n--;
            numRec++;
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }


}
