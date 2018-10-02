package methodEmbedding.Revenge_of_the_Pancakes.S.LYD44;

import java.util.Scanner;

/**
 *
 * @author jquijano82@gmail.com
 */
public class Main {
    
    public static final String MINUS_S = "-";
    public static final String PLUS_S = "+";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("./src/data.in"));
        
        int testCases = in.nextInt();
        in.nextLine();
        
        for(int i=1; i <=testCases; i++){
            String line = in.nextLine();
            if(line.contains(MINUS_S)){
                int flips = 0;
                do{
                    int endIdx;
                    if(line.startsWith(PLUS_S)){
                        endIdx = line.indexOf(MINUS_S);
                    } else {
                        endIdx = line.indexOf(PLUS_S);
                        if(endIdx == -1){
                            flips++;
                            break;
                        }
                    }
                    String sub = line.substring(0, endIdx);
                    sub = sub.replaceAll(MINUS_S,".");
                    sub = sub.replaceAll("\\+",MINUS_S);
                    sub = sub.replaceAll("\\.",PLUS_S);
                    StringBuilder sb = new StringBuilder(sub);
                    line = sb.reverse().toString() + line.substring(endIdx);
                    flips++;
                }while(line.contains(MINUS_S));
                System.out.println("Case #" + i + ": " + flips);
            } else {
                System.out.println("Case #" + i + ": 0");
            }
        }
    }

}
