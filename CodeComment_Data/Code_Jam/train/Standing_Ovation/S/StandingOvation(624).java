package methodEmbedding.Standing_Ovation.S.LYD2122;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Nathan Dias <nathanxyzdias@gmail.com>
 */
public class StandingOvation {
    
    public static void main(String[] args)throws IOException{
        
        //Scanner yo = new Scanner(System.in);
        //yo=new Scanner(StandingOvation.class.getResourceAsStream("standingovation.dat"));
        Scanner yo = new Scanner(new File("standingovation.in"));
        FileWriter fw = new FileWriter(new File("standingovation.out"));
        PrintWriter pw = new PrintWriter(fw);
        
        int cases = Integer.parseInt(yo.nextLine());
        
        for(int iter=0;iter<cases;iter++){
            String people = yo.nextLine();
            people=people.substring(people.indexOf(" ")+1);
            //System.out.println(people);
            int standing=0;
            int invite=0;
            for(int shy=0;shy<people.length();shy++){
                while(standing<shy){
                    invite++;
                    standing++;
                }
                 standing+=Integer.parseInt(people.charAt(shy)+"");
            }
            System.out.print("Case #"+(iter+1)+": ");
            System.out.println(invite);
            pw.println("Case #"+(iter+1)+": "+invite);
           
        }
        pw.flush();
        
        
    }
    
}
