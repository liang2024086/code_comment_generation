package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1024;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner std = new Scanner(System.in);
        int t = std.nextInt();
        for(int k=1;k<=t;k++){
            String str = std.next();
            int res  = 0;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i-1)!=str.charAt(i)){
                    res++;
                }
            }
            if(str.charAt(str.length()-1)=='-'){
                res++;
            }
            System.out.println("Case #"+k+": "+res);
        }
        
    }
}

