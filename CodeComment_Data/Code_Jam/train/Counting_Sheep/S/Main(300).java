package methodEmbedding.Counting_Sheep.S.LYD784;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        String testCases = s.nextLine();
        int testCasesInt = Integer.parseInt(testCases);
        boolean[] haveSeen = new boolean[10];

        //the loop for each testcase
        for (int i = 0; i < testCasesInt; i++){
            int n = Integer.parseInt(s.nextLine());
            int numbertoOperateOn = n;
            String output = "output";
            boolean haveSeenAll = false;

            while (!haveSeenAll){
                //check digits in the number
                String check = numbertoOperateOn + "";
                if (n == 0){
                    output = "INSOMNIA";
                    break;
                }
                for (int j = 0; j < check.length(); j++){
                    int digit = Character.getNumericValue(check.charAt(j));
                    if (haveSeen[digit] == false)
                        haveSeen[digit] = true;
                }

                //check if everything in haveSeen has been ticked
                haveSeenAll = true;
                for (int j = 0; j < haveSeen.length; j++){
                    if (haveSeen[j] == false){
                        haveSeenAll = false;
                        break;
                    }
                }

                if (haveSeenAll){
                    output = check;
                    break;
                } else
                    numbertoOperateOn += n;
            }

            //print output
            int cases = i+1;
            System.out.println("Case #" + cases + ": " + output);
            haveSeen = new boolean[10];
        }
    }

}
