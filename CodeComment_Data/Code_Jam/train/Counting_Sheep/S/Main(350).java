package methodEmbedding.Counting_Sheep.S.LYD580;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/home/jaye/projects/untitled/out/production/untitled/com/company/input.txt"));
        int total = scan.nextInt();
        for(int i=0;i<total;i++) {
            int number = scan.nextInt();
            Set<Character> set = new HashSet<Character>();
            int j = 2;
            int num = number;
            while (true) {
                for (char c : Integer.toString(num).toCharArray()) {
                    set.add(c);
                }
                if (num == 0) {
                    System.out.println("Case #"+(i+1)+": INSOMNIA");
                    break;
                }
                if (set.size() == 10) {
                    System.out.println("Case #"+(i+1)+": " + num);
                    break;
                }
                num = j * number;
                j++;
            }
        }
    }
}
