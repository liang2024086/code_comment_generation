package methodEmbedding.Standing_Ovation.S.LYD144;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hammerbeat
 */
public class StandingOvation {
    public static void main(String args[])throws FileNotFoundException, IOException
    {
        // TODO code application logic here
        String filestr = "E:\\Data Disk\\Projects\\GoogleJam\\INPUT\\A-small-attempt0.in";
        File file = new File(filestr);
        Scanner scan = new Scanner(file);
        
        File fout = new File("E:\\Data Disk\\Projects\\GoogleJam\\INPUT\\standingovation.out");
	FileOutputStream fos = new FileOutputStream(fout);
 
	OutputStreamWriter osw = new OutputStreamWriter(fos);
        
        int tasks = scan.nextInt();
        
        for (int task = 0; task < tasks; task++)
        {
            int ovation = 0;
            int maxshyness = scan.nextInt();
            String crowd = scan.next();
            int friends = 0;
            
            for (int i = 0 ; i<= maxshyness; i++)
            {
                if ((i - ovation-friends)>0) {friends += (i-ovation-friends);}
                ovation += ((int)crowd.charAt(i) - 48);
            }
            osw.write("Case #"+(task+1)+": " + friends+ "\n");
        }
        osw.close();
    }
}
