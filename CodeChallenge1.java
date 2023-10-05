package codechallenge1;

import java.util.ArrayList;

/**
 * @author Angie
 */
public class CodeChallenge1 {
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(29);
        nums.add(85);
        nums.add(96);
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(60);
        nums.add(53);

        int n = nums.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(n - i - 1));
            nums.set(n - i - 1, temp);
        }

        for (int i = 0; i < nums.size(); i++) {
            int numero = nums.get(i);
            int nuevoNumero = 0;
            int multiplicador = 1;

            while (numero > 0) {
                int digito = numero % 10;
                if (digito < 5) {
                    nuevoNumero += digito * multiplicador;
                    multiplicador *= 10;
                }
                numero /= 10;
            }

            nums.set(i, nuevoNumero);
        }

        for (int numero : nums) {
            System.out.println(numero);
        }
    }
}
