package methodEmbedding.Counting_Sheep.S.LYD846;

import java.util.Scanner;
class shapCounter {
    public static void main (String[] cheese) {
        //get data
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        for(int i = 1; i <= t; i++) {//test loop
            long n = cin.nextLong();//input
            if (n == 0) {
                System.out.println("Case #"+ i +": INSOMNIA");
            }
            else {
                boolean sleeping = false;
                boolean[] number = new boolean[10];
                for (long j = 1;!sleeping; j++) {//n * i
                    long temp = n * j;
                    //System.out.println(temp);
                    while (temp > 0) {
                        int dig = (int)(temp % 10);
                        //System.out.println(dig);
                        number[dig] = true;
                        temp = temp / 10;
                    }
                    int temp2 = 0;
                    for (boolean bool : number) {
                        temp2 += bool ? 1:0;
                    }
                if (temp2 >= 10) {
                   sleeping = true;
                    System.out.println("Case #" + i + ": " + n * j);
                   }
               }
           }
       }
    }
}
