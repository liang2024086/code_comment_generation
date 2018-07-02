package methodEmbedding.Revenge_of_the_Pancakes.S.LYD514;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class RevengePancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.setOut(new PrintStream("src/output.out"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Scanner in=null;
		try{
			in=new Scanner(new File("src/B-small-attempt0.in"));
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		int T = in.nextInt();
		for(int i=0;i<T;i++){
			String str = in.next();
			boolean positive = true;
			int s=0;
			if(str.charAt(0)=='+') {
				 positive=true;
			}else {
				s=1;
				positive=false;
			}
			for(int j=1;j<str.length();j++){
				if(str.charAt(j)=='-' && positive==true){
					s+=2;
					positive=false;
				}
				if(str.charAt(j)=='+' && positive==false){
					positive=true;
				}
			}
			System.out.println("Case #"+(i+1)+": "+s);
		}

	}

}
