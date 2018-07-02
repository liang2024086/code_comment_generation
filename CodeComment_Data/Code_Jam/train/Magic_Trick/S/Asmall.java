package methodEmbedding.Magic_Trick.S.LYD1587;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class Asmall {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
		int numTest = sc.nextInt();
		for (int i = 1; i <= numTest; i++) {
			int ary[] = new int[16];
			int firstline = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					int a = sc.nextInt();
					if(j == firstline-1)
					{
						ary[a-1]++;
					}
				}
			}
			int secondline = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					int a = sc.nextInt();
					if(j == secondline-1)
					{
						ary[a-1]++;
					}
				}
			}
			boolean many = false;
			int num = -1;
			for (int j = 0; j < ary.length; j++) {
				if(ary[j]==2)
				{
					if(many)
					{
						out.println("Case #"+i+": Bad magician!");
						num = -2;
						break;
					}
					else
					{
						many = true;
						num = j+1;
					}
				}
			}
			if(many && num>0)
			{
				out.println("Case #"+i+": "+num);
			}
			if(num == -1 &&!many)
			{
				out.println("Case #"+i+": Volunteer cheated!");
			}
		}
		out.close();
	}

}
