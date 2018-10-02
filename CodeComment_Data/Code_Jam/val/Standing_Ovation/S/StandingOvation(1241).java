package methodEmbedding.Standing_Ovation.S.LYD2216;

import java.io.*;

public class StandingOvation {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName1 = "A-small-attempt1.in";
		//String fileName2="A-smallout.txt";
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader1 = new FileReader(fileName1);
			
            BufferedReader bufferedReader1 =  new BufferedReader(fileReader1);
			
			 PrintStream out = new PrintStream(new FileOutputStream("A-small-attempt1.out"));
        System.setOut(out);
            //actual logic
			int t=Integer.parseInt(bufferedReader1.readLine());
			for(int i=0;i<t;i++)
			{
				String[] tmparr=bufferedReader1.readLine().trim().split(" ");
				
				int maxshy=Integer.parseInt(tmparr[0]);
				int []arr=new int[maxshy+1];
				for(int j=0;j<=maxshy;j++)
				{
					arr[j]=Integer.parseInt(""+tmparr[1].charAt(j));
					
				}
				int ans=0;
				int std=0;
				for(int j=0;j<=maxshy;j++)
				{
					if(arr[j]>0&&std<j)
					{	
						ans+=(j-std);
						std+=(j-std);
					}
					std+=arr[j];
				}
				System.out.println("Case #"+(i+1)+": "+ans);
				//bw.write("Case #"+(i+1)+" "+ans);
			}

            // Always close files.
            bufferedReader1.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName1 + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName1 + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
