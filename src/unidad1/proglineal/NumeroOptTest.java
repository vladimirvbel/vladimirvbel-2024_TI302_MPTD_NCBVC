
package unidad1.proglineal;

public class NumeroOptTest {
    public static void main (String ...args){
        int[] arr = {1, -3, -6, 9, 0, 1, -2};
        int[] arr2 = {1, 2, 3};
        
        NumeroOpt nop = new NumeroOpt (arr);
        System.out.println(arr.toString());
        System.out.println("nop:" + nop.calcular());
        
        System.out.println(arr.toString());
        nop.setArreglo(arr2);
        System.out.println("nop:" + nop.calcular());
    }
}
