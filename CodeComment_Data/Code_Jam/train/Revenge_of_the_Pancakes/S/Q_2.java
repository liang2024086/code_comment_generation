package methodEmbedding.Revenge_of_the_Pancakes.S.LYD803;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("B-small-attempt0.in"));
			//Scanner sc = new  Scanner(System.in);
			FileWriter fw = new FileWriter("q2.out");
			
			int T = sc.nextInt();
			int testcase =1;
			while(T-- > 0 )
			{
				
				String p = sc.next();
				char[] pc = p.toCharArray();
				int n = 0;
				int size = pc.length;
				int i =0 ;
				if(pc[i] == '-')
					n = 1;
				
				while(i!= size){
					for(;i<size; i++)
						if(pc[i] =='+')
							break;
					for(;i<size; i++)
						if(pc[i] == '-')
						{
							n += 2;
							break;
						}
				}
				fw.write("Case #"+testcase+": "+n+"\n");
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
