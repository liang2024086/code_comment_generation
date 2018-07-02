package methodEmbedding.Counting_Sheep.S.LYD510;

import java.util.*;
import java.io.*;

public class countsheep {
    
    public static void main(String[] args) {
        String filePath = new File("").getAbsolutePath();
        String readFilePath = filePath.concat("/text.in");
        String writeFilePath= filePath.concat("/text.out");

        File inFile = new File(readFilePath);
        
        FileWriter write = null;
        try {write = new FileWriter(writeFilePath);} catch (IOException ex) {}
        PrintWriter print_line = new PrintWriter(write);
        
        Scanner inLine = null;
        try {inLine = new Scanner(inFile);} catch (FileNotFoundException ex) {}
        
        int testCases = inLine.nextInt();
        
        //if using nextLine;
        inLine.nextLine();
        
        for(int t = 0; t < testCases; t++){
             int[] digits = new int[10];
            int numSeen = 0;
            String line = inLine.nextLine();
            //System.out.println(line);
            int ans = 0;
            
            int num = Integer.parseInt(line);
            
            //algorithm
            //int[] numDigits = new int[7];
            
            // for(int i = 6; i >= 0; i--){
                
            //     numDigits[i] = num/((int)(Math.pow(10,i)));
            //     num-=numDigits[i]*((int)(Math.pow(10,i)));
                
            // }
            
            //int i = 1;
            int testNum = num;
            if(num != 0){
                while(numSeen<10){
                    int temp = testNum;
                    boolean seenNoneZero = false;
                    for(int i = 6; i >= 0; i--){
                        
                        int digit = temp/((int)(Math.pow(10,i)));
                        //System.out.println(digit+","+testNum);
                        temp-=digit*((int)(Math.pow(10,i)));
                        if(digit!=0 || seenNoneZero){
                            if(digits[digit] == 0){
                                digits[digit] = 1;
                                numSeen++;
                            }
                            seenNoneZero = true;
                        }
                        
                    }
                    testNum+=num;
                }
                
                
                //System.out.println(Arrays.toString(numDigits));
                
                
                //answer is string
                //print_line.printf("Case #%d: %s",i+1,"ans");
                
                //answer is int
                print_line.printf("Case #%d: %d",t+1,testNum-num);
            }
            else{
                print_line.printf("Case #%d: INSOMNIA",t+1);
            }
            
            if(t < testCases-1)
                    print_line.println();
        }
        
        print_line.close();
    }
    
}
