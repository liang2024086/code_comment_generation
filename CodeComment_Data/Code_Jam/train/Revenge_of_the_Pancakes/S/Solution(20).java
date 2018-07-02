package methodEmbedding.Revenge_of_the_Pancakes.S.LYD15;

import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        int chances;
        t=Integer.parseInt(sc.nextLine());
        int cases=1;
        while(t-->0)
            {
              Stack<Character> st = new Stack<Character>();
               // Stack st=new Stack();
    chances=0;
            String input=sc.nextLine();
            for(int i=input.length()-1;i>=0;i--)
                {
                char ch=input.charAt(i);
                if(st.empty())
                    {   
                        st.push(ch);
                    }

                else
                    {
                      if(st.peek()=='-' && ch=='+'){chances+=2;st.pop();st.push('+');st.push(ch);}
                      else{st.push(ch);}
				}
                }
               if(st.peek()=='+'){System.out.printf("Case #%d: %d",cases,chances);}
            else{System.out.printf("Case #%d: %d",cases,chances+1);}
                   
            System.out.println();
            cases++;
                }

          
        }

}
