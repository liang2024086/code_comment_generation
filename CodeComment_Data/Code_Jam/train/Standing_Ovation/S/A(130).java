package methodEmbedding.Standing_Ovation.S.LYD2205;

import java.util.Scanner;

public class A{
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        char[] line; 
        int sizeOfArray; 
        int standing; 
        int numNeeded; 

        for (int i = 0; i < n; i++){
            sizeOfArray = in.nextInt();
            standing = 0;
            numNeeded = 0; 
            line = in.nextLine().replaceAll(" ", "").toCharArray();

            for (int j = 0; j <= sizeOfArray; j++){
                if (standing >= j)
                    standing += line[j] - '0';
                else{
                    numNeeded += j - standing; standing += (j - standing ) + line[j] - '0';   
                }
            }

            System.out.println("Case #" + Integer.toString(i+1) + ": " + Integer.toString(numNeeded));
        }
    }    
}
