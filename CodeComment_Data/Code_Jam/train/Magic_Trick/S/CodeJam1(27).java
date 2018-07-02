package methodEmbedding.Magic_Trick.S.LYD1204;


import java.io.*;

public class CodeJam1 
{
    public static void main(String[] args) 
    {
        int i=0,j=0,k=0,temp=0,occurence=0,second=0,n1=0;
        int[] first = new int[4];
        String inputFileName = "resc/input.txt";
        String outputFileName = "resc/output.txt"; 
        try
        {
            FileReader inputFile = new FileReader(inputFileName);
            FileWriter outputFile = new FileWriter(outputFileName,false);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            BufferedWriter bufferWriter = new BufferedWriter(outputFile);
            String line;
            int n = Integer.parseInt(bufferReader.readLine());
            for( i=0; i<n ; i++)
            {
                k=0;
                n1 = Integer.parseInt(bufferReader.readLine());
                for( j=1; j<=4; j++)
                {
                    line = bufferReader.readLine();
                    if(j == n1)
                    {
                        String[] parts = line.split(" ");
                        for( String part : parts)
                        {
                            first[k++] = Integer.parseInt(part);
                        }
                    }
                }
                n1 = Integer.parseInt(bufferReader.readLine());
                for( j=1; j<=4; j++)
                {
                    occurence=0;
                    line = bufferReader.readLine();
                    if(j == n1)
                    {
                        String[] parts = line.split(" ");
                        for( String part : parts)
                        {
                            temp = Integer.parseInt(part);
                            for(k=0;k<4;k++)
                            {
                                if(temp == first[k])
                                {
                                    occurence++;
                                    second = temp;
                                }
                            }
                        }
                        if(occurence == 1)
                        {
                            bufferWriter.write("Case #"+(i+1)+": "+second);
                        }
                        else if(occurence == 0)
                        {
                            bufferWriter.write("Case #"+(i+1)+": Volunteer cheated!");
                        }
                        else
                        {
                            bufferWriter.write("Case #"+(i+1)+": Bad magician!");
                        } 
                    }
                }
                bufferWriter.newLine();
            }
            bufferReader.close();
            bufferWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Error while reading file line by line:"+ e.getMessage());                      
        }
    }
}
