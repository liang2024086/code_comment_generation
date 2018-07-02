package methodEmbedding.Standing_Ovation.S.LYD1603;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
String str=s.nextLine();
            int sum=0;
            int result=0;
            String[] str2=str.split(" ");
            for (int j = 0; j < str2[1].length(); j++) {
                int tmp=Integer.parseInt(String.valueOf(str2[1].charAt(j)));
                if (sum<j){
                    if (tmp!=0) {
                        result += j - sum;
                        sum = j;

                    }
                }
                    sum+=tmp;

            }
            System.out.println("Case #"+(i+1)+": "+result);
        }
    }
}
