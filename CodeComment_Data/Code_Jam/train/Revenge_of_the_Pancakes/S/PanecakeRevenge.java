package methodEmbedding.Revenge_of_the_Pancakes.S.LYD289;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ketan
 */
public class PanecakeRevenge {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            Stack<Integer> A = new Stack();
            Stack<Integer> B = new Stack();
            int manuover = 0;
            String s = sc.next();
            //System.out.println(s);
            for(int j= (s.length()-1);j>=0;j--)
            {
                if(s.charAt(j)=='-')
                {
                    A.push(-1);
                }
                else if(s.charAt(j)=='+')
                {
                    A.push(1);
                }
                else
                {
                    System.out.println(s.charAt(j)+" Is not a valid input"); 
                }
            }
            //System.out.println(A.size());
           
            while(A.search(-1)!=-1)
            {
                if(A.peek()==-1 && A.size()>1)
                {
                    while(A.size()>0 && A.peek()==-1)
                    {
                        
                        B.push(A.pop());
                    }
                    while(B.size()>0)
                    {
                        A.push(-1*B.pop());
                    }
                    manuover++;
                }
                else if(A.size()==1 && A.peek()==-1)
                {
                    A.push(A.pop()*-1);
                    manuover++;
                }
                //check if the top is +1 
                //no need to check if the size if greater than 1 or not sice it will not get in while loop.
                else if(A.peek()==1)
                {
                    while(A.peek()==1 && A.size()>0)
                    {
                        B.push((A.pop()));
                    }
                    while(B.size()>0)
                    {
                        A.push(-1*B.pop());
                    }
                    manuover++;
                }
                    
            }
            System.out.println("Case #"+(i+1)+": "+manuover);
        }
    }
    
}
