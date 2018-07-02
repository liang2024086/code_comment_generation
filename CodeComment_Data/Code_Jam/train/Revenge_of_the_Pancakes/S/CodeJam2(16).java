package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1188;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Quynh on 4/9/2016.
 */
public class CodeJam2 {
    public static void main(String[] args) throws FileNotFoundException {
        Integer nTest;
        String s;

        Scanner scanner = new Scanner(new File("C:\\Users\\Quynh\\Desktop\\GoogleCodeJam\\B_input.txt"));
        nTest = scanner.nextInt();
        scanner.nextLine();
        for (int testIterator = 1; testIterator <= nTest; testIterator++) {
            s = scanner.nextLine();
            char[] sCharacter = s.toCharArray();

            char[] distinctCharacter = new char[100];
            int count = 1;
            distinctCharacter[count] = sCharacter[0];
            for (int i = 1; i < sCharacter.length; i++) {
                if (sCharacter[i] != sCharacter[i - 1]) {
                    distinctCharacter[++count] = sCharacter[i];
                }
            }
            System.out.print("Case #" + testIterator + ": ");
            if (distinctCharacter[count] == '+') {
                System.out.print(count - 1);
            }
            else{
                System.out.print(count);
            }
            if (testIterator < nTest){
                System.out.println();
            }
        }

    }
}
