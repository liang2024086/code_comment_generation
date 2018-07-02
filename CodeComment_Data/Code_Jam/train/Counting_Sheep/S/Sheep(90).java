package methodEmbedding.Counting_Sheep.S.LYD722;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class Sheep {
	public static void main(String[] args) {
		Scanner s = OpenFile.openToRead("A-small-attempt2.in");
		PrintWriter p = OpenFile.openToWrite("sheep.out");
		int cases = s.nextInt();
		int caseNum = 0;
		int count;
		while(caseNum < cases)
		{
			caseNum++;
			count = 0;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0; i < 10; i ++) arr.add(i);
			int integer = s.nextInt();
			if(integer == 0)
				p.println("Case #" + caseNum + ": " + "INSOMNIA");
			else
				while(arr.size() > 0)
				{
					count++;
					for(String str : ((count * integer) + "").split(""))
					{
						arr.remove((Integer)(Integer.parseInt(str)));
						//						System.out.println("Integer: " + Integer.parseInt(str));
						//System.out.println(arr.size());
					}
					if(arr.size() == 0){
						p.println("Case #" + caseNum + ": " + (count * integer));
							System.out.println("Case #" + caseNum + ": " + (count * integer));
					}
				}
		}
		p.close();
	}
}
