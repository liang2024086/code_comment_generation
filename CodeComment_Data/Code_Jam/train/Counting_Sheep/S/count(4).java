package methodEmbedding.Counting_Sheep.S.LYD431;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class count {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args){
        File file = new File("A-small-attempt2.in");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int a = 0;
        String[] N = null;
        int T = 0;
        while(scan.hasNextLine()){
            if (a == 0) {
                T = Integer.parseInt(scan.nextLine());
                N = new String[T];
                a++;
            } else {
                N[a-1] = scan.nextLine();
                a++;
            }
        }
        scan.close();
        HashSet number = new HashSet(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        Set before;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("output.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i< T; i++) {
            int n = Integer.parseInt(N[i]);
            String last = null;
            int trial = 0;
            HashSet sleep = new HashSet();
            while (!number.equals(sleep) && trial < 100) {
                trial++;
                int m = n * trial;
                int length = String.valueOf(m).length();
                int test = m;
                for (int k = 0; k < length; k++){
                    sleep.add(test % 10);
                    test = test / 10;
                }
                if (trial >= 100) {
                    last = "INSOMNIA";
                } else {
                    last = String.valueOf(m);
                }
                
            }
            int index = i+1;
            writer.println("Case #" + index + ": " + last);
        }
        writer.close();
    }
}
