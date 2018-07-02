package methodEmbedding.Speaking_in_Tongues.S.LYD692;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author Student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int i=1;
        Scanner s=new Scanner(new File("A-small-attempt0.in.txt"));
        PrintWriter x=new PrintWriter(new File("A-small-attempt0.out.txt"));
        if(s.hasNextLine()) s.nextLine();
        while(s.hasNextLine()){
            x.println("Case #"+i+": "+Map.toGooglerese(s.nextLine()));
            i++;
        }
        x.close();
        }

    }

   
