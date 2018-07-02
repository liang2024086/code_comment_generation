package methodEmbedding.Magic_Trick.S.LYD2088;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            Set<String> list = new HashSet<String>();
            int row1 = sc.nextInt();
            sc.nextLine();
            for (int j = 1; j < row1; j++) {
                sc.nextLine();
            }
            String [] line = sc.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                list.add(line[j]);
            }
            for (int j = row1; j < 4; j++) {
                sc.nextLine();
            }
            
            //done first set of cards
            
            int row2 = sc.nextInt();
            int count = 0;
            String res = "";
            sc.nextLine();
            for (int j = 1; j < row2; j++) {
                sc.nextLine();
            }
            String [] line2 = sc.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                if (list.contains(line2[j])) {
                    ++count;
                    res = line2[j];
                }
            }
            for (int j = row2; j < 4; j++) {
                sc.nextLine();
            }
            
            
            //DONE ALL PROCESSING
            System.out.print("Case #" + (i + 1) + ": ");
            if (count == 1) {
                System.out.println(res);
            } else if (count == 0) {
                System.out.println("Volunteer cheated!");
            } else {
                System.out.println("Bad magician!");
            }
        }
    }
}
