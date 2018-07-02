package methodEmbedding.Counting_Sheep.S.LYD995;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File("input.txt");
        FileWriter writer = new FileWriter("output.txt");
        Scanner input = new Scanner(file);
        int testCase = input.nextInt();
        int testNum = 0;
        boolean[] arr ;
        while(testCase-- > 0) {
            Long number = input.nextLong();
            Long numberNumber = number;
            if(number == 0) {
                writer.write("Case #"+ ++testNum +": " + "INSOMNIA\n");
                continue;
            }
            arr = new boolean[10];
            while(true) {
                String toString = number.toString();
                for (int i = 0; i < toString.length(); i++) {
                    arr[toString.charAt(i) - '0'] = true;
                }
                boolean flag = true;
                for(int i = 0 ; i < 10 ; i++) {
                    if(!arr[i]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    writer.write("Case #"+ ++testNum +": " + toString + "\n");
                    break;
                }
                number += numberNumber;

            }
        }
        writer.close();

    }
}
