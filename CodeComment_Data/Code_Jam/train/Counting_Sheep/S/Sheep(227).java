package methodEmbedding.Counting_Sheep.S.LYD718;

import java.util.*;
/**
 * Created by Brendon on 4/8/2016.
 */
public class Sheep {
    public static void main(String ... orange)throws Exception {

        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for (int count = 0; count < c; count++) {
            int num = scanner.nextInt();
            String numbers = "";
            int t =1;
            String result = "";
            String pr = "";

            while(true){
                int tmp = num*(t);
                if(num==0){
                    result = "INSOMNIA";
                    break;
                }
                if(numbers.length()==10){
                    result=pr;
                    break;
                }
                String str = String.valueOf(tmp);
                pr=str;
                for(int i = 0; i<str.length();i++){
                    boolean has = false;
                    for(int j = 0; j< numbers.length();j++){
                        if(numbers.charAt(j)==str.charAt(i)){
                            has = true;
                        }
                    }
                    if(has==false){
                        numbers+=str.charAt(i);
                    }

                }
                t++;
            }
            System.out.printf("Case #%d: %s\n" ,count+1, result);
        }
        scanner.close();
    }
}
