package methodEmbedding.Standing_Ovation.S.LYD334;

import java.util.Scanner;

public class S{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String input = s.nextLine();
        int amount = Integer.valueOf(input);
        int[] needed = new int[amount];
        for (int i = 0; i<amount; i++){
            input  = s.nextLine();
            int stuff = Character.getNumericValue(input.charAt(0));
            String values = input.substring(2,input.length());
            int ppl = 0;
            needed[i] = 0;
            for(int k = 0; k<=stuff; k++){
                if ((ppl+needed[i])<k){
                    needed[i] += (k - (ppl+needed[i]));
                }
                ppl += Character.getNumericValue(values.charAt(0));
                values = values.substring(1, values.length());
            }
        }
        for (int i = 1; i<=amount; i++){
            System.out.println("Case #"+i+ ": "+ needed[i-1]);
        }
    }
}
