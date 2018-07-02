package methodEmbedding.Standing_Ovation.S.LYD865;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner ism = new Scanner(new File("A-small-attempt0.in"));
		//Scanner ism = new Scanner(new File("in.txt"));
		FileWriter osm = new FileWriter(new File("out.txt"));
		
		int counts = ism.nextInt();
		
		for (int cnt = 0; cnt < counts; cnt++)	{
			
			int size = ism.nextInt();
			int[] audience = new int[size+1];	
			int standed = 0;
			int called = 0;
			int summon = 0;
			
			String buffer = ism.nextLine();
			
			for (int i = 0; i<=size; i++)
				audience[i] = buffer.charAt(i+1) - '0';
			
			for (int k = 0; k<=size; k++)	{
				if (k>summon || (audience[k]==0 && k>=summon))	{
					called += k+1-summon;
					summon += k+1-summon;
				}	else {
					summon += audience[k];
					standed += audience[k];
				}
			}
			
			osm.write("Case #"+ (cnt+1) +": "+((called>0)?called:0)+"\n");
		}
	
		osm.close();
	}

}
