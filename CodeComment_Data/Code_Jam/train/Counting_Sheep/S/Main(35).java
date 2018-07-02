package methodEmbedding.Counting_Sheep.S.LYD517;


import java.util.Scanner;

/**
 * Created by akshit on 9/4/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trys = scanner.nextInt();
        int cas = 0;

        while(trys-->0){
            cas++;
            int n = scanner.nextInt();
            int count = 0;
            boolean [] nums = new boolean[10];
            for(int i=0;i<nums.length;i++)
                nums[i] = false;
            boolean done = false;
            boolean working = true;
            int checking = n;
            int first = -1;

            while (!done && first!=checking && checking < (Integer.MAX_VALUE-n -1)) {
                int copy = checking;

                if(first==-1)
                    first = checking;

                done = true;
                working = false;

                while (copy > 0) {
                    int some = copy % 10;
                    if(nums[some] == false) {
                        nums[copy % 10] = true;
                        working = true;
                    }
                    copy /= 10;
                }

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == false) {
                        done = false;
                    }
                }

                if(done)
                    break;

                count++;
                checking+=n;
            }

            done = true;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == false) {
                    done = false;
                }
            }

            if(done){
                System.out.println("Case #"+cas+": "+checking);
            }else{
                System.out.println("Case #"+cas+": "+"INSOMNIA");
            }
        }

        scanner.close();
    }

}

