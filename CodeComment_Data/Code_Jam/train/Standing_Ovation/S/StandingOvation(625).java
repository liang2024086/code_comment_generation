package methodEmbedding.Standing_Ovation.S.LYD20;

/*first number of line == index of the last element
sum = 0;
for int i = 0; i < first number in line; i++
    sum += Integer.ParseInt(string(i))
return (last index - sum);

*/
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(args[0]));
        PrintStream out = new PrintStream(new File("output.txt"));
        String input = scan.nextLine();
        int sum = 0;
        int lastIndex;
        int caseNum = 0;
        int friends = 0;
        while (scan.hasNext()) {
            caseNum += 1;
            input = scan.nextLine();
            String[] worthlessArray = input.split(" ");
            lastIndex = Integer.parseInt(worthlessArray[0]);
            String people = worthlessArray[1];
            for (int i = 0; i <= lastIndex; i++) {
                if (sum+friends < i) {
                    friends = i-sum;
                }
                sum += Integer.parseInt(Character.toString(people.charAt(i)));
            }
            int totalFriends = friends;
            out.println("Case #" + caseNum + ": " + totalFriends);
            sum = 0;
            friends = 0;
        }
    }
}
