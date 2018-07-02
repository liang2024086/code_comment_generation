package methodEmbedding.Revenge_of_the_Pancakes.S.LYD409;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author al5250
 */
public class Gcodejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f;
        f = new File("B-small-attempt0.in");
        Scanner sc = new Scanner(f);
        int numCases = Integer.parseInt(sc.nextLine());
        String line;
        char prev, current;
        int count;
        for (int i = 1; i <= numCases; i++)
        {
            count = 0;
            line = sc.nextLine();
            prev = line.charAt(0);
            for (int j = 1; j < line.length(); j++)
            {
                current = line.charAt(j);
                if (prev != current)
                {
                    count++;
                }
                prev = current;  
            }
            if (line.charAt(line.length() - 1) == '-')
            {
                count++;
            }
            System.out.println("Case #" + i + ": " + count);   
        }
    }
    
    }
