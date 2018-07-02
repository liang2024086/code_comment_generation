package methodEmbedding.Revenge_of_the_Pancakes.S.LYD296;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
5
-
-+
+-
+++
--+-

*/

public class B {
    public static void main(String[] args) throws FileNotFoundException {
        File fIn = new File("C:\\Users\\Luck\\Documents\\NetBeansProjects\\CodeJam16\\src\\bin.txt");
        File fOut = new File("C:\\Users\\Luck\\Documents\\NetBeansProjects\\CodeJam16\\src\\bouts.txt");
        Scanner sc = new Scanner(fIn);
        PrintWriter out = new PrintWriter(fOut);   
       
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            boolean plus = true;
            char aux=s.charAt(0);
            if(aux=='-'){
                plus=false;
            }
            int cont =0;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j)!=aux){ 
                    cont++;
                    plus = !plus;
                    aux=plus?'+':'-';
                }
            }
            if(aux=='-') cont++;
            out.println("Case #"+(i+1)+": "+cont);
        }
       out.close();
    }
    
}
