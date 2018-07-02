package methodEmbedding.Counting_Sheep.S.LYD745;

//Counting Sheep // codeJam
//small_output.txt
//large_output.txt
import java.util.*;
import java.io.*;
public class Counting_Sheep { 
    public static int[] numbers = new int[10];
    public static void main(String[] args)throws IOException, Exception {
        //Scanner keyboard = new Scanner(System.in);
        //PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner keyboard = new Scanner(new FileInputStream(args[0]));
        PrintWriter pw = new PrintWriter(new File("small_output.txt"));

        int test = keyboard.nextInt();

        for(int t = 0; t < test; t++){
            int input = keyboard.nextInt();
            boolean check = false;
            for(int i = 0, len = numbers.length; i < len; i++) numbers[i] = 0;

            if(input == 0) {
                pw.println("Case #" + (t+1) + ": INSOMNIA");
                continue;
            }

            int count = 0;
            int temp = 1;
            do{
                temp = input * (++count);
                
                char[] ch = (""+temp).toCharArray();

                for(int i = 0, len = ch.length; i < len; i++) numbers[((int)ch[i]) - 48]++;


                check = true;
                for(int i = 0, len = numbers.length; i < len; i++){
                    if(numbers[i] == 0){
                        check = false;
                        break;
                    }
                }
            }while(!check);

            pw.println("Case #" + (t+1) + ": " + temp);
        }

    pw.close();
  }
}
