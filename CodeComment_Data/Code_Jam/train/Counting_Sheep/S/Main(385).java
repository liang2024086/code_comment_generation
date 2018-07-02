package methodEmbedding.Counting_Sheep.S.LYD137;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 1;
        in.nextLine();
        while (test!=0)
        {
            String N = in.nextLine();
            HashMap<Character,Integer> hashmap = new HashMap<>(10);
            String [] Ns= N.split("");
            Integer intN = Integer.parseInt(N);
            boolean flag = true;
            if (intN == 0)
            {
                System.out.println("Case #" + count++ + ": " + "INSOMNIA");
                test--;
                flag = false;
                continue;
            }

            int innerCounter = 1;
                while (flag) {

                    for (int i = 0; i < N.length(); i++) {
                        char c = N.charAt(i);
                        if (!hashmap.containsKey(c))
                        {
                            hashmap.put(c,1);
                        }
                        else
                        {
                            hashmap.replace(c,hashmap.get(c)+1);
                        }
                    }

                    if (hashmap.size() == 10)
                    {
                        flag=false;
                    }
                    else
                    {
                        N = "" + intN*innerCounter++;
                    }
                }
            if (hashmap.size() == 10) {
                System.out.println("Case #" + count++ + ": " + N);
            }
                test--;
        }
    }
}
