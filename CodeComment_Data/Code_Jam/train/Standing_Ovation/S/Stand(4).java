package methodEmbedding.Standing_Ovation.S.LYD2009;

import java.util.Scanner;

public class Stand {

    static Scanner sc=new Scanner(System.in);

    static int t=0;

    public static void main(String[] args) {
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {

            int max = sc.nextInt();
            String str = sc.next();
            int[] num = new int[max + 1];

            int r = 0, stnd = 0, minNum = 0,minTemp=0;
            for (int j = 0; j < max + 1; j++) {

                try {
                    num[j] = Integer.parseInt(str.substring(j, j + 1));
                    if(j==0){
                        stnd=num[j];
                    }
                } catch (Exception e) {
                }

                if (num[r] == 0) {

                    num[r]=-1;
                    r++;
                } else {

                    if (stnd < j&&minTemp<j-stnd) {
                        minNum = j - stnd;
                        minTemp=minNum;
                    }
                    if(j!=0){
                        stnd += num[j];
                    }

                    r = 0;
                }

            }

            System.out.println("Case #" + (i + 1) + ": " + minNum);
            minNum = 0;
            stnd = 0;


        }
    }
}
