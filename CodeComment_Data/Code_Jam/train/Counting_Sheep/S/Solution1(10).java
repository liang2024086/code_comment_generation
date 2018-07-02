package methodEmbedding.Counting_Sheep.S.LYD215;


import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by tejash on 4/9/16.
 */
public class Solution1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int totalCases = scanner.nextInt();

        for(int caseNum=1;caseNum<=totalCases;caseNum++){
            boolean[] hashtable = new boolean[10];
            int conditionCount=0;
            int loopCount =1;
            int inputNum = scanner.nextInt();
            String strOutput = "";
            if(inputNum == 0){
                strOutput = "INSOMNIA";
            }else {
                while (true) {
                    String strNum = String.valueOf(inputNum * loopCount);
                    //System.out.println(strNum);
                    for(char c:strNum.toCharArray()){
                        int i = Character.getNumericValue(c);

                        if(!hashtable[i]){
                            hashtable[i] = true;
                            conditionCount++;
                        }
                    }

                    if(conditionCount==10){
                        break;
                    }
                    loopCount++;

                }

                strOutput = String.valueOf(inputNum * loopCount);
            }

            System.out.println("Case #"+caseNum+": "+strOutput);
        }
    }



}
