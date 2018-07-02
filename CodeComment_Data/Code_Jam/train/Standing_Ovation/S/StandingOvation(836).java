package methodEmbedding.Standing_Ovation.S.LYD749;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {


		File file= new File("A-small-attempt0.in");
		Scanner in = new Scanner(file);
		in.nextLine();
		int sum=0;
		int f=0;
		int temp=0;
		int j=1;
		while(in.hasNextLine())
		{
			String str=in.nextLine().substring(2);
		for (int i=0;i<str.length();i++){
				
			
			if(sum<i){
				temp=i-sum;
				f+=temp;
				
			}
			
			sum+=(str.charAt(i)-48)+temp;
			temp=0;
			
		}
		
		System.out.println("case #"+j+": "+f);
		j++;
		
		f=0;
		sum=0;
	}
		in.close();

}
}
