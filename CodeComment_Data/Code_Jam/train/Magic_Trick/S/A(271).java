package methodEmbedding.Magic_Trick.S.LYD1534;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A{
    public static void main(String[] args) throws FileNotFoundException, IOException {
		//File paths:
		String inputfile = "inputfile.in";
		String outputfile = "outputfile.out";
		
		//Set up input and output:
        Scanner scanner = new Scanner(new File(inputfile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile));
		
		//Case loop:
        int caseNum = scanner.nextInt();
        for(int x = 1; x <= caseNum; x++) {
        	
            int row1 = scanner.nextInt();
            int[] array1 = new int[4];
            for(int i = 1; i <= 4; i++){ 
            	if(i != row1) for(int j = 0; j < 4; j++) scanner.nextInt();
            	else for(int j = 0; j < 4; j++) array1[j] = scanner.nextInt();
            }
            
            int row2 = scanner.nextInt();
            int[] array2 = new int[4];
            for(int i = 1; i <= 4; i++){ 
            	if(i != row2) for(int j = 0; j < 4; j++) scanner.nextInt();
            	else for(int j = 0; j < 4; j++) array2[j] = scanner.nextInt();
            }
//            System.out.println("array 1: " + Arrays.toString(array1));
//            System.out.println("array 2: " + Arrays.toString(array2));
            String answer = null;
            for(int i = 0; i < 4; i++){
            	for(int j = 0; j < 4; j++){
            		if(array1[i] == array2[j]){
            			if(answer == null) answer = "" + array1[i];
            			else answer = "Bad magician!";
            		}
            	}
            }
            
        	if(answer == null) answer = "Volunteer cheated!";
            writer.write("Case #" + x + ": " + answer);
			
            writer.newLine();
        }
		
		//Cleanup:
        scanner.close();
        writer.close();
    }
}
