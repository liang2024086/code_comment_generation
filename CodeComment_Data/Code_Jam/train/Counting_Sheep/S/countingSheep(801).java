package methodEmbedding.Counting_Sheep.S.LYD217;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class countingSheep {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int rows, cols;
        int two, three, testcase, taskNo;
        double rate;
        boolean checker;
        double count;
        taskNo = 0;
        testcase = Integer.parseInt(in.readLine());
        for (int a = 0; a < testcase; a++) {
            taskNo++;
            Set<Integer> set = new HashSet<Integer>();
            int n = Integer.parseInt(in.readLine());
            int multiplier = 2;
            checker = true;
            if (n == 0){
                System.out.println("Case #"+taskNo + ": " + "INSOMNIA");

            }else{
                int temp = n;
                while (set.size() < 10){

                  //  System.out.println(set + "\n"+ multiplier + " mt " + temp);
                    while(temp > 0){
                        set.add(temp%10);
                        temp/=10;
                    }
                    temp = n*multiplier;
                    multiplier++;
                    if (multiplier > 100000){
                        checker = false;
                        break;
                    }
                }


                if (checker) {
                    //       System.out.println(multiplier + " " + n);
                    //    System.out.println(set);
                    //multiplier is always 1 ahead, and you do
                    // 1 more ++ even
                    //after set is full, so need -2
                    System.out.println("Case #" + taskNo + ": " + (n * (multiplier - 2)));

                }else{
                    System.out.println("Case #"+taskNo + ": " + "INSOMNIA");
                }

            }


        }


    }
}
