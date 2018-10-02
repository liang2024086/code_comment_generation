package methodEmbedding.Magic_Trick.S.LYD2175;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author MostafaMahmoud
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner user_input = new Scanner( Paths.get("C:\\Users\\MostafaMahmoud\\Desktop\\A-small-attempt0.in") );
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        int[] first_answer_row  = new int[4];
        int[] second_answer_row = new int[4];
        int first_answer;
        int second_answer = 0;
        int n = Integer.parseInt(user_input.nextLine());
        int testcases=1;
        String answer="";
        int count_matches = 0;
        int match = 0;
        do{
            first_answer = Integer.parseInt(user_input.nextLine());
             for(int i=1;i<=4;i++)
            {
                if(i!=first_answer)
                user_input.nextLine();
                else
                answer = user_input.nextLine();
            }
            for(int index=0;index<4;index++)
                first_answer_row[index] = Integer.parseInt(answer.split(" ")[index]);
             second_answer = Integer.parseInt(user_input.nextLine());
            for(int i=1;i<=4;i++)
            {
                if(i!=second_answer)
                user_input.nextLine();
                else
                answer = user_input.nextLine();
            }
            for(int index=0;index<4;index++)
                second_answer_row[index] = Integer.parseInt(answer.split(" ")[index]);
            
            
            for(int i=0;i<4;i++)
            {
            for(int j=0;j<4;j++)
            {
            if(first_answer_row[i]==second_answer_row[j])
            {
                match = first_answer_row[i];
                count_matches++;
            }
            }
            }
            if(count_matches>1 || (first_answer==second_answer && count_matches==4))
                writer.println("Case #"+testcases+": Bad magician!");
            else if(count_matches ==0)
                writer.println("Case #"+testcases+": Volunteer cheated!");
            else
                writer.println("Case #"+testcases+": "+match);
            
            count_matches = 0;
            testcases++;
        }while(testcases<=n);
        writer.close(); 
        
    }
}
