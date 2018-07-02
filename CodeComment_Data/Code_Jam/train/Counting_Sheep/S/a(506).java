package methodEmbedding.Counting_Sheep.S.LYD25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class a{
    
    static String input;
    static int t;
    static String n;
    static int[] store;

    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("aout1.txt"));
        input = reader.readLine();
        t=Integer.parseInt(input);
        int param;
        int multiplier;
        
        String strnmult = "INSOMNIA";
        for(int i=1; i<=t;i++){
            n=reader.readLine();// as string
            boolean seenall = false;
            store = new int[10];
            
            if(Integer.parseInt(n)==0){
                System.out.print("Case #" +i+  ": INSOMNIA" );
                writer.write("Case #" +i+ ": INSOMNIA");
                writer.newLine();
                System.out.println();
                continue;
            }
            
            
            multiplier =1;
            while(seenall== false){
                int nmult = multiplier*Integer.parseInt(n);
                strnmult = Integer.toString(nmult);
                // marks integers seen
                for(int j=0;j<strnmult.length();j++){
                    param = Character.getNumericValue(strnmult.charAt(j));
                    store[param]=1;
                    
                }
            
                //checks integers seen
                seenall=true;
                for(int j=0;j<=9;j++){
                    if(store[j]==0)
                        seenall = false;
                }
                
                multiplier++;
            }
            
            System.out.print("Case #" +i+  ": " + strnmult);
            System.out.println();
            writer.write("Case #" +i+  ": "+ strnmult);
            writer.newLine();
            }
        
        writer.close();

    }
}
