package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1069;


import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class JavaApplication1{

     public static void main(String []args) throws Exception{
        Scanner in = new Scanner(new File("C:\\Users\\Nurlan\\Downloads\\B-small-attempt0.in"));
        File file = new File("C:\\Users\\Nurlan\\Downloads\\B-small-attempt0.out");
        PrintWriter out = new PrintWriter(file);
        int T = in.nextInt();
        in.nextLine();
        for (int t = 0; t < T; t++){                 
            String stack = in.nextLine();
            int flips = 0;
            
            char firstChar = stack.charAt(0);
            int cursor = 0;
            
            while(cursor < stack.length()){
                while(cursor < stack.length() && stack.charAt(cursor) == firstChar){
                    cursor++;
                }

                if(cursor == stack.length() && firstChar == '+'){
                    break;
                }
                else if(cursor == stack.length() && firstChar == '-'){
                    flips++;
                    break;
                }
                else{
                    if(firstChar == '-')
                        firstChar = '+';
                    else 
                        firstChar = '-';
                    flips++;
                    cursor++;
                }
                
                if(cursor == stack.length() && firstChar == '-'){
                    flips++;
                    break;
                }
            }            
            
            out.println("Case #" + (t+1) + ": " + flips);            
        }
        out.close();
     }
}
