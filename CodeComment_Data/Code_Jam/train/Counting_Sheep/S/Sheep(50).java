package methodEmbedding.Counting_Sheep.S.LYD1106;

//
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Sheep
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("./A-small-attempt0.in"));
		int size = sc.nextInt();
		for(int i = 1; i<= size; i++)
		{
			int num = sc.nextInt();
			if(num == 0)
			{
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			int count = 1;
			int finalNum = 0;
			TreeSet<Integer> numbers = new TreeSet();
			while(numbers.size() < 10)
			{
				int curNum = num*count++;
				finalNum = curNum;
				while(curNum != 0)
				{
					numbers.add(curNum%10);
					curNum=curNum/10;
				}
			}
			System.out.println("Case #" + i + ": " + finalNum);
		}
	}
}
