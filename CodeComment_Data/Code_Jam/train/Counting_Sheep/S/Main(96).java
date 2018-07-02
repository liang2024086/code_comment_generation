package methodEmbedding.Counting_Sheep.S.LYD1614;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int r = 1; r <= t; r++) {
            int n = in.nextInt();
            if(n == 0)
                System.out.println("Case #"+r+": "+"INSOMNIA");
            else
            {
                long temp = 0;
                boolean done = false;
                boolean num[] = new boolean[10];
                for(int k = 1 ; done == false ; k++){
                    temp = n * k;
                    while(temp > 0){
                        num[(int)(temp % 10)] = true;
                        temp = temp / 10;
                    }
                    done = true;
                    for (int i = 0; i < 10; i++) {
                        done = done & num[i];
                    }
                    temp = n*k;
                }
                System.out.println("Case #"+r+": "+temp);
            }
        }
    }
}
