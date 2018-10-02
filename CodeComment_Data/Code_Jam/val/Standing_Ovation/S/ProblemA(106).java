package methodEmbedding.Standing_Ovation.S.LYD992;

import java.util.Scanner;
/**
 *
 * @author gnomeofgod
 */
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        for(int j = 0; j < cases ;j++){
        
        int tmp = sc.nextInt();
        String list = sc.nextLine();
        list = list.substring(1,list.length());
        int invite = 0;
        int count = 0;
        //System.out.println(list);
        for (int i = 0; i < list.length(); i++) {
            int valueIndex = Integer.parseInt(""+list.charAt(i));
            int need = i;
            if(valueIndex != 0){
                if(need <= count+invite){
                    count += valueIndex;
                }
                else{
                    invite += need - (count+invite);
                    count += valueIndex;
                }
            }
        }
        System.out.println("Case #"+(j+1)+": "+invite);
        
        }
        
    }
}
