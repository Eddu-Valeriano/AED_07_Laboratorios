package AED_07_Laboratorio_1.Ejercicios.Ejercicio_2;

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
    //Metodo que agrega los objetos de la clase Rectangulo en la ultima posicion del arreglo
    public void addRectangulo(Rectangulo r) {
        if (n >= 0) {
            contenedorRe[n] = r;
            contenedorDi[n] = Coordenada.distancia(r);
            contenedorAr[n] = Rectangulo.calcularArea(r);
            n--;
            numRec++;
        } else {
            //Salida en el caso de que se exceda la capacidad del arreglo
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }


}
