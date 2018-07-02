package methodEmbedding.Revenge_of_the_Pancakes.S.LYD964;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("B-small-attempt0.in"));
            PrintWriter w = new PrintWriter(new FileWriter("B-small-attempt0.out"));
            int caseC = scan.nextInt();
            for(int i=1;i<=caseC;i++){
                String stack = scan.next();
                int count = 0;
                char pre = stack.charAt(0);
                for(int j=1;j<stack.length();j++){
                    char c = stack.charAt(j);
                    if(c!=pre){
                        count++;
                    }
                    pre = c;
                }
                if(pre=='-'){
                    count ++;
                }
                w.println(String.format("Case #%d: %d", i, count));
            }
            scan.close();
            w.close();
        }catch(Exception e){

        }
    }
}
