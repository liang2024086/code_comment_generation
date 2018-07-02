package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1006;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Scanner;


public class mainClass {

	public static void main(String[] args) {
		File f = new File("B-small-attempt0.in");
		File out = new File("cookieClickerAlpha.out");
		FileInputStream fin;
		Scanner sin = null;
		try {
			fin = new FileInputStream(f);
			FileWriter fout = new FileWriter(out);
			try {
				sin = new Scanner(fin);
				int numOfCases = sin.nextInt();
				for(int casenum = 0; casenum<numOfCases; casenum++)
				{
					double totalTime=0;
					boolean isntDone=true;
					double C=sin.nextDouble(), F=sin.nextDouble(), X=sin.nextDouble();
					double cps = 2;
					while(isntDone)
					{
						double timeToGetAFarm = C/cps;
						double timeToWin = X/cps;
						double timeToWinWithAnotherFarm = X/(cps+F);
						if(timeToGetAFarm+timeToWinWithAnotherFarm<timeToWin)
						{
							//worth getting another farm
							totalTime+=timeToGetAFarm;
							cps+=F;
						}
						else
						{
							totalTime+=timeToWin;
							isntDone = false;
						}
					}
					
					try {
						fout.write("Case #" + (casenum+1) + ": " + totalTime + "\n");
						fout.flush();
					} catch (IOException e1) {e1.printStackTrace();}
				}
			} finally {
				sin.close();
				fout.close();
			}
		}
		catch(IOException e)
		{}
	}
}
