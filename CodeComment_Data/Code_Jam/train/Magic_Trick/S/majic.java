package methodEmbedding.Magic_Trick.S.LYD780;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darshan
 */
public class Magic {
    
    public static final String CASE = "Case #";
    public static final String COLON = ": ";
    
    public static void main(String[] args) throws Exception
    {
        int T;
        BufferedReader br = new BufferedReader(new FileReader("E:\\Shared\\Documents\\NetBeansProjects\\CodeJam\\src\\input.txt"));
        T = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= T ; i ++)
        {
            Set<String> first = new HashSet<String>();
            Set<String> second = new HashSet<String>();
            int firstChoice = Integer.parseInt(br.readLine());
            for(int j = 0 ; j < firstChoice - 1 ; j ++)
            {
                br.readLine();
            }
            String line = br.readLine();
            String[] lineNeeded = line.split(" ");
            for(int j = 0 ; j < 4 - firstChoice; j ++)
            {
                br.readLine();
            }
            
            for(int j = 0 ; j < 4 ; j ++)
            {
                first.add(lineNeeded[j]);
            }
            int secondChoice = Integer.parseInt(br.readLine());
            for(int j = 0 ; j < secondChoice - 1 ; j ++)
            {
                br.readLine();
            }
            String line2 = br.readLine();
            String[] lineNeeded2 = line2.split(" ");
            for(int j = 0 ; j < 4 - secondChoice; j ++)
            {
                br.readLine();
            }
            
            for(int j = 0 ; j < 4 ; j ++)
            {
                second.add(lineNeeded2[j]);
            }
            first.retainAll(second);
            if(first.size() == 1)
            {
                System.out.println(CASE + i + COLON + (first.toArray())[0]);
            }
            else if(first.size() > 1)
            {
                System.out.println(CASE + i + COLON + "Bad magician!");
            }
            else if(first.size() == 0)
            {
                System.out.println(CASE + i + COLON + "Volunteer cheated!");
            }
        }
    }
}
