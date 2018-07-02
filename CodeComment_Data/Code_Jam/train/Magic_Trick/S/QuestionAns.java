package methodEmbedding.Magic_Trick.S.LYD1399;


import java.io.*;

public class QuestionAns
{	
	public static void main(String [] args)
	{
	        String ipFileName = "A-small-attempt1.in";
		String opFileName = "op.txt";
	        String line = null;
		int x=0;
		
	        try 
		{
	        FileReader fileReader = new FileReader(ipFileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			File f2=new File(opFileName);
			FileWriter fileWriter =new FileWriter(f2);
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			line=bufferedReader.readLine();
			int testtries=Integer.parseInt(line);
			while(x<testtries)
			{
				String common=null;
				String row1[]=new String[4];
				String row2[]=new String[4];
				String row3[]=new String[4];
				int count=0;
				line=bufferedReader.readLine();
				String rowno1=line;
				for(int i=1;i<=4;i++)
				{
					line=bufferedReader.readLine();
					if(i==Integer.parseInt(rowno1))
					{
						row1=line.split(" ");
            		}
				}
				line=bufferedReader.readLine();
				String rowno2=line;
				for(int i=1;i<=4;i++)
				{
					line=bufferedReader.readLine();
					if(i==Integer.parseInt(rowno2))
					{
						row2=line.split(" ");
            		}
				}
				for(int i=0;i<4;i++)
				{
					for(int j=0; j<4;j++)
					{
						if(row1[i].equals(row2[j]))
						{
							row3[count]=row1[i];
							count++;
						}
					}
				}
				int count2=0;
				for(int i=0;i<4;i++)
					if(row3[i]!=null)
						count2++;
				if(count2==1)
				{
					 bufferedWriter.write("Case #"+(x+1)+": "+row3[0]+"\n");
				}
				else if(count2>1)
				{
					bufferedWriter.write("Case #"+(x+1)+": Bad Magician!\n");
				}
				else
				{
					bufferedWriter.write("Case #"+(x+1)+": Volunteer Cheated!\n");
				}
				x++;
			}
			bufferedReader.close();			
			bufferedWriter.close();
			fileReader.close();
			fileWriter.close();
		}
        	catch(FileNotFoundException ex) 
		{
        		System.out.println("Unable to open file");
        		ex.printStackTrace();
        	}
	        catch(IOException ex) 
		{
			System.out.println("Error reading file");							

	 ex.printStackTrace();
        	}
    }
}
