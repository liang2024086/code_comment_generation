package methodEmbedding.Standing_Ovation.S.LYD2073;

//library can be found at - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
import java.util.*;
public class Main {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String output = "";
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int y =0,count=0;
            int smax = s.nextInt();
            char k[] = s.next().toCharArray();
            for (int j = 0; j < smax; j++) {
                count += Integer.parseInt(""+k[j]);
                if(count<j+1){
                    y++;
                    count++;
                }
            }
            output += String.format("Case #%d: %d\n",i,y);
        }
        System.out.print(output);
    }
       
}
                            
