package methodEmbedding.Magic_Trick.S.LYD1344;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CodeJam {

    
    public static void main(String[] args) throws IOException {
        int noOfTimes;
        int round_1,round_2;
        try{
        FileReader f = new FileReader("Inputs.txt"); 
                BufferedReader fr =new BufferedReader(f); 

                noOfTimes= Integer.parseInt(fr.readLine());
                for(int i=0;i<noOfTimes;i++)
                {
                    int ary1[][]=new int[4][4];
                    int ary2[][]=new int[4][4];
                    int A[]=new int[4];
                    int B[]=new int[4];
                    int answer=-1,times=0;
                    round_1=Integer.parseInt(fr.readLine());
                    for(int j=0;j<4;j++)
                    {
                        String str=fr.readLine();
                        
                        String[] a = str.split(" ");
                        
                        
                        for(int k=0;k<4;k++)
                        {
                           ary1[j][k]=Integer.parseInt(a[k]);
                            
                        }
                        
                    }
                    
                    round_2=Integer.parseInt(fr.readLine());
                    
                    for(int j=0;j<4;j++)
                    {
                        String str=fr.readLine();
                        
                        String[] a = str.split(" ");
                        
                        for(int k=0;k<4;k++)
                        {
                           ary2[j][k]=Integer.parseInt(a[k]);
                            
                        }
                        
                    }
                    
                    for(int j=0;j<4;j++)
                    {
                        A[j]=ary1[(round_1)-1][j];
                        //System.out.println(A[j]);
                        B[j]=ary2[(round_2)-1][j];
                        //System.out.println(B[j]);
                       
                        
                    }
                    
                    
                    for(int j=0;j<A.length;j++)
                    {
                        for(int k=0;k<B.length;k++)
                        {
                            if(A[j]==B[k])
                            {
                                answer=A[j];
                                times++;
                            }
                            
                        }
                    }
                    
                String ans=null;
                FileWriter fw=new FileWriter("a.txt",true);
       PrintWriter pw = new PrintWriter(fw);
                    if( times==0)
                    {
                        System.out.println("case #"+(i+1)+": Volunteer Cheated");
                        ans="Volunteer cheated!";
                    }
                    else if(times>1)
                    {
                        System.out.println("case #"+(i+1)+": Bad magician");
                        ans="Bad magician!";
                    }
                    else if( times ==1)
                    {
                        System.out.println("case #"+(i+1)+": "+answer);
                        ans=""+answer;
                    }
       pw.println("Case #"+(i+1)+": "+ans);
       //System.out.println(ans);
                
       pw.close();
       
                }
                 f.close();
       
            }catch(Exception ex) 
                {
                    System.out.println("No FIlE");
                }
        
    }
    }
                
                
               

