package methodEmbedding.Standing_Ovation.S.LYD1251;


import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        //String[] swek =new String[cases];
        for(int i =0 ; i < cases ;i ++)
        {
            int levels = scanner.nextInt();
            String numbers = scanner.next();
            int noStandingAudience = 0;
            int noFriends = 0;
            for(int noStandingRequired = 0 ;noStandingRequired<=levels;noStandingRequired++)
            {
                int noAudienceWithThisShyness = Character.getNumericValue(numbers.charAt(noStandingRequired));
                if(noStandingAudience >= noStandingRequired)
                {
                    noStandingAudience += noAudienceWithThisShyness;
                    continue;
                }
                int additionalFriends = noStandingRequired - noStandingAudience;
                noFriends += additionalFriends;
                noStandingAudience += additionalFriends;
                noStandingAudience += noAudienceWithThisShyness;
            }
            System.out.println ("Case #" +Integer.toString(i+1)+": "+noFriends);
        }
        /*
        FileWriter fw = new FileWriter("output.out");
        for(int i = 0 ; i < swek.length;i++)
        {
            fw.write(swek[i]+"\n");
        }
        fw.close();*/
    }
}
