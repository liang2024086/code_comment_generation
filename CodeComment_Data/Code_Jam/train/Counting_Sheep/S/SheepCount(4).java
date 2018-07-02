package methodEmbedding.Counting_Sheep.S.LYD1170;

// Google Code Jam Qualification Round 2016
// Problem <problem name here>

import java.util.*;
import java.io.*;

public class SheepCount{
    static String filename = "A-small-attempt1";	// io filename here, change accordingly
    //static String filename = "A-large";
    //static String filename = "tc";
    static String inname = filename + ".in";    
    static String outname = filename + ".out";  
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new BufferedReader(new FileReader(inname)));
            //Scanner in = new Scanner(System.in);
            BufferedWriter out = new BufferedWriter(new FileWriter(outname));
            int t = in.nextInt();
            in.nextLine();
            
            for (int cas = 1; cas <= t; cas++){
                boolean[] b = new boolean[10];
                int ans = in.nextInt();

                if (ans == 0){
                    out.write("Case #" + cas + ": " + "INSOMNIA" + "\n");
                } else {
                    boolean found = false;
                    int temp;
                    int inc = ans;
                    while (!found){
                        temp = ans;
                        
                        //System.out.println("temppp" + temp);
                        while (temp > 0){
                            b[temp % 10] = true;
                            temp /= 10;
                        }
                        
                        //System.out.println(temp);
                        int all = 0;
                        for (int i=0;i<10;i++){
                            //System.out.println(b[i] + " ");
                            if (b[i]==true)
                                all++;
                        }
                        //System.out.println();
                        if (all==10)
                            found = true;
                        
                        ans += inc;
                    }
                    //System.out.print("Case #" + cas + ": " + (ans-inc) + "\n");
                    out.write("Case #" + cas + ": " + (ans-inc) + "\n");
                }
                
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
