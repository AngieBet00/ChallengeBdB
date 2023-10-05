package codechallenge2;

import java.util.Arrays;

/**
 * @author Angis
 */
public class CodeChallenge2 {
    
    public static void main(String[] args) {
        int[] nums = {-5, -3, -2, 0, 1, 4, 5, 8, 23, 55};
        int[] result = cuadradosAscendente (nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] cuadradosAscendente(int[] nums){
        int[] numsCuadrados = new int [nums.length];
        for (int i = 0; i< nums.length; i++){
            numsCuadrados[i] = nums[i]* nums[i];
        }
        Arrays.sort(numsCuadrados);
        
        int[] result = new int [numsCuadrados.length];
        int contador =0;
        for (int i = 0; i < numsCuadrados.length; i++){
            if(numsCuadrados [i]>=0 && numsCuadrados[i] <=55){
                result [contador] = numsCuadrados[i];
                contador++;
            }
        }
        return Arrays.copyOf(result, contador);
    }
}
