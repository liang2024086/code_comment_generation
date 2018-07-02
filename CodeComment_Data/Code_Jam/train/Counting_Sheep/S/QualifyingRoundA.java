package methodEmbedding.Counting_Sheep.S.LYD1534;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tresdon
 */
public class QualifyingRoundA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> needed = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            needed.add(i);
        }
        
        int N, T, digit = 0, tmp;
        String last = "";
        Scanner in = null;
        try{
            in = new Scanner(new File("A-small-attempt1.IN"));
        }catch(Exception e){}
        T = in.nextInt();
        
        for(int i = 1; i <= T; i++){
            N = in.nextInt();
            int count = 1;

            if( N == 0){
                System.out.println("Case #" + i + ": INSOMNIA");
            }
            else{
               while(!needed.isEmpty()){
               tmp = count * N;
               while(tmp > 0){
                   try{
                        needed.remove((Integer)(tmp % 10));
                   }catch(Exception e){}
                    tmp /= 10;
                }
                    count++;
                }
                System.out.println("Case #" + i + ": " + (count - 1) * N);
                for(int j = 0; j < 10; j++){
                    needed.add(j);
                }
            }
            
            
        }
        
    }
    
}
