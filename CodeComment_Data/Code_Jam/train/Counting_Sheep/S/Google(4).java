package methodEmbedding.Counting_Sheep.S.LYD121;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public class Google {
	static boolean flag =true;

	public static void main(String[] args) throws Exception {


		BufferedReader bf = new BufferedReader(new FileReader(new File("input.txt")));
		String line=null;
		int linenumer=0;
		bf.readLine();
		while((line=bf.readLine())!=null)
		{ 
		
			HashSet hs = new HashSet<>();
			linenumer= linenumer+1;
			int number =Integer.parseInt(line);
			int i=1;
			if(number==0)
			{
				System.out.println("Case #"+linenumer+":"+" "+"INSOMNIA");
				continue;
			}
			int value = 0;
			flag=true;
			while(flag)
			{
				value = (i)*number;
				int start=1;
				int iterations = String.valueOf(value).length()-1;
				for(int j =0;j<=iterations;j++)
				{
					int digit = (value/start)%10;
					hs.add(digit);
					start=start*10;
					if(hs.size()==10)
					{
						flag =false;
						hs=null;
						break;
					}

				}
				i=i+1;


			}
			System.out.println("Case #"+linenumer+":"+" "+ value);


		}
		bf.close();
	}

}
