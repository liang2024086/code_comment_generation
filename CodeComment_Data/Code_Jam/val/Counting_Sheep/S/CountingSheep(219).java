package methodEmbedding.Counting_Sheep.S.LYD924;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.*;

public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caseCount = 1;
        String fileNameToWrite = "A-small-attempt3.in.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileNameToWrite);
            BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter);
            Scanner scanner = new Scanner(new FileReader("A-small-attempt3.in"));
            int numOfTests = scanner.nextInt();
            for(int j = 1; j <= numOfTests; j++){
                int input = scanner.nextInt();
                int n = input; 
                Map<Integer, String> dictionary = new HashMap<Integer, String>();
                for (int i = 1; i <= 100; i++) {   
                    boolean isComplete = true;
                    n = i * input;
                    String convertedToString = Integer.toString(n);
                    int digitLength = convertedToString.length();        
                    for (int k = 0; k < digitLength; k++){
                        char tempDigitAsChar = convertedToString.charAt(k);
                        int tempDigitAsInt = Character.getNumericValue(tempDigitAsChar);
                        String tempDigitAsString = Character.toString(tempDigitAsChar);
                        dictionary.put(tempDigitAsInt,tempDigitAsString);
                    }
                    for (int m = 0; m <= 9; m++) {
                        String result = dictionary.get(m);
                        if (result == null) {
                            isComplete = false;
                        }
                    }           
                    if(isComplete) {
                        break;
                    }
                }
                if(n == 0) {
//                    System.out.println("Case #" + caseCount + ": INSOMNIA");
                    bufferedWriter.write("Case #" + caseCount + ": INSOMNIA");
                    bufferedWriter.newLine();  
                } else {
//                    System.out.println("Case #" + caseCount + ": " + n);
                    bufferedWriter.write("Case #" + caseCount + ": " + n);
                    bufferedWriter.newLine(); 
                }
                caseCount++;
            }
            bufferedWriter.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
