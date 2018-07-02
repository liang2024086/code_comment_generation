package methodEmbedding.Counting_Sheep.S.LYD120;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			
			FileWriter fw = new FileWriter("q.out");
			
			int T = sc.nextInt();
			int testcase =1;
			while(T-- > 0 )
			{
				String result = "INSOMNIA";
				int base = sc.nextInt();
				int n = base;
				int x[] = new int[10];
				int count =0;
				int j = 1;
				if(n != 0)
				{
					while(true){
						String s = String.valueOf(n);
						for(int i=0; i<s.length(); i++){
							x[(int)s.charAt(i)-48]++;
							//System.out.println((int)s.charAt(i));
						}
						
						for(int i=0; i<10; i++){
							if(x[i]!=0)
								count++;
						}
						if(count == 10)
							break;
						else{
							count = 0;
							j++;
							n = base * j;
						}
					}
					fw.write("Case #"+testcase+": "+n+"\n");
				}
				else
				{
					fw.write("Case #"+testcase+": "+result+"\n");
				}
				
				System.out.println("Case #"+testcase+": "+n);
				testcase++;
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
