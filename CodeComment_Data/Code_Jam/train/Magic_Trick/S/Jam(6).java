package methodEmbedding.Magic_Trick.S.LYD27;

import java.io.*;
import java.util.*;

class Jam{

             public static void  main(String[]s) throws Exception
             {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int t=Integer.parseInt(br.readLine());
                FileWriter writer=new FileWriter("output.txt");
                PrintWriter print=new PrintWriter(writer,true);
                 for(int i=1;i<=t;i++)
                 {
                    HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
                    int pos=Integer.parseInt(br.readLine());
                    for(int p=0;p<4;p++)
                     
                       {
                           StringTokenizer Token=new StringTokenizer(br.readLine());
                           if(p==pos-1)
                           {
                            map.put(Integer.parseInt(Token.nextToken()),1);
                            map.put(Integer.parseInt(Token.nextToken()),1);
                            
                             map.put(Integer.parseInt(Token.nextToken()),1);
                             map.put(Integer.parseInt(Token.nextToken()),1);
                           }
                        }
                           pos=Integer.parseInt(br.readLine());
                       int c=0,num=0,x;
                      for(int p=0;p<4;p++)
                     
                       {
                           StringTokenizer Token=new StringTokenizer(br.readLine());
                           if(p==pos-1)
                           {
                            if(map.get(x=Integer.parseInt(Token.nextToken()))!=null){ c++;;num=x;}
                            if(map.get(x=Integer.parseInt(Token.nextToken()))!=null) {c++;; num=x;}
                            if(map.get(x=Integer.parseInt(Token.nextToken()))!=null) { c++;; num=x;}
                            if(map.get(x=Integer.parseInt(Token.nextToken()))!=null) {c++;;  num=x;}
                           }
                       }  
                         
                          
                          if(c==0)  print.println("Case #"+i+": "+"Volunteer cheated!");
                          if(c==1)  print.println("Case #"+i+": "+num);
                          if(c>1)   print.println("Case #"+i+": "+"Bad magician!");  
                                             
                  }
           print.close();
                          writer.close();  
          }               
}
