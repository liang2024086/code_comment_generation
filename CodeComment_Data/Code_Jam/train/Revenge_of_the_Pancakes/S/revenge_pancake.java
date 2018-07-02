package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1161;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author Admin
 */
public class revenge_pancake {

    /**
     * @param command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int f=1;f<=t;f++)
        {
            String st=s.next();
            int count=0;
            int i=0;
            int len=st.length();
            for(i=0;i<len-1;i++)
            {
                if(st.charAt(i)!=st.charAt(i+1))
                    count++;
            }
            if(st.charAt(i)=='-')
                count++;
            System.out.println("Case #"+f+": "+count);
        }
    }
    
}
