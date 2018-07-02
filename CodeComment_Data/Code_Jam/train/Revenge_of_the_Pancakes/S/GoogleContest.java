package methodEmbedding.Revenge_of_the_Pancakes.S.LYD367;


import java.util.Arrays;
import java.util.Scanner;

public class GoogleContest {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numCases = stdin.nextInt();

        for (int loop = 1; loop <= numCases; loop++) {
            String pansStr;
            int counter = 0;
            while((pansStr = stdin.nextLine()).equals( "" ));
            boolean[] pansBool = new boolean[pansStr.length()];
            for (int i = 0; i < pansStr.length(); i++) {
                if(pansStr.charAt(i) == '+'){
                    pansBool[i] = true;
                }else{
                    pansBool[i] = false;
                }
            }
            
            
            boolean finished = false;
            int flipIndex = 0;
            while(!finished){
                boolean curSearch = pansBool[0];
                while(flipIndex < pansBool.length && pansBool[flipIndex] == curSearch ){
                    flipIndex++;
                }
                if(flipIndex < pansBool.length){
                    for (int i = 0; i < flipIndex; i++) {
                        pansBool[i]= !pansBool[i];
                    }
                    counter++;
                }else{
                    if(!curSearch){
                        counter++;
                    }
                    finished = true;
                }
            }
            System.out.println("Case #" + loop + ": " + counter);
            
            
        }
    }

}
