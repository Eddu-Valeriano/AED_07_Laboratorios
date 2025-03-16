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

    @Override
    public String toString() {
        String cadena = ("Nombre           Coordenadas           Distancia    Área\n");
        int num=0;
        for (int i = contenedorRe.length - 1; i >= n + 1; i--) {
            cadena+=("Rectángulo ")+(num++)+(": ")
                +(contenedorRe[i].toString())+("  ")
                +(contenedorDi[i])+("  ")
                +(contenedorAr[i])+("\n");
        }
        return cadena.toString();
    }
}
