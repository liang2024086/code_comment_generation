package methodEmbedding.Cookie_Clicker_Alpha.S.LYD839;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: WANG
 * Date: 4/12/14
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class round1problemB {
    public static void main(String[] args){
        try {
            Scanner input=new Scanner(new File("F:\\code\\B-small-attempt0.in"));
            PrintWriter output=new PrintWriter("F:\\code\\round1problemBoutput.txt") ;
            int casenumber = input.nextInt();
            for (int i=0;i<casenumber;i++)
            {
                double rate=2.0;
                double c=input.nextDouble();
                double f=input.nextDouble();
                double x=input.nextDouble();
                double totaltime=0;
                while(true)
                {
                    if (x>c)
                    {
                        totaltime+=c/rate;
                     if ((x/(rate+f))<((x-c)/rate))
                            rate+=f;
                      else
                       x-=c;

                    }
                    else
                    {
                        totaltime+=x/rate;
                        break;
                    }
                }

                output.println("Case #"+(i+1)+": "+totaltime);
                output.flush();
            }
        } catch(FileNotFoundException e){}
    }
}
