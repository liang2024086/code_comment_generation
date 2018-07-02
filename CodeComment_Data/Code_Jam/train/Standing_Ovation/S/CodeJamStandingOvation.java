package methodEmbedding.Standing_Ovation.S.LYD1900;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CodeJamStandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("D:/newfile.txt");
		FileOutputStream fop =null;
		
		//BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br  = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\A-small-attempt11.in"));
			fop = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			System.out.println("File not found exception");
			e1.printStackTrace();
		}

		
		List<Integer> items = new  ArrayList<Integer>();
	    String sCurrentLine;
	    Integer testCase = 0;
	    Integer smax;
	    String inString;
	    try {
	    	//no of test case
	    	if (!file.exists()) {
				file.createNewFile();
			}
	    	if((sCurrentLine = br.readLine()) != null)
	    	{
	    		testCase = Integer.parseInt(sCurrentLine);
	    	}
	    	else
	    	{
	    		System.out.println("File is empty");
	    		System.exit(0);
	    	}
			//while ((sCurrentLine = br.readLine()) != null) {
				
				//System.out.println(sCurrentLine);
				int seqLen = 0;
				int standingUP = 0;
				int pplNeeded = 0;
				String output = "Case #";
				
				for(int i = 1;i<=testCase; i++)
				{
					sCurrentLine = br.readLine();
					String[] splitArray = sCurrentLine.split("\\s");
					smax = Integer.parseInt(splitArray[0]);
					String sequence  = splitArray[1];
					seqLen = 0;
					standingUP = 0;
					pplNeeded = 0;
					boolean flag = false;
					while(seqLen < sequence.length())
					{
						System.out.println("seqLen: "+seqLen);
						Integer oneSequence  = Integer.parseInt(sequence.substring(seqLen, seqLen+1));
						System.out.println("oneSequence: "+oneSequence);
						
						if(seqLen == 0)
						{
							standingUP = oneSequence;
							
						}
						if(oneSequence != 0 && standingUP <= seqLen && seqLen != 0)
						{
						if (seqLen - standingUP != 0)
						{
							flag= true;
							pplNeeded = pplNeeded+seqLen - standingUP;
						}
				//			standingUP = standingUP+oneSequence;
						
						}
						
						if (seqLen !=0  && oneSequence != 0 )
						{
						standingUP = standingUP+oneSequence;
							if(flag== true)
							{
								standingUP = standingUP+ pplNeeded;
							}
						}
						flag = false;
						seqLen++;
						System.out.println("pplNeeded: "+pplNeeded);
						System.out.println("standingUP: "+standingUP);
					}
					output = output + i +":"+" "+pplNeeded+"\n";
					fop.write(output.getBytes());
					output = "Case #";
					//fop.flush();
					System.out.println("test case: "+ i);
					System.out.println("************************");
				}
			//}
		
			fop.close();
			 
	    } catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	    

	}

}
