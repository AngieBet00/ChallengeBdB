package codechallenge3;

import java.util.Arrays;


/**
 * @author Angis
 */
public class CodeChallenge3 {
    
    public static void main(String[] args) {
        int [] monedas1 = {1, 2, 100, 50}; 
        int [] monedas2 = {4, 4, 83, 10, 9}; 
        
        System.out.println(minimoDecambio(monedas1));
        System.out.println(minimoDecambio(monedas2));
    }
    
    public static int minimoDecambio(int[] monedas){
        Arrays.sort(monedas);
        int cambioMinimo = 1;
        
        for(int moneda : monedas){
            if(moneda <= cambioMinimo){
            cambioMinimo += moneda;
        }else{
                return cambioMinimo;
        }
        }
        return cambioMinimo;
    }
}

    

