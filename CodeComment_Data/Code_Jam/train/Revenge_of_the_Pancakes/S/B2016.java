package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1049;

import java.util.Arrays;
import java.util.Scanner;


public class B2016 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            String s = input.next();
            char[] arr = s.toCharArray();
            char[] cmp = new char[arr.length];
            for(int i=0; i<arr.length; i++){
            	cmp[i] = '+';
            }
            
            int count = 0;
            boolean allReversed = false;
            for (int i=0; i<arr.length; i++){
            	if(i >0 && arr[i] != arr[i-1]){
            		count++;
            		for(int j=0; j<i; j++){
            			arr[j] = arr[i];
            		}
            	}
            	
            	if(i == arr.length-1 && arr[i] == '-'){
            		allReversed = true;
            		count++;
            	}
            	if(Arrays.equals(cmp, arr) || allReversed){
            		break;
            	}
            }
            
            
            System.out.printf("Case #%d: %s\n", n + 1, count);
        }
    

	}

}
