package methodEmbedding.Counting_Sheep.S.LYD1497;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;


/**
 *
 * @author Absar
 */
public class Codejam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(new File("A-small-attempt1.in"));
        
        int n = in.nextInt();
        
        for(int i=0 ; i<n ; i++)
        {
            short counter=1;
            long num=in.nextLong();
            
            if(num==0)
            {
                System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
            }
            
            else{
            String s = "";
            
            boolean ar[] = new boolean[10];
                
                for(int j=0 ; j<10 ; j++)
                {
                    ar[j]=false;
                }
                
            boolean check2=false;    
            for(counter=1 ; counter!=0 ; counter++)
            {
                long temp=num*counter;
                s+=Long.toString(temp);
                
                for(int j=0 ; j<s.length() ; j++)
                {
                    ar[s.charAt(j)-48]=true;
                }
                
                boolean check=false;
                for(int j=0 ; j<10 ; j++)
                {
                    if(ar[j]==false)
                    {
                        check = true;
                        break;
                    }
                }
                
                if(check==false)
                {
                    check2=true;
                    System.out.println("Case #" + (i+1) + ": " + temp);
                    break;
                }
                
                
            }
            if(check2==false)
                System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
                    
            }
        }
        
    }
    
}
