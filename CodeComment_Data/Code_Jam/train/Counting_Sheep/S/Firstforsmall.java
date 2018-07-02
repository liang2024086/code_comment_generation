package methodEmbedding.Counting_Sheep.S.LYD1002;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by DB on 09-04-2016.
 */
public class Firstforsmall
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int counter = 0,i=0,r,counter2=1;
        boolean result =false;
        int no;
        int number[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int outcome[] = {0,1,2,3,4,5,6,7,8,9};
        try
        {
            File file =new File("c:\\A-small-attempt1.in");
            if(file.exists())
            {
                FileInputStream fr = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fr));
                String fread;
                while((fread = br.readLine())!=null)
                {
                    if(counter == 0)
                    {
                    }
                    else
                    {
                        no =Integer.parseInt(fread);
                        int x = no;
                        while(result!=true)
                        {
                            int temp = x;
                            if(temp == 0 )
                            {
                                break;
                            }
                            else {
                                while (temp > 0) {
                                    r = temp % 10;
                                    temp = temp / 10;
                                    if (number[r] != r) {
                                        number[r] = r;
                                    }
                                }
                            }
                            if(Arrays.equals(number,outcome)==true)
                            {
                                result = true;
                                break;
                            }
                            else {
                                counter2++;
                                x = no * counter2;
                                result = false;
                            }
                        }
                        counter2=1;
                        result = false;
                        File file1 = new File("c:\\A-small-2.out");
                        if(!(file1.exists()))
                        {
                            file1.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file1.getAbsoluteFile(),true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw);
                        if(x == 0) {
                            System.out.println("Case #"+counter+": INSOMNIA");
                            bw.write("Case #"+counter+": INSOMNIA"+"\n");
                        }
                        else
                        {
                            System.out.println("Case # : "+x);
                            bw.write("Case #"+counter+": "+x + "\n");
                        }

                        bw.close();
                        i++;
                    }
                    for(int j =0;j<10;j++)
                    {
                        number[j]=-1;
                    }
                    counter++;
                }
            }
        }
        catch (Exception e) {
        }
    }
}
