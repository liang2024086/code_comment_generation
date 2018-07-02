package methodEmbedding.Magic_Trick.S.LYD1434;


import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.LinkedList;

public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
    String[] ar1=new String[4];
     String[] ar2=new String[4];
    int i,j,k,e,f,g;
    int a1,a2;
    int N;
    String pp=null;
    String name="D:\\New Folder\\OOP\\Mywork\\A-small-attempt5 (1).txt";
    String name1="D:\\New Folder\\OOP\\Mywork\\output.txt";
    
     BufferedReader br = new BufferedReader(new FileReader(name));
     BufferedWriter bw = new BufferedWriter(new FileWriter(name1,false));
        
     LinkedList ans=new LinkedList();
    
    N=Integer.parseInt(br.readLine());
    bw.flush();
           
    for(i=0;i<N;i++)
        {
            java.util.Arrays.fill(ar1,"");
            java.util.Arrays.fill(ar2,"");
            
            String n=String.valueOf(i+1);
           bw.append("Case #");
           bw.append(n);
           bw.append(": ");
           a1=Integer.parseInt(br.readLine());  
            for(e=0;e<a1;e++)
                pp=br.readLine();
            ar1=pp.split(" ");
            
            for(e=a1;e<4;e++)
                pp=br.readLine();
            
            a2=Integer.parseInt(br.readLine());
            
            for(e=0;e<a2;e++)
                pp=br.readLine();
            ar2=pp.split(" ");
            
             for(e=a2;e<4;e++)
                pp=br.readLine();
             
            
            ans.clear();
            int status=0;
            for(e=0;e<4;e++)
                  for(f=0;f<4;f++)
                      if(ar1[e].equals(ar2[f]))
                      {
                         ans.add(ar1[e]);
                            status++;
                      }
                      
                    if(status>1)bw.append("Bad magician!");  
                     if(status==1)
                        bw.append(String.valueOf(ans.getFirst()));
                      else if(status==0) 
                                bw.append("Volunteer cheated!");
                  
             
           bw.newLine();
          
         }
     bw.close();
    
    }
    
    
}
