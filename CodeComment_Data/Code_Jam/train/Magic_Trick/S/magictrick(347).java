package methodEmbedding.Magic_Trick.S.LYD1673;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class magictrick {

    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileReader("/Users/hadoop/A-small-attempt0.in.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("/Users/hadoop/magictrick.txt"));
        
        int T = Integer.valueOf(sc.nextLine());
        for(int cs = 1; cs <= T; cs++)
        {
            HashSet<Integer> hs = new HashSet<Integer>(); 
            int answer1 = Integer.valueOf(sc.nextLine());
            for(int i = 1;i <= 4; i++)
            {
                if(i == answer1)
                {
                    hs.add(sc.nextInt());
                    hs.add(sc.nextInt());
                    hs.add(sc.nextInt());
                    hs.add(sc.nextInt());
                }
                sc.nextLine();
            }
            String output = "";
            int answer2= Integer.valueOf(sc.nextLine());
            int counter = 0; 
            int number = 0;
            for(int i = 1; i<= 4; i++)
            {
                if(i == answer2)
                {
                    for(int col = 0; col < 4; col++)
                    {
                        number = sc.nextInt();
                        if(hs.contains(number))
                        {
                            output = number + "";
                            counter++;
                        }
                    }
                }
                sc.nextLine();
            }
            
            if(counter == 0)
                output = "Volunteer cheated!";
            else if(counter > 1)
                output = "Bad magician!";
            
            System.out.println("Case #" + cs + ": " + output);
            pw.println("Case #" + cs + ": " + output);
            
        }
        
        pw.flush(); 
        sc.close(); 
        pw.close(); 
    }
    
}
