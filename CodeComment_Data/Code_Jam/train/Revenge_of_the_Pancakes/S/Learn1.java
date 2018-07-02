package methodEmbedding.Revenge_of_the_Pancakes.S.LYD306;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Learn1{
    
    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            String str = in.next();
            if(str.charAt(0)=='+'){
                
                    int noOfMinus=0;
                    char a; char b;
                    for(int j=1;j<str.length();j++){
                        a = str.charAt(j-1);
                        b = str.charAt(j);
                        if(b=='-'&&a=='+')
                            noOfMinus++;
                    }
                    int raja = 2*noOfMinus;
                    System.out.println("Case #"+i+": "+raja);
                
            }else{
                
                    int noOfMinus=0;
                    char a; char b;
                    for(int j=1;j<str.length();j++){
                        a = str.charAt(j-1);
                        b = str.charAt(j);
                        if(b=='-'&&a=='+')
                            noOfMinus++;
                    }
                    int raja = 2*noOfMinus +1 ;
                    System.out.println("Case #"+i+": "+raja);
                
            }
        }
        
    }
}
   

    

    
