package methodEmbedding.Counting_Sheep.S.LYD928;

import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class CountingSheep {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("in.txt");
		BufferedReader textReader =new BufferedReader(fr);
		int num = Integer.parseInt(textReader.readLine());
		for(int k=0;k<num;k++)
		{
			int N=Integer.parseInt(textReader.readLine());
			if(N==0){
				out.printf("Case #%d: INSOMNIA%n", k+1);
				continue;
			}
			HashSet<Integer> numStore = new HashSet<Integer>();
			int count=0;
			while(numStore.size()!=10){
				count++;
				int temp=count*N;
				while(temp!=0)
				{
					numStore.add(temp%10);
					temp=temp/10;
				}
			}
				out.printf("Case #%d: %d%n", k+1,count*N); 
		}
		textReader.close();
	}

}
