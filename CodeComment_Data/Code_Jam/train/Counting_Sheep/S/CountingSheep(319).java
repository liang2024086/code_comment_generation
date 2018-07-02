package methodEmbedding.Counting_Sheep.S.LYD123;


import java.util.Scanner;

/**
 *
 * @author dajavax
 */
public class CountingSheep {
    private static Scanner keyboard=new Scanner (System.in);
    public static void main(String[] args) {
        int iterations = Integer.parseInt(keyboard.next());
        for(int i = 1; i<=iterations; i++){
            long inp = Long.parseLong(keyboard.next());
            long number = inp;
            boolean[] digits = new boolean[10];
            int count = 0;
            while(number!=0){
                char[] chars = String.valueOf(number).toCharArray();
                for(char ch : chars){
                    if(!digits[ch-'0']){
                        count++;
                        digits[ch-'0']=true;
                    }
                }
                if(count==10){
                    break;
                }
                number+=inp;
            }
            System.out.println("Case #"+i+": "+((number==0)?"INSOMNIA":number));
        }
    }
    
}
