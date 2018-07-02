package methodEmbedding.Counting_Sheep.S.LYD254;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class a {
    public static void main(String[] args) throws FileNotFoundException {
        File fIn = new File("C:\\Users\\Luck\\Documents\\NetBeansProjects\\CodeJam16\\src\\ains.txt");
        File fOut = new File("C:\\Users\\Luck\\Documents\\NetBeansProjects\\CodeJam16\\src\\aouts.txt");
        Scanner sc = new Scanner(fIn);
        PrintWriter out = new PrintWriter(fOut); 
        
        int t = sc.nextInt();
        int n;
        boolean aux[];
        for (int i = 0; i < t; i++) {
            out.print("Case #"+(i+1)+": ");
            aux = new boolean[10];
            n=sc.nextInt();
            int m=n;
            
            if(n!=0){
                MAIN: while(true){
                    String s= n+"";
                    for (int j = 0; j < s.length(); j++) {
                        aux[Integer.parseInt(s.charAt(j)+"")]=true;
                    }
                    for (int j = 0; j < 10; j++) {
                        if(aux[j]==false){
                            n+=m;                           
                            continue MAIN;
                        }
                    }
                    break;
                }
                out.println(n);
            } else{ 
                out.println("INSOMNIA");
            }
        }
        out.close();
        
    }
}
