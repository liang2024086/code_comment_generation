package methodEmbedding.Magic_Trick.S.LYD1862;

import java.util.*;

public class MagicTrick 
{
    public static void main(String[] args) throws Exception
    {
        Scanner in  = new Scanner(System.in);
        List<Integer> a1  = new ArrayList<>(), a2 = new ArrayList<>();
        
        int taskNumber = in.nextInt();
        for (int task = 1; task < taskNumber + 1; task++)
        {
            a1.clear(); a2.clear();
            
            int answer = in.nextInt();
            for (int i = 0; i < 4; i++) 
            {
                if (i == answer - 1) 
                {
                    for (int j = 0; j < 4; j++) {
                        a1.add(in.nextInt());
                    }
                }
                else
                {
                    for (int j = 0; j < 4; j++) {
                        in.nextInt();
                    }
                }
            }
            
            answer = in.nextInt();
            for (int i = 0; i < 4; i++)
            {
                if (i == answer - 1) 
                {
                    for (int j = 0; j < 4; j++) {
                        a2.add(in.nextInt());
                    }
                }
                else
                {
                    for (int j = 0; j < 4; j++) {
                        in.nextInt();
                    }
                }
            }
            a2.retainAll(a1);
            
            if (a2.size() == 1) {
                System.out.printf("Case #%d: %s\n", task, a2.get(0));
            }
            else if (a2.isEmpty()) {
                System.out.printf("Case #%d: %s\n", task, "Volunteer cheated!");
            }
            else {
                System.out.printf("Case #%d: %s\n", task, "Bad magician!");
            }
        }
    }
}
