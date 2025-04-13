package AED_07_Laboratorio_1.Actividades.Actividad_2;




public class Verificador {
    
    static boolean iguales(Coordenada c1,Coordenada c2){
        if(c1.getX()==c2.getX() && c1.getY()==c2.getY()){
            return true;
        }
        return false;
    }
    
    static boolean esSobrePos(Rectangulo r1,Rectangulo r2){
        Rectangulo rA;
        Rectangulo rB;
        int puntosSobrePuestos=0;
        for(int i=0;i<2;i++){ 
            if(i==0)
            { 
                rA=r1;rB=r2;
            }else{
                rA=r2;rB=r1;
            }
            Double [] limiteEjeX={rA.getXMin(),rA.getXMax()};// 3 ,5
            
            
            Double [] limiteEjeY={rA.getYMin(),rA.getYMax()};// 3, 6
            
            

            Coordenada []esquinas={rB.getEsquina1(),rB.getEsquina2(),
                new Coordenada(rB.getEsquina1().getX() ,rB.getEsquina2().getY()),
                new Coordenada(rB.getEsquina2().getX(),rB.getEsquina1().getY())};
            
            if(Verificador.iguales(rA.getEsquina1(),rB.getEsquina1()) && Verificador.iguales(rA.getEsquina2(),rB.getEsquina2())){
                puntosSobrePuestos++;
            }
            if((Verificador.iguales(rA.getEsquina1(),esquinas[2]) || Verificador.iguales(rA.getEsquina1(),esquinas[3])) 
            && Verificador.iguales(rA.getEsquina2(),esquinas[2]) || Verificador.iguales(rA.getEsquina2(),esquinas[3])){
                puntosSobrePuestos++;
            }
            for(Coordenada c:esquinas){
                if ((limiteEjeX[0] < c.getX() && c.getX() < limiteEjeX[1] 
                && limiteEjeY[0] < c.getY() && c.getY() < limiteEjeY[1]))
                {
                    puntosSobrePuestos++;
                }
            }
    }
        if(puntosSobrePuestos==0){
            return false;
        }
        return true;
    }

    
    static boolean esJunto(Rectangulo r1,Rectangulo r2){
        boolean izquierdaDerecha= (r1.getXMax()==r2.getXMin() || r1.getXMin()==r2.getXMax()) &&
                                    (r1.getYMax()<=r2.getYMax() && r1.getYMin()<=r2.getYMin());

        boolean arribaAbajo= (r1.getYMax()==r2.getYMin() || r1.getYMin()==r2.getYMax()) && 
                            (r1.getXMax()<=r2.getXMax() && r1.getXMin() <=r2.getXMin());

        return (izquierdaDerecha || arribaAbajo);
        
    }
    
    static boolean esDisjunto(Rectangulo r1,Rectangulo r2){
        return true;
    }
}
