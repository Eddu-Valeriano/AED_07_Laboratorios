package AED_07_Laboratorio_1.Ejercicios.Ejercicio_1;


public class ContainerRect {
    //Arreglo que almacena objetos del tipo Rectangulo y otros como que almacenan su distancia y area
    private Rectangulo[] contenedorRe;
    private double[] contenedorDi;
    private double[] contenedorAr;
    private int n;
    private int numRec;
    //Constructor de la clase que inicializa el tamaño de los contenedores
    public ContainerRect(int n) {
        this.n = n - 1;
        contenedorRe = new Rectangulo[n];
        contenedorDi = new double[n];
        contenedorAr = new double[n];
        numRec = 0;
    }


}
