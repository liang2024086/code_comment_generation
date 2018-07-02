package methodEmbedding.Magic_Trick.S.LYD1453;


import java.util.Scanner;

/**
 *
 * @author Lasantha
 */
public class MagicTrick {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        int t=0,ans1=0,ans2=0;
        int[][] arrangement1 = new int[4][4]; 
        int[][] arrangement2 = new int[4][4]; 
        
        String y = new String();
        
        t = input.nextInt();
        for (int i = 0; i < t; i++) {
            ans1 = input.nextInt()-1;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    arrangement1[j][k] = input.nextInt();
                }
            }
            ans2 = input.nextInt()-1;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    arrangement2[j][k] = input.nextInt();
                }
            }
            int match = 0;
      loopA : for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if(arrangement1[ans1][j]==arrangement2[ans2][k]){
                        if(match==0){
                            y = " "+arrangement1[ans1][j];
                        }else{
                            y = " Bad magician!";
                            break loopA;
                        }
                        match++;
                    }
                    
                }
            }
            if(match==0) y = " Volunteer cheated!";
            
            System.out.printf("Case #%d:%s\n",i+1,y);
        }
    }
    
}
