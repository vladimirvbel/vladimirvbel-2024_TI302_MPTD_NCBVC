/* ITESS-TICS
   Agosto-Diciembre 2024
   EyOD
   Prof: Montecillo
   Programador: Nam_chul Bruno Vázquez Coronado
   Descripción: Arreglos
   Fecha: 19/09/2024
*/
package unidad1.proglineal;

public class DivisionCrazyTest {
    public static void main (String ... args){
        double[] columna1 = {1, 2, 0, 1, -3};
        double[] columna2 = {1, 0, -6, 8, -4};
        
        DivisionCrazy dc = new DivisionCrazy(columna1, columna2);
        dc.resolver();
        dc.print();
        //encontrar el numero positivo más pequeño
    }
}
