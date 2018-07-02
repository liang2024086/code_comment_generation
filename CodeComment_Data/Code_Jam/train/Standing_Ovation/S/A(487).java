package methodEmbedding.Standing_Ovation.S.LYD1024;

import java.util.Scanner;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        StringTokenizer token;
        int zero='0';
        scan.nextLine();
        for (int i = 0; i < size; i++) {
            token=new StringTokenizer(scan.nextLine());
            token.nextToken();
            String str=token.nextToken();
            int sum=0,ret=0;
            sum+=str.charAt(0)-zero;
            for (int j = 1; j < str.length(); j++) {
                if(j>sum){
                    ret+=j-sum;
                    sum=j;
                }
                sum+=str.charAt(j)-zero;
            }
            System.out.println("Case #"+(i+1)+": "+ret);
        }
	}
}
