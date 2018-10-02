package methodEmbedding.Counting_Sheep.S.LYD1621;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
public class sheep
{int T,N,i,y,m,k,x=1,a,c,d,e,f;
  int[] ba = new int[10];
  int[] test = new int[100];
    String t,n;
    
public void main()throws IOException
{   BufferedReader testcases =new BufferedReader(new InputStreamReader(System.in));
     t=testcases.readLine();
     T=Integer.parseInt(t);
     
     if(T>=1 && T<=100)
     { mainLoop:
        for(i=1;i<=T;i++)
        { BufferedReader number =new BufferedReader(new InputStreamReader(System.in));
          n=number.readLine();
          N=Integer.parseInt(n); 
          if ( N==0)
           {  test[i-1] = 0;
               continue mainLoop;}
          int r = 0;
          int j = 0;
          for(d=0;d<10;d++)
            { ba[d] = 11;}
           while (r<9)
          {j = j + 1;
           a = N * j;
           x = a;
               
          while (x>0)
          {   
              y = x%10;
            x = x/10;
            
            for (k=0;k<=9;k++)
            { 
              if ( y == k)
              { ba[k]= k;
                 
                }}}
               checkLoop:
            for (m=0;m<=9;m++)
              { if ( ba[m]== m) 
                   { r = m;   }
                else
                { break checkLoop;   } 
                              }
                                  
                                  }  
                       
                      test[i-1] = a;                                  }
                                  
                                     }
                                     else { System.out.println("Test cases limited to 100");
                                              f = 1;}
                           printLoop:          
                       for(e=1;e<=T;e++)
                      { if( f==1)
                          { break printLoop;}
                        else if( test[e-1] == 0)
                           {System.out.println("Case #"+e+": INSOMNIA");}
                        else{  System.out.println("Case #"+e+": "+test[e-1]);}
                    }     
                          }
                        }
                                        
                
                
                
                    
                         
                         
               
                         
                         
                         
                         
                         
                         
                         
                        
                    
            
            
            
