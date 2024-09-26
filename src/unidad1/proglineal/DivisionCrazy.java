/* ITESS-TICS
   Agosto-Diciembre 2024
   EyOD
   Prof: Montecillo
   Programador: Nam_chul Bruno Vázquez Coronado
   Descripción: Arreglos
   Fecha: 19/09/2024
*/
package unidad1.proglineal;

public class DivisionCrazy {
    private double columna1[];
    private double columna2[];
    private double division[];

    public DivisionCrazy(double[] columna1, double[] columna2) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        
        this.division = new double[columna1.length];
    }
    public int resolver(){
        for(int i = 1; i < columna1.length; i++){
            division[i] = columna2[i] / columna1[i];
        }
        return 0;
    }
    public void print(){
        for(int i = 0; i < division.length; i++){
            System.out.println("div " + i + ": " + division[i]);
        }
    }
    
}
