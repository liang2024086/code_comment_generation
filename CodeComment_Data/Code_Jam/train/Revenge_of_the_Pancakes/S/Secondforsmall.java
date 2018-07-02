package methodEmbedding.Revenge_of_the_Pancakes.S.LYD123;

import java.io.*;

/**
 * Created by DB on 09-04-2016.
 */
public class Secondforsmall
{
    public static void main(String []args)
    {
        int count=0,countpos=0,flipcount=0,checking=0,positive;
        boolean finalresult;
        char c;
        char original[],expectedoutput[], continuussign[],result[];
        File file =new File("c:\\B-small-attempt1.in");
        finalresult = false;
        try
        {
            if(file.exists())
            {
                FileInputStream fr = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fr));
                String fread;
                while((fread = br.readLine())!=null)
                {
                    if(count == 0) {}
                    else
                    {
                        original = new char[fread.length()];
                        expectedoutput = new char[fread.length()];
                        positive=0;
                        for(int i=0;i<fread.length();i++)
                        {
                            original[i]=fread.charAt(i);
                            expectedoutput[i]='+';
                            if(original[i] == '+')
                            {
                                positive++;
                            }
                        }
                        //System.out.print(checking);
                        while (finalresult!=true)
                        {
                            for(int i =0;i<original.length-1;i++)
                            {
                                //System.out.println(original[i] + "here :" + original[i+1]);
                                if(original[i]==original[i+1])
                                {
                                    countpos++;
                                }
                                else
                                {
                                    break;
                                }
                            }
                            if(positive == original.length)
                            {
                                //System.out.println(checking + " here : " + original.length);
                               break;
                            }
                            countpos++;
                            //System.out.print(" ---> "+countpos);
                            continuussign = new char[countpos];
                            result = new char[fread.length()];
                            for(int j=0;j<countpos;j++)
                            {
                                continuussign[j] = original[j];
                            }
                            for(int j=0;j<continuussign.length;j++)
                            {
                                if(continuussign[j]=='-')
                                {
                                    continuussign[j] = '+';
                                }
                                else if(continuussign[j]=='+')
                                {
                                    continuussign[j] = '-';
                                }
                            }
                            int size = result.length;
                            for(int j = 0; j<result.length;j++)
                            {
                                if(j<=(countpos-1))
                                {
                                    result[j] = continuussign[j];
                                }
                                else
                                {
                                    result[j] = original[j];
                                }
                            }
                            for(int j =0;j<result.length;j++)
                            {
                                if(result[j]=='+')
                                {
                                    checking++;
                                    if(checking == result.length) {
                                        finalresult = true;
                                    }
                                }
                                else {
                                    finalresult = false;
                                }
                               // System.out.print(result[j]);
                            }
                            flipcount++;
                            countpos=0;
                            checking =0;
                            original = result.clone();
                        }
                        File file1 = new File("c:\\B-small2.out");
                        if(!(file1.exists()))
                        {
                            file1.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file1.getAbsoluteFile(),true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw);
                        bw.write("Case #"+count+": "+flipcount + "\n");
                        System.out.println("Total Filp : "+flipcount);
                        flipcount=0;
                        countpos=0;
                        checking=0;
                        finalresult=false;
                        bw.close();
                    }
                    count++;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
