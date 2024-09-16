
package unidad1.proglineal;

public class NumeroOpt {
    private int[] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int calcular(){
        int min = arreglo[0];
        int index = 0;
        
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo [i] < min){
                index = i;
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1: index;
    }

    @Override
    public String toString() {
        return "NumeroOpt{" + arreglo;
    }
    
    
}
