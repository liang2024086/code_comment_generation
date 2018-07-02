package methodEmbedding.Counting_Sheep.S.LYD186;

/*
 * #Author: Sahir Noor Ali
 * #ID: K132047 
 * #Code: Counting Sheep
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CountingSheep_CodeJam {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        File file = new File("A-small-attempt0.in");
        Scanner sc = new Scanner(file);
        
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        
        int test = sc.nextInt();
        
        for(int tc=0;tc<test;tc++){
            
            int arr[] = new int[10];
            for(int i=0;i<10;i++)arr[i] = -99;
            
            long N = sc.nextLong();
            int count = 0;
            int j = 1;
            
            for(j=1;j<=1000000;j++){

                long temp = j*N;
                String str = String.valueOf(temp);

                for(int i=0;i<str.length();i++){
                    arr[Character.getNumericValue(str.charAt(i))] 
                     =  Character.getNumericValue(str.charAt(i));

                }//close for

                count = 0;
                for(int i=0;i<10;i++){
                    if(arr[i] == i)
                        count++;
                }//close for

                if(count == 10)
                    break;

            }//close for

          if(count == 10)  
            writer.println("Case #"+(tc+1)+": "+(j*N));
          else
            writer.println("Case #"+(tc+1)+": "+"INSOMNIA");
        }//close for
        
        writer.close();
    }//close main
    
}//close class
