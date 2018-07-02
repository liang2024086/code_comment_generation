package methodEmbedding.Magic_Trick.S.LYD872;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.EOFException;
 
/* Name of the class has to be "Main" only if the class is public. */
public class A
{
	public static void main (String[] args)
	{
		String location = "C:\\Users\\research2\\Desktop\\";
		DataOutputStream dos = null;
		Scanner scanner = null;
		PrintStream ps = null;
		try{
			scanner = new Scanner(new File(location + "A-small-attempt2.in"));
			
			dos = new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File(location + "output.txt")
						)						
					)
				);
			ps = new PrintStream(dos);
			int tryCount;
			int firstAnswer, secondAnswer;
			int[] firstArray = new int[16];
			int[] secondArray = new int[16];
			
			tryCount = scanner.nextInt();
			for(int totalLoop=0; totalLoop<tryCount; totalLoop++){
				firstAnswer = scanner.nextInt();
				for(int loop=0; loop<16; loop++){
					firstArray[loop] = scanner.nextInt();
				}
				secondAnswer = scanner.nextInt();
				for(int loop=0; loop<16; loop++){
					secondArray[loop] = scanner.nextInt();
				}
				
				int answerCount = 0;
				int answerNumber = 0;
				for(int loopA=0; loopA<4; loopA++){
					for(int loopB=0; loopB<4; loopB++){
						if(firstArray[(firstAnswer-1)*4+loopA] ==
								secondArray[(secondAnswer-1)*4+loopB]){
							answerCount++;
							answerNumber = firstArray[(firstAnswer-1)*4+loopA];
						}
					}
				}
				dos.writeBytes("Case #" + (totalLoop+1) + ": ");
				if(answerCount == 0)
					dos.writeBytes("Volunteer cheated!");
				else if(answerCount > 1){
					dos.writeBytes("Bad magician!");
				}
				else{
					dos.writeBytes(Integer.toString(answerNumber));
				}
				ps.println();
			}
			dos.close();			
		}
		catch(EOFException eofe){
			// End Of File
		}
		catch(IOException ioe){
			//..
		}
		/*
		catch(FileNotFoundException fnfe){
			System.out.println("File not found");
		}
		*/
		
		
	}
}
