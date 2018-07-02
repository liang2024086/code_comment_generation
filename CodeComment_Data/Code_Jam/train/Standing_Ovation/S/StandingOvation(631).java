package methodEmbedding.Standing_Ovation.S.LYD1574;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader fis = new BufferedReader(new FileReader("A-small-attempt2.in"),1);
		BufferedWriter fos= new BufferedWriter(new FileWriter("A-small-attempt2.out"));
		int tests = Integer.parseInt(fis.readLine());
	//	System.out.println(tests);
		for(int i = 0 ; i < tests; i++)
		{
			String testcase  = fis.readLine();
			int pre = testcase.indexOf(" ");
			int smax = Integer.parseInt(testcase.substring(0, pre));
			int sumFr = 0;
			int sumAud = 0;
			int friends = 0;
			
			for(int j = 0; j<=smax; j++)
			{
				int aud=Integer.parseInt(testcase.charAt((pre+1)+j)+"");
				
				if(sumAud>=j && aud!=0){
					sumAud+=aud;
				}
				else if(sumAud<j && aud!=0)
				{
					sumFr+=(j-sumAud);
					sumAud+=aud+(j-sumAud);
				}
				
				
			}
			fos.write("Case #"+(i+1)+": "+sumFr+"\n");
			//System.out.println("Case #"+(i+1)+": "+sumFr);
		}
		fos.close();
		fis.close();
	}
	
}
