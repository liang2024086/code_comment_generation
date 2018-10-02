package methodEmbedding.Counting_Sheep.S.LYD907;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ssirigin on 4/8/2016.
 */
public class sheep_sleep {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
         int numOfTestcases = scanner.nextInt();
        String[] numbers =new String[numOfTestcases+1];
        for(int i=1;i<=numOfTestcases;i++){
            numbers[i] = String.valueOf(scanner.nextInt());
            HashSet<Integer> intchecker=new HashSet<>(10);
            String number = numbers[i];
            int breakflag =0;
            int breakflag1 = 0;
            for(int multiple =1;multiple<200;multiple++){
                String changenumber = String.valueOf(Integer.parseInt(number)*multiple);
                if(changenumber.equals(String.valueOf(Integer.parseInt(number)*multiple-1))){
                    System.out.println("Case " + "#" + i + ": " + "INSOMNIA");
                    breakflag1 =1;
                    break;

                }
            for (int p = 0; p < changenumber.length(); p++) {
                int num = Character.getNumericValue(changenumber.charAt(p));
                if(!intchecker.contains(num)) {
                    intchecker.add(num);
                    if (intchecker.size()==10){
                        System.out.println("Case " + "#" + i + ": " + changenumber);
                        breakflag1 =1;
                        break;
                    }
                }

            }
                if(breakflag1 ==1){
                    break;
                }

            if(multiple ==199){
                breakflag = 1;
            }

            }
            if(breakflag ==1){
                System.out.println("Case " + "#" + i + ": " + "INSOMNIA");

            }
        }
    }
}
