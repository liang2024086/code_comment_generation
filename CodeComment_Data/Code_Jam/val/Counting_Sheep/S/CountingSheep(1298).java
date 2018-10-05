package methodEmbedding.Counting_Sheep.S.LYD808;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author Anastasios
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // TODO code application logic here
        String delims = "[ \t]+";
        String[] tokens;
        int counter = 0;
        int N;
        String file_name = "./files/A-small-attempt0.in";
        PrintWriter writer = new PrintWriter("./files/output.txt", "UTF-8");
        
        int temp,num;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            String line;
            line = br.readLine();
            tokens = line.split(delims);
            N = Integer.parseInt(tokens[0]);
            for (int i=0;i<N;i++){
                
                line = br.readLine();
                tokens = line.split(delims);
                num = Integer.parseInt(tokens[0]);
                
                
                System.out.print("Case #"+(i+1)+": ");
                writer.print("Case #"+(i+1)+": ");
                
                boolean flag=false;
                int finalNum;
                int count=1;
                while (numbers.size()<10){
                    finalNum = num*count;
                    if ((finalNum==num) && (count!=1)){
                        flag=true;
                        break;
                    }

                    while (finalNum > 0) {
                        temp = finalNum % 10;
                        finalNum = finalNum / 10;
                        if (!numbers.contains(temp)){
                            numbers.add(temp);
                        }
                    }
                    count++;
                }
                
                if (!flag){
                    finalNum=num*(count-1);
                    System.out.println(finalNum);
                    writer.println(finalNum);
                }
                else {
                    System.out.println("INSOMNIA");
                    writer.println("INSOMNIA");
                }
                
                numbers.clear();
            }
            writer.close();
        }
    }
    
}
