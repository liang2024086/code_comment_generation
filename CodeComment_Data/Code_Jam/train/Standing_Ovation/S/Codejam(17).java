package methodEmbedding.Standing_Ovation.S.LYD1103;

import java.io.*;
public class Codejam {

    public static void main(String[] args) {

        int count = 0;
        int friend = 0;

        String input = "110011";
        int max = 5;
        int n = 1;
        String[] arr = new String[1000];
        try {  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
            String s = br.readLine();
            n = Integer.parseInt(s);
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine(); 
            }
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        for (int i = 1; i <= n; i++) {
            String[] twoParam = arr[i - 1].split("\\s+");
            max = Integer.parseInt(twoParam[0]);
            input = twoParam[1];
            count = Character.getNumericValue(input.charAt(0));
            int c = 1;
            friend = 0;
            while (c <= max) {
                int dig = Character.getNumericValue(input.charAt(c));
                while (dig > 0 && count < c) {
                    count++;
                    friend++;
                }
                count += dig;
                //System.out.println("c: " + c + " count: " + count + " dig: " + dig);
                c++;
                
            }
            System.out.println("Case #" + i + ": " + friend);
        }
        
    }
}
