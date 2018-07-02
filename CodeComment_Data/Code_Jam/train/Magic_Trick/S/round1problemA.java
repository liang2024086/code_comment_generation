package methodEmbedding.Magic_Trick.S.LYD581;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: WANG
 * Date: 4/12/14
 * Time: 12:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class round1problemA {

    public static void main(String[] args)
    {
        try {
            Scanner input=new Scanner(new File("F:\\code\\A-small-attempt4.in"));
            PrintWriter output=new PrintWriter("F:\\code\\round1problemAoutput.txt") ;
         int casenumber = input.nextInt();
           for (int i=0;i<casenumber;i++)
           {
               HashSet<Integer> card=new HashSet<Integer>();
               String temp1;
               int result=0;
                int row1= input.nextInt();
            temp1=   input.nextLine();
               for(int j=0;j<row1-1;j++)
                   temp1=    input.nextLine();
               for(int j=0;j<4;j++)
                  card.add(input.nextInt());
               temp1=    input.nextLine();
               for(int j=row1+1;j<=4;j++)
                   temp1=    input.nextLine();
               int row2= input.nextInt();
               temp1=    input.nextLine();
               for(int j=0;j<row2-1;j++)
                   temp1=    input.nextLine();
               for(int j=0;j<4;j++)
               {
                   int temp= input.nextInt();
                   if (card.contains(temp))
                       if (result==0)
                           result=temp;
                   else if (result>0)
                           result=-1;
               }
               temp1=   input.nextLine();
               for(int j=row2+1;j<=4;j++)
                   temp1=    input.nextLine();
          //     System.out.print("Case #"+(i+1)+": ");
           output.print("Case #"+(i+1)+": ");
               if (result>0)
             //     System.out.print(result+"\n");
                  output.print(result+"\n");
               else if (result==0)
           //        System.out.print("Volunteer cheated!\n");
         output.print("Volunteer cheated!\n");
               else
              //     System.out.print("Bad magician!\n");
          output.print("Bad magician!\n");

           }
   output.flush();
        }catch(FileNotFoundException e){}
    }

}
