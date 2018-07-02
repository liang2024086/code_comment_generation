package methodEmbedding.Magic_Trick.S.LYD1995;

import java.io.*;
import java.util.*;
public class codejam1
{
	public static void main (String[] argv)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int times = Integer.parseInt(br.readLine());

		for(int i=1; i<=times; i++){
			
			/* storing input*/
			int firstAns = Integer.parseInt(br.readLine());
			String firstRows[] = new String[4];
			
			for(int j=0; j<4; j++){
				firstRows[j] = br.readLine();
			}

			int secondAns = Integer.parseInt(br.readLine());
			String secondRows[] = new String[4];
			
			for(int j=0; j<4; j++){
				secondRows[j] = br.readLine();
			}

			/* split each row, string to int*/
			String firstArr[] = firstRows[firstAns-1].split(" ");
			String secondArr[] = secondRows[secondAns-1].split(" ");

			/* calc output*/
			int totalAmount = 0;
			String target = "";
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					if(firstArr[j].equals(secondArr[k])){
						totalAmount += 1;
						target = firstArr[j];
					}
				}
			}

			String outputs[] = {target, "Bad magician!", "Volunteer cheated!"};

			int ans = 0;			
			if(totalAmount<1){
				ans = 2;
			}
			else if(totalAmount>1){
				ans = 1;
			}

			System.out.println("Case #"+ i +": "+ outputs[ans]);
		}
	}
}
