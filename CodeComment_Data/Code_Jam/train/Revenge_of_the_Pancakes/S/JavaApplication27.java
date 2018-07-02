package methodEmbedding.Revenge_of_the_Pancakes.S.LYD574;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication27 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File fi = new File("C:\\Users\\mm\\Desktop\\Misc\\in.in");
        File fo = new File("C:\\Users\\mm\\Desktop\\Misc\\out.out");
        System.setOut(new PrintStream(fo));
        Scanner sc = new Scanner(fi);
        
        
        int ncases= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < ncases; i++) {
        
            String  str = sc.nextLine();
            int c=0;
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(j)!=str.charAt(j-1)) c++;
            }
            if(str.charAt(str.length()-1)=='-')c++;
            System.out.println("Case #"+(i+1)+": "+c);
            
            
        }
    }
    
}
