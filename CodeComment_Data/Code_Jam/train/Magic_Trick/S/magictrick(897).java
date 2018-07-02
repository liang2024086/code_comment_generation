package methodEmbedding.Magic_Trick.S.LYD296;

import java.util.Scanner;

public class magictrick
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int tests, ans; // number of tests and answers
        int[] row1 = new int[4];
        int[] row2 = new int[4];
        tests = Integer.parseInt(s);
        
        for (int i = 0; i < tests; i++)
        {
            int flag = 0;
            
            s = sc.nextLine();
            ans = Integer.parseInt(s);
            for (int j = 1; j <=ans; j++)
                s = sc.nextLine();
            
            for (int j = ans + 1; j <= 4; j++)
                sc.nextLine();
            
            String[] numbers = s.split(" ");
            
            for (int j = 0; j < 4; j++)
                row1[j] = Integer.parseInt(numbers[j]);
            
            s = sc.nextLine();
            ans = Integer.parseInt(s);
            
            for (int j = 1; j <=ans; j++)
                s = sc.nextLine();
            
            for (int j = ans + 1; j <= 4; j++)
                sc.nextLine();
             
            numbers = s.split(" ");
            
            for (int j = 0; j < 4; j++)
                row2[j] = Integer.parseInt(numbers[j]);
            
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                if (row1[j] == row2[k])
            {
                if (flag == 0)
                {
                    flag = 1;
                    ans = row1[j];
                }
                
                else
                    flag = 2;
            }
            
            if (flag == 1)
                System.out.println("Case #" + (i + 1) + ": " + ans);
            else if (flag == 2)
                System.out.println("Case #" + (i + 1) + ": Bad Magician!");
            else 
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
        }
        
    }
}
