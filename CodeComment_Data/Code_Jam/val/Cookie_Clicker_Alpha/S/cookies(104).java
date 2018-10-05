package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1251;

import java.io.*;
import java.util.*;

class cookies{
                public static void main(String[]s)throws Exception
                {
                   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int t=Integer.parseInt(br.readLine());
                   FileWriter writer=new FileWriter("output.txt");
                PrintWriter print=new PrintWriter(writer,true);
                 for(int i=1;i<=t;i++)
                   {
                       StringTokenizer token=new StringTokenizer(br.readLine());
                         
                        double c=Double.parseDouble(token.nextToken());
                        double f=Double.parseDouble(token.nextToken());
                        double x=Double.parseDouble(token.nextToken());
                        
                        double start=2.00,sum=0.00;
                        double reqrd,time,total=0;
                        double y,temp=0;
                       
                        for(int k=0;true;k++)
                        {
                           if(k!=0)
                           { reqrd=c/f;
                              time=(x-total)/start;
                              if(reqrd<time)
                                {   total=total-c; start=start+f;}
                              else { sum=sum+time; break;}
                           }
                          
                          y=c/start;
                          sum=sum+y;
                           temp=c;
                           total=total+temp;

                        }
                        print.println("Case #"+i+": "+sum);

                    }
                 print.close();
                          writer.close(); 
               }
           }
