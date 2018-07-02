package methodEmbedding.Counting_Sheep.S.LYD1132;

import java.util.*;
import java.io.*;

public class CountingSheep {
    public static void main(String... args) throws Exception{
        Scanner scan = new Scanner(new File("A-small-attempt0.in"));
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
        int times = scan.nextInt();
        int value, newvalue, round;
        ArrayList<String> ten;
        for(int i = 0;i<times;i++){
            ten = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
            value = scan.nextInt();
            round = 1;
            do {
                newvalue = value*round;
                for (String s : Integer.toString(newvalue).split("")) {
                    if (ten.contains(s)) {
                        ten.remove(ten.indexOf(s));
                    }
                }
                round++;
            }while(ten.size() > 0 && value != 0);
            if(value!=0)
                System.out.println("Case #"+(i+1)+": "+newvalue);
            else
                System.out.println("Case #"+(i+1)+": INSOMNIA");
        }
    }
}
