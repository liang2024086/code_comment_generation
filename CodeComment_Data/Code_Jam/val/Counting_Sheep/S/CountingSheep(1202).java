package methodEmbedding.Counting_Sheep.S.LYD1090;


import java.io.*;
import java.util.*;

public class CountingSheep
{
    public static void main(String[] args)
    {
        File inputFile=new File("C:\\Users\\Aviral\\Documents\\NetBeansProjects\\CountingSheep\\in.txt");
        File outputFile=new File("C:\\Users\\Aviral\\Documents\\NetBeansProjects\\CountingSheep\\out.txt");
        FileWriter writer;
        BufferedReader br;
        BufferedWriter bw;
        FileReader reader;
        try
        {
            reader=new FileReader(inputFile);
            br=new BufferedReader(reader);
            writer=new FileWriter(outputFile);
            bw=new BufferedWriter(writer);
            int countCase=1;
            int i=Integer.parseInt(br.readLine());
            while(countCase<=i)
            {
                //System.out.println();
                //System.out.println("Case no="+countCase);
                ArrayList al=new ArrayList();
                int N=Integer.parseInt(br.readLine());
                //System.out.println("Input="+N);                
                int count=2;
                if(N==0)
                {
                    bw.append("Case #"+countCase+": INSOMNIA\n");
                    countCase++;
                    continue;
                }
                String str=String.valueOf(N);
               while(al.size()<10)
                {
                    for(int j=0;j<str.length();j++)
                    {
                        //System.out.println("str="+str);
                        if(al.contains(str.charAt(j))==false)
                        {
                            //System.out.print("Size="+al.size());
                            //for(int k=0;k<al.size();k++)
                              //  System.out.print(al.get(k)+"  ");
                            //System.out.println();
                            //System.out.print(str.charAt(j)+",");
                            al.add(str.charAt(j));
                            if(al.size()==10)
                            {
                                //System.out.println("size="+al.size());
                                bw.append("Case #"+countCase+": "+str+"\n");
                                //System.out.println("Case "+countCase+": "+str+"\n");
                                //bw.write(str);
                                break;
                            }
                            
                        }
                        else
                            if(al.size()==10)
                            {
                                //System.out.println("size="+al.size());
                                bw.append("Case "+countCase+": "+str+"\n");
                                //System.out.println("Case "+countCase+": "+str+"\n");
                                //bw.write(str);
                                break;
                            }
                    }
                    int N1;
                    N1=count*N;
                    str=String.valueOf(N1);
                    count++;
                }
                    countCase++;
            }
            bw.close();
            writer.close();
            reader.close();
            br.close();
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());
        }

    }
}
