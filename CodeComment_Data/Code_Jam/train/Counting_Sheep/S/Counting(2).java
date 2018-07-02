package methodEmbedding.Counting_Sheep.S.LYD1706;


import java.io.*;
import java.util.*;


public class Counting {
    public static void main(String [] args) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("A-small-attempt2.in"));
        PrintWriter write = new PrintWriter("output.txt");
        int t = in.nextInt();
        for(int i = 1; i <= t; ++i){
            int n = in.nextInt();
            if(n == 0){
                write.println("Case #" + i + ": INSOMNIA");
            }
            else{
                int m = 1;
                ArrayList<Integer> numbers = new ArrayList<>();
                int lastNumber = 0;
                while(!(numbers.contains(0) && numbers.contains(1) && numbers.contains(2) && numbers.contains(3)
                        && numbers.contains(4) && numbers.contains(5) && numbers.contains(6) &&
                        numbers.contains(7) && numbers.contains(8) && numbers.contains(9))){
                    int a = n * m;
                    if(a < 10){
                        if(!(numbers.contains(a))){
                            numbers.add(a);
                        }
                    }
                    else{
                        lastNumber = a;
                        while(a > 0){
                            int digit = a % 10;
                            a = Math.round(a/10);
                            if(!(numbers.contains(digit))){
                                numbers.add(digit);
                            }
                        }
                    }
                    m++;             
                }
                write.println("Case #" + i + ": " + lastNumber);
            }
        }
        write.close();
        
    }
}
