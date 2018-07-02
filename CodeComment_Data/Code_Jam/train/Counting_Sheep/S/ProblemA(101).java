package methodEmbedding.Counting_Sheep.S.LYD1543;


import java.util.*;
import java.io.*;

/**
 * Problem A. Counting Sheep
 *
 * @author Renan Gomes Barreto
 */
public class ProblemA {

    public static void main(String[] args) throws FileNotFoundException {
        
        InputStream input = new FileInputStream("A-small-attempt0.in"); //System.in
        
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(input)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {

            long n = in.nextLong();
            //System.err.println("N="+n);
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            } else {

                int count = 1;
                boolean found0 = false, found1 = false, found2 = false, found3 = false, found4 = false,
                            found5 = false, found6 = false, found7 = false, found8 = false, found9 = false;
                while(true){
                    

                    long lastN = n * count;
                    String str = Long.toString(lastN);
                    //System.err.println("lastN="+lastN);
                    for (int z = 0; z < str.length(); z++) {

                        String digit = str.substring(z, z+1);
                        //System.err.println("digit="+digit);
                        switch(digit){
                            case "0" : found0=true;break;
                            case "1" : found1=true;break;
                            case "2" : found2=true;break;
                            case "3" : found3=true;break;
                            case "4" : found4=true;break;
                            case "5" : found5=true;break;
                            case "6" : found6=true;break;
                            case "7" : found7=true;break;
                            case "8" : found8=true;break;
                            case "9" : found9=true;break;
                        }

                    }

                    if (found0 && found1 && found2 && found3 && found4 && found5 && found6 && found7 && found8 && found9){
                        System.out.println("Case #" + i + ": "+ lastN);
                        break;
                    }
                    count ++;
                }
            }
        }
    }
}
