package methodEmbedding.Counting_Sheep.S.LYD994;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class problemA {

	public static void main(String[] arv) throws FileNotFoundException{
		
		
		Scanner in=new Scanner(new File("inputA.txt"));
		PrintWriter out =new PrintWriter(new FileOutputStream("outputA.txt"));
		int N = Integer.parseInt(in.nextLine());
		
		for(int line=0; line<N; line++){
			
			int b = Integer.parseInt(in.nextLine());
			
			if( b==0 ){
				out.println("Case #"+(line+1)+": INSOMNIA");
				continue;
			}
			
			boolean[] digits = new boolean[10];
			
			int count=0;
			do {
				
				count +=b;
				
				String s=""+count;
				for(int i=0; i<s.length(); i++){
					digits[Integer.parseInt(""+s.charAt(i))]=true;
				}
			} while (!digits[0] || !digits[1] || !digits[2] || !digits[3] || !digits[4] || !digits[5] || !digits[6] || !digits[7] || !digits[8] || !digits[9]);
			
			out.println("Case #"+(line+1)+": "+count);
				
		}
		in.close();out.close();
	}
}
