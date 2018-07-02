package methodEmbedding.Counting_Sheep.S.LYD776;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
		PrintStream out = new PrintStream(new File("A-small-attempt2.out"));
		int testCase = sc.nextInt();
		// System.out.println("TCNUM = " + testCase);
		for(int i=0; i<testCase; i++)
		{
			String inpWrd = sc.next();
			Boolean  isInsomnia = false;
			//System.out.println("inputed line = " + inpWrd);
			short[] ansTable = new short[10];
			for(int j=0; j<10; j++)
				ansTable[j] = 0;
			Set<Byte> ansSet = new HashSet<>();
			BigInteger bg = new BigInteger(inpWrd);
			
			Integer multi = 1;
			BigInteger temp;
			while(true)
			{
				//Thread.sleep(1000);
				temp = bg.multiply(new BigInteger(multi.toString()));
				//System.out.println("multied num = " + temp);
				//System.out.println("multi = " + multi);
				//System.out.println("set = " + ansSet.toString());
				byte[] inpByte = temp.toString().getBytes();
				// System.out.println("Byte length = " + inpByte.length);
				for(int j=0; j<inpByte.length; j++)
					ansSet.add(inpByte[j]);
				if(ansSet.size() == 10)
					break;
				if(multi >= 1000)
				{
					isInsomnia = true;
					break;
				}
				multi ++;
			}
			if(isInsomnia == true)
			{
				out.printf("Case #%d: INSOMNIA\n", i+1);
			}
			else
			{
				out.printf("Case #%d: %d\n",i+1, temp);
			}
		}
	}
}
