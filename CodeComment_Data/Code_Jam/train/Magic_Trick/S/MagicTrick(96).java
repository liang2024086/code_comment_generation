package methodEmbedding.Magic_Trick.S.LYD672;

/**
 * @author Amit Jacob
 *
 */
import java.io.*;
public class MagicTrick {

	/**
	 * @param args - Input File Path
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//Reading the input file:
		String path=args[0];
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		//Writing the output file:
		File fileout = new File("output.txt");
		fileout.createNewFile();
	    FileWriter writer = new FileWriter(fileout); 
	    //var declarations:
	    int ansFirstCase,ansSecondCase;
		int[][] arrFirstCase=new int[4][4];
		int[][] arrSecondCase=new int[4][4];
		String nums[];
		boolean foundMatch;
		int id=0;
		//Begin reading:
		line=br.readLine();
		int nTests = Integer.parseInt(line);
		for (int j=0;j<nTests;++j)
		{
			line=br.readLine();
			ansFirstCase=Integer.parseInt(line)-1;
			for(int i=0;i<4;++i)
			{
				line=br.readLine();
				nums=line.split(" ");
				for(int k=0;k<4;++k)
					arrFirstCase[i][k]=Integer.parseInt(nums[k]);
			}
			line=br.readLine();
			ansSecondCase=Integer.parseInt(line)-1;
			for(int i=0;i<4;++i)
			{
				line=br.readLine();
				nums=line.split(" ");
				for(int k=0;k<4;++k)
					arrSecondCase[i][k]=Integer.parseInt(nums[k]);
			}
			//Look for a match:
			foundMatch=false;
			id=0;
			for(int i=0;i<4;++i)
			{
				for(int k=0;k<4;++k)
				{
					if(arrFirstCase[ansFirstCase][i]==arrSecondCase[ansSecondCase][k])
					{
						if(!foundMatch)
						{
							foundMatch=true;
							id=i;
						}
						else
						{
							id=-1;
							break;
						}
					}
				}
				if(id==-1)
					break;
			}
			writer.write("Case #"+(j+1)+": ");
			if(id==-1)
			{
				writer.write("Bad magician!\n"); 
			}
			else if(!foundMatch)
			{
				writer.write("Volunteer cheated!\n"); 
			}
			else
			{
				writer.write(arrFirstCase[ansFirstCase][id]+"\n");
			}
		    writer.flush();
		}
		writer.close();
	}

}
