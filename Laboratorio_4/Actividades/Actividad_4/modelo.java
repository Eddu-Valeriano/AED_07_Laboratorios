package Actividades.Actividad_4;

public class modelo {
    public static int modal(int array[]){
        int first=0;
        int end = array.length-1;

        if(first==end){
            return array[first];
        }
        int moda = array[first];
        int maxfrec=frecuencia(array,first,end,moda);
        for(int i=first+1;i<end;i++){
            int frec=frecuencia(array,i,end,array[i]);
            if(frec>maxfrec){
                maxfrec=frec;
                moda=array[i];
            }
        }
        return moda;
    }
    private static int frecuencia(int[]array, int first,int end, int ele){
        if(first>end)return 0;
        int suma=0;
        for(int i=first;i<=end;i++){
            if(array[i]==ele){
                suma++;
            }
        }
        return suma;
    }
    public static int moda2(int []array){
        int first=1;
        int p=0;
        int end=array.length-1;
        int moda=array[0];
        int frec=1;
        int maxfrec=0;
        while(first<=end){
            if(array[p]==array[first]){
                frec++;
                first++;
            }else{
                if(frec>maxfrec){
                    maxfrec=frec;
                    moda=array[p];
                }
                p=first;
                first=p+1;
                frec=1;
            }
        }
        return moda;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,2,2,3,2,3,12,2,2,1,2,2,312,12,12,12,211,2,2,2,2,12,12,12,12,12,12,12,1212,12,12,1212,12};
        
        System.out.println("El elemento moda  es: "+moda2(array));
    }
}
