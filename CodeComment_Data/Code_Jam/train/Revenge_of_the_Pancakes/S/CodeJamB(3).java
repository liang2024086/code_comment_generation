package methodEmbedding.Revenge_of_the_Pancakes.S.LYD749;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Sharky
 */
public class CodeJamB {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input.txt"));
        
        int n = in.nextInt();
        in.nextLine();
        for(int i=0 ; i<n ; i++)
        {
            String s = in.nextLine();
            char ar[] =  s.toCharArray();
            char cur='+';
            int counter=0, count=0;
            
            while(true)
            {
                while(counter<ar.length && cur==ar[counter])
                    counter++;
                
                if(counter==ar.length)
                    break;
                else
                {
                    if(counter-1>=0)
                        count+=1;
                    cur='-';
                    boolean check=false;
                    while(counter<ar.length && cur==ar[counter])
                    {    
                        counter++;
                        check=true;
                    }
                    if(check==true)
                        count+=1;
                }
                 cur='+';
            }
           
            System.out.println("Case #" + (i+1) + ": " + count);
        }
            
    }
        
        
}
