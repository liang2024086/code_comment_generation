package methodEmbedding.Counting_Sheep.S.LYD1136;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {
    static final List<Character> numbers = new ArrayList<>();
    static final String INSOMNIA = "INSOMNIA";
    public static void main(String a[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("CountingSheep.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedWriter bufferedWriter  = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        int n = Integer.parseInt(scanner.nextLine());
        int x=1;
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        while (n-->0) {
            int val= Integer.parseInt(scanner.nextLine());
            if(val==0)
                bufferedWriter.write("Case #" + x++ + ": " +INSOMNIA +"\n");
            else {
                List<Character> temp = new ArrayList<>(numbers);
                int value =0;
                String str =""+val;
                int i=2;
                while (true){
                    for(char c:str.toCharArray())
                        temp.remove(new Character(c));
                    if(temp.size()==0) {
                        break;
                    }
                    value = val*i;
                    i++;
                    str=""+value;
                }
                bufferedWriter.write("Case #" + x++ + ": " + value + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        }
}
