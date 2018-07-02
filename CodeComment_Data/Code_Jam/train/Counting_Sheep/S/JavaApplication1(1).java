package methodEmbedding.Counting_Sheep.S.LYD1039;


import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class JavaApplication1{

     public static void main(String []args) throws Exception{
        Scanner in = new Scanner(new File("C:\\Users\\Nurlan\\Downloads\\A-small-attempt0.in"));
        File file = new File("C:\\Users\\Nurlan\\Downloads\\A-small-attemp0.out");
        PrintWriter out = new PrintWriter(file);
        int T = in.nextInt();
        for (int t = 0; t < T; t++){
            int N = in.nextInt();
            if(N == 0){
                out.println("Case #" + (t+1) + ": " + "INSOMNIA");            
                continue;
            }
            ArrayList<Integer> remainingDigits = new ArrayList<Integer>();
            remainingDigits.add(0);remainingDigits.add(1);remainingDigits.add(2);remainingDigits.add(3);remainingDigits.add(4);remainingDigits.add(5);remainingDigits.add(6);remainingDigits.add(7);remainingDigits.add(8);remainingDigits.add(9);
            
            int j = 1;
            int n = N;
            while(true){
                String sN = N + "";
                for (int i = 0; i < sN.length(); i++){
                    int d = Character.getNumericValue(sN.charAt(i));
                    if(remainingDigits.contains((Integer)d))
                       remainingDigits.remove((Integer)d);
                }
                if(remainingDigits.size() == 0){
                    break;
                }
                N = (++j)*n;
            }
                        
            out.println("Case #" + (t+1) + ": " + N);            
        }
        out.close();
     }
}
