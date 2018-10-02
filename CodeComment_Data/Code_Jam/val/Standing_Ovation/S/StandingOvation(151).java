package methodEmbedding.Standing_Ovation.S.LYD1848;

import java.util.Scanner;
public class StandingOvation{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=T; i++){
            String tmp = sc.nextLine();
            String[] line = tmp.split("\\s");
            int sMax = Integer.parseInt(line[0]);
            int friends=0;
            int less_shy=0;
            for(int shyness=0; shyness<=sMax; shyness++){
                int count = line[1].charAt(shyness)-'0';
                if(shyness>0 && count!=0){
                    if(less_shy<shyness){
                        int toAdd = shyness-less_shy; 
                        friends+=toAdd;
                        less_shy+=toAdd;
                    }
                }
                less_shy+=count;
            }
            System.out.println("Case #"+i+": "+friends);        
        }
        sc.close();
        return;
    }
}
