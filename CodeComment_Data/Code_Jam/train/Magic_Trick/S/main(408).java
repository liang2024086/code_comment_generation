package methodEmbedding.Magic_Trick.S.LYD2064;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        File file = new File("A-small-attempt1.in");
        File f2=new File("output.txt");
       PrintWriter out;
        Scanner scn;
        int testCase;
        int user, user2;
        int result=0;
        int counter = 0;
        int caseNum = 1;
        String caseNumStr,resultStr = null;
        int[][] input = new int[4][4];
        int[] firstChoice = new int[4];
        try {
            out = new PrintWriter(f2);;
            scn = new Scanner(file);
            testCase = scn.nextInt();

            for (int i = 0; i < testCase; i++) {
                user = scn.nextInt();

                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        input[j][k] = scn.nextInt();
                    
                    }
                    
                }
              
       
              for (int j = 0; j < 4; j++) {
              firstChoice[j] = input[user-1][j];
                }
       
                user2 = scn.nextInt();
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        input[j][k] = scn.nextInt();
                    }
                }
                for (int k = 0; k < 4; k++) {
                    for (int j = 0; j < 4; j++) {
                        if (firstChoice[k] == input[user2-1][j]) {
                            result = firstChoice[k];
                            counter++;
                          
                        }
                    }
                }
                           if (counter > 1) {
                                result = -1;
                            } else if (counter == 0) {
                                result = -2;
                            }
                            counter=0;
                
               caseNumStr=String.valueOf(caseNum);
               if(result==-1){
                   out.println("Case #"+caseNumStr+": "+ "Bad magician!");
               }else if(result==-2){
                   out.println("Case #"+caseNumStr+": "+ "Volunteer cheated!");
               }else{
                   resultStr=String.valueOf(result);
                   out.println("Case #"+caseNumStr+": "+ resultStr);
               }
            caseNum++;
            }


out.flush();
out.close();
scn.close();
        } catch (Exception e) {
        }


    }
}
