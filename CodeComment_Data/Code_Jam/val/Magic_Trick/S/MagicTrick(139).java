package methodEmbedding.Magic_Trick.S.LYD1095;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: anvay.srivastava
 * Date: 13/04/14
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MagicTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        count = input.nextInt();
        for (int testCaseNumber = 1; testCaseNumber <= count; testCaseNumber++) {
            int answer1 = input.nextInt();
            List<Integer> firstList = new ArrayList<Integer>();
            for (int row = 1; row <= 4; row++) {
                for (int column = 1; column <= 4; column++) {
                    if (row == answer1) {
                        firstList.add(input.nextInt());
                    } else {
                        input.nextInt();
                    }
                }
            }
            int answer2 = input.nextInt();
            List<Integer> secondList = new ArrayList<Integer>();
            for (int row = 1; row <= 4; row++) {
                for (int column = 1; column <= 4; column++) {
                    if (row == answer2) {
                        secondList.add(input.nextInt());
                    } else {
                        input.nextInt();
                    }
                }
            }
            List<Integer> commonList = new ArrayList<Integer>();
            for(Integer firstElelemt: firstList){
                if(secondList.contains(firstElelemt)){
                    commonList.add(firstElelemt);
                }
            }
            if(commonList.size()==1){
                System.out.println("Case #" + testCaseNumber + ": " + commonList.get(0));
            } else if(commonList.size()>1) {
                System.out.println("Case #" + testCaseNumber + ": Bad magician!");
            } else {
                System.out.println("Case #" + testCaseNumber + ": Volunteer cheated!");
            }
        }
    }

}
