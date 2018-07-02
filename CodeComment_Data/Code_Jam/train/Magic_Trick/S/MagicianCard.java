package methodEmbedding.Magic_Trick.S.LYD1595;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
public class MagicianCard {
	
	
 

	public static void main (String [] args) throws NumberFormatException, IOException 
	{
		BufferedReader reader = null;
		
		int Pattern1[][]=new int[4][4];
		int Pattern2[][]=new int[4][4];
		int Choice1=0;
		int Choice2=0;
		int TestCase=0;
		int counter1=0;
		int counter2=0;
		int counter3=0;
		int counter4=0;
		int totalloop=0;
		int flag=0;
		int match=0;
		String content =null;
		try{
			reader=new BufferedReader(new FileReader("R:\\A-small-attempt0.in"));
			
		   }
		
		catch(Exception e){}
		
		TestCase=Integer.parseInt((reader.readLine()));
		
		for(totalloop=0;totalloop<TestCase;totalloop++)
		{
		Choice1=Integer.parseInt((reader.readLine()));
		for(counter1=0;counter1<4;counter1++)
		{
			String[] k =(reader.readLine().split(" "));
			for(counter2=0;counter2<4;counter2++)
			{
			    Pattern1[counter1][counter2]=Integer.parseInt(k[(counter2)]);
			    //System.out.println(Pattern1[counter1][counter2]);
								
			}
		}
		
		Choice2=Integer.parseInt((reader.readLine()));
		for(counter1=0;counter1<4;counter1++)
		{
			String[] k1 =(reader.readLine().split(" "));
			for(counter2=0;counter2<4;counter2++)
			{
			    Pattern2[counter1][counter2]=Integer.parseInt(k1[(counter2)]);
			    //System.out.println(Pattern2[counter1][counter2]);
								
			}
		}
		
		for(counter3=0;counter3<4;counter3++)
		{
			for(counter4=0;counter4<4;counter4++)
			{
			if(Pattern1[(Choice1-1)][counter3]==Pattern2[(Choice2-1)][counter4])
			{   match=Pattern1[(Choice1-1)][counter3];
				flag++;
			}
			}
		}
		
		if(flag==1)
		{
			System.out.println("Case #"+(totalloop+1)+": "+match);
			content = "Case #"+(totalloop+1)+":";
			content= content+" "+match;
		}
		if(flag>1)
		{
			System.out.println("Case #"+(totalloop+1)+": Bad magician!");
			content = "Case #"+(totalloop+1)+": Bad magician!";
		}
		if(flag==0)
		{
			System.out.println("Case #"+(totalloop+1)+": Volunteer cheated!");
			content = "Case #"+(totalloop+1)+": Volunteer cheated!";
		}
        		
		flag=0;
		match=0;
		//
		try {
			 
			
 
			File file = new File("R:\\TestOut1.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.newLine();
			bw.close();
 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//
		
		
		}
		
	}
}
		
		
	
    

