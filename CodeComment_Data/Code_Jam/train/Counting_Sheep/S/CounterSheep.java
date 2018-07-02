package methodEmbedding.Counting_Sheep.S.LYD584;

import java.util.*;
import java.io.*;
public class CounterSheep {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //BufferedReader br = new BufferedReader(new FileReader("C://Users//SIMAC//Documents//CodeJam//A-small.in"));
        //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
        String number;
        String[] temp;
        boolean anyFalse = true;
        for (int i = 1; i <= x; ++i) {
            number = br.readLine();
            if (number != null && !number.equals("0")) {
                boolean[] mainArray = {false, false, false, false, false, false, false, false, false,false};
                int product = 1;
                int a = Integer.parseInt(number);
                while (anyFalse) {
                    number = a * product+"";
                    temp = number.split("");
                    anyFalse = false;
                    for (int j = 0; j < temp.length; j++) {
                        if(Integer.parseInt(temp[j])>=0)
                            mainArray[Integer.parseInt(temp[j])] = true;
                    }
                    int count = 0;
                    for (int j = 0; j <= 9; j++) {
                        if (mainArray[j]) {
                            count++;
                        }
                    }
                    if (count==10)
                    {
                        a = Integer.parseInt(number);
                        System.out.println("Case #" + i + ": " + a);
                        anyFalse = true;
                        break;
                    }
                    else{
                        anyFalse = true;
                    }
                    product++;
                }
                //System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
            } else {
                System.out.println("Case #" + i + ": INSOMNIA");
            }
        }
    }
}
