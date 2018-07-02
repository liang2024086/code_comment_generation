package methodEmbedding.Magic_Trick.S.LYD1213;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Oshekfeh
 */
public class Magic_trick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //input output files
            String path = "c:\\gcj\\A-small-attempt0.in";
            //path = path.replaceAll("\\", "/");
            File inputFile = new File(path);
            
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            PrintWriter out = new PrintWriter("c:/gcj/A-small-attempt0.out");
            
            
            String line = br.readLine();
            Integer T = Integer.parseInt(line);
            for(int i = 0; i < T;i++)
            {
                Integer firstRow = Integer.parseInt(br.readLine()) - 1;
                List<String[]> firstArrang = new ArrayList<String[]>();
                for(int j = 0; j < 4; j++)
                {
                    firstArrang.add(br.readLine().split(" "));
                }
                
                Integer secondRow = Integer.parseInt(br.readLine()) - 1;
                List<String[]> secondArrang = new ArrayList<String[]>();
                for(int j = 0; j < 4; j++)
                {
                    secondArrang.add(br.readLine().split(" "));
                }
                
                String[] first = firstArrang.get(firstRow);
                String[] second = secondArrang.get(secondRow);
                String number = new String();
                Integer foundTimes = 0;
                for(int j = 0; j < 4 ; j++)
                {
                    if(Arrays.asList(second).contains(first[j]))
                    {
                        number = first[j];
                        foundTimes++;
                    }
                }
                
                if(foundTimes == 0)
                {
                    out.println("Case #" + Integer.toString(i + 1) + ": Volunteer cheated!");
                    System.out.print("\nCase #" + Integer.toString(i + 1) + ": Volunteer cheated!");
                }
                else if(foundTimes == 1)
                {
                    out.println("Case #" + Integer.toString(i + 1) + ": " + number);
                    System.out.print("\nCase #" + Integer.toString(i + 1) + ": " + number);
                }
                else{
                    out.println("Case #" + Integer.toString(i + 1) + ": Bad magician!");
                    System.out.print("\nCase #" + Integer.toString(i + 1) + ": Bad magician!");
                }
                
            }
            
            
            br.close();
            out.close();
        }catch(Exception e){
            System.out.print("Can't open the file message : " + e.getMessage());
        }
        
    }
}
