package methodEmbedding.Standing_Ovation.S.LYD2031;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Suraj Singh
 */
class StandingOvation {
    public static void main(String arfs[]) throws FileNotFoundException, IOException
    {
        Scanner s = new Scanner(System.in);
        int t;// = s.nextInt();
        String input,path="C:\\Users\\Suraj Singh\\Desktop\\A-small-attempt1.in",line;
        int smax,ans,counter,diff;
        BufferedReader br = new BufferedReader(new FileReader(path));
        t = Integer.parseInt(br.readLine());
        //System.out.println(t);
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<t;i++)
        {
            line = br.readLine();
            //System.out.println(line);
            ans = counter = diff = 0;
            smax = Integer.parseInt(line.split(" ")[0]);
            input = line.split(" ")[1];// = s.next();
            for(int j=0;j<smax+1;j++)
            {
                if(counter>=j)
                    counter+= Integer.parseInt(input.substring(j, j+1));
                else
                {
                    diff = j - counter;
                    ans+= diff;
                    counter+= Integer.parseInt(input.substring(j, j+1)) + diff;
                }
            }
            sb.append("Case #"+(i+1)+": "+ans+"\n");
        }
        System.out.print(sb);
    }
}
