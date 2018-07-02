package methodEmbedding.Magic_Trick.S.LYD266;

import java.io.*;
import java.util.*;
 class magic 
{
   public static void main(String arg[])
   {
    StringTokenizer st;
    BufferedReader br = null;
    int SelectRow1[]=new int[4];
    int SelectRow2[]=new int[4];
    String msg=null;
    int row1=0,row2=0;
		try {
 
			String line;
 
			br = new BufferedReader(new FileReader("D:\\A-small-attempt0.in"));
                        int cases = Integer.parseInt(br.readLine());
                         for(int i=1;i<=cases;i++)
                        {
                            int rowc=1;
                            int count=1;
                            int ans=0;
                            int check=0;
                        while ((line = br.readLine()) != null)
                        {   
                            st=new StringTokenizer(line);
                            if(st.countTokens()==1&&rowc==1)
                            {
                                row1= Integer.parseInt(line);
                                rowc++;
                               
                            } 
                            else if(st.countTokens()==1&&rowc==2)
                            {
                                row2= Integer.parseInt(line);
                             
                            }
             
                            if(st.countTokens()==4)
                            {   
                                if(count==row1)
                                {    
                                    int j=0;
                                    while(st.hasMoreTokens())
                                    {   
                                        SelectRow1[j]=Integer.parseInt(st.nextToken());
                                        j++;
                                    }
                               }
                                else if(count==(row2+4)&&count>4)
                                {    
                                    int j=0;
                                    while(st.hasMoreTokens())
                                    {
                                        SelectRow2[j]=Integer.parseInt(st.nextToken());
                                        j++;
                                    }
                                  
                               }
                                count++;
                          }
                            if(count==9)
                                break;
			}
                            
                        for(int j=0;j<4;j++)
                        {
                            for(int k=0;k<4;k++)
                            {
                                if(SelectRow1[j]==SelectRow2[k])
                                {
                                    ans=SelectRow1[j];
                                    check++;
                                    
                                }
                            }
                        }
                        if(check==0)
                        System.out.println("Case #"+i+": Volunteer cheated!");
                        else if(check==1)
                            System.out.println("Case #"+i+":"+ans);  
                        else if(check>1)
                                System.out.println("Case #"+i+": Bad magician!");
                }
		} 
                catch (IOException e) {
			e.printStackTrace();
		} 
    }
}
