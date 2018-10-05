package methodEmbedding.Standing_Ovation.S.LYD1132;

import java.io.*;
public class opera
{
    public static void main(String[] args)
    {
        int count=1,peoplecount,minFriends;
        String Pop="",bt,str="";//charcterwise string conversion
        File inputFile=new File("E:\\GCJ\\Opera\\in.txt");
        File outputFile=new File("E:\\GCJ\\Opera\\out.txt");
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
            if(Integer.parseInt(br.readLine())<=100)
            {
            while((str=br.readLine())!=null)
            {
                Pop=str.split(" ")[1];
                minFriends=0;
                peoplecount=0;
                for(int i=0;i<Pop.length();i++)
                {
                    bt=Pop.charAt(i)+"";

                    if(peoplecount>=i||Integer.valueOf(bt)==0)
                    {
                        peoplecount+=Integer.valueOf(bt);
                    }
                    else
                    {
                        minFriends+=Math.abs(i-peoplecount);
                        peoplecount+=Integer.valueOf(bt)+minFriends;
                    }
                }
                
                if(count!=1)
                    bw.newLine();
                str="Case #"+ count +": "+minFriends;
                count++;
                bw.append(str);
            }
            bw.close();
            writer.close();
            reader.close();
            br.close();
            }
        }
        catch(IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        }
    }
