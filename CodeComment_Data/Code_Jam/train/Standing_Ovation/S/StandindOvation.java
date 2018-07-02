package methodEmbedding.Standing_Ovation.S.LYD1776;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Created by LockonDaniel on 4/10/15.
 */
public class StandindOvation {
    public static void main(String[] args) {
        int maxShyness = 0, testCases = 0, sumAttendants = 0, invitedNeeded = 0;
        String attendants = new String();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

            testCases = Integer.parseInt(bufferedReader.readLine());
            for(int i=0; i<testCases;i++)
            {
                attendants = bufferedReader.readLine();
                String [] attendants2 = attendants.split(" ");
                maxShyness = Integer.parseInt(attendants2[0]);
                attendants = attendants2[1];
                for(int level=0; level<=maxShyness;level++){
                    String substring = attendants.substring(level, level+1);
                    int attendantsAtLevel = Integer.parseInt(substring);
                    if(attendantsAtLevel!=0)
                    {
                        if(sumAttendants>=level)
                        {
                            sumAttendants+=attendantsAtLevel;
                        }
                        else
                        {
                            invitedNeeded += level-sumAttendants;
                            sumAttendants+=invitedNeeded+attendantsAtLevel;
                        }
                    }
                }
                writer.print("");
                writer.println("Case #"+(i+1)+": "+invitedNeeded);
                sumAttendants=0;
                invitedNeeded=0;
            }
        writer.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }



    }
}
