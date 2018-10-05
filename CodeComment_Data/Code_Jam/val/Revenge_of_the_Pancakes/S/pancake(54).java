package methodEmbedding.Revenge_of_the_Pancakes.S.LYD65;

import java.util.*;
import java.io.*;

public class pancake {
    
    public static void main(String[] args) {
        String filePath = new File("").getAbsolutePath();
        String readFilePath = filePath.concat("/pancake.in");
        String writeFilePath= filePath.concat("/pancake.out");

        File inFile = new File(readFilePath);
        
        FileWriter write = null;
        try {write = new FileWriter(writeFilePath);} catch (IOException ex) {}
        PrintWriter print_line = new PrintWriter(write);
        
        Scanner inLine = null;
        try {inLine = new Scanner(inFile);} catch (FileNotFoundException ex) {}
        
        int testCases = inLine.nextInt();
        
        //if using nextLine;
        inLine.nextLine();
        
        for(int tc = 0; tc < testCases; tc++){
            String line = inLine.nextLine();
            System.out.println(line);
            int ans = 0;
            
            //algorithm
            String[] stack = line.split("");
            //System.out.println(Arrays.toString(stack));
            
            for(int i = 1; i < stack.length-1; i++){
                if(!stack[i].equals(stack[i+1])){
                    ans++;
                }
            }
            
            if(stack[stack.length-1].equals("-"))
                ans++;
            
            //answer is string
            //print_line.printf("Case #%d: %s",i+1,"ans");
            
            //answer is int
            print_line.printf("Case #%d: %d",tc+1,ans);
            if(tc < testCases-1)
                print_line.println();
        }
        
        print_line.close();
    }
    
}
