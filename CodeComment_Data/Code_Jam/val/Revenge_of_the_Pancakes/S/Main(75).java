package methodEmbedding.Revenge_of_the_Pancakes.S.LYD985;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int run = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < run; i++){
            //StringBuilder sb = new StringBuilder(sc.nextLine());
            //String s = sb.reverse().toString();
            boolean isnegative = false;
            boolean ispositive = false;
            String s = new StringBuilder(sc.next()).toString();
            boolean ispos = false;
            int counter = 0;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == '-'){
                    isnegative = true;
                    if (ispositive){
                        ispositive = false;
                        String that = "";
                        for (int p = 0; p < j; p++){
                            that+=("-");
                        }
                        that+=(s.substring(j));
                        s = that;
                        counter++;
                        //isnegative = false;
                    }
                }
                else if (s.charAt(j) == '+'){
                    ispositive = true;
                    if (isnegative){
                        isnegative = false;
                        String that = "";
                        for (int p = 0; p < j; p++){
                            that+=("+");
                        }
                        that += (s.substring(j));
                        s= that;
                        counter++;
                        //ispositive = true;
                    }
                }
            }
            if(s.charAt(0) == '-'){
                counter++;
            }
            System.out.println("Case #" + (i+1) + ": " + counter);
        }
    }
}
