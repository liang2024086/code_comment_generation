package methodEmbedding.Revenge_of_the_Pancakes.S.LYD789;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File(args[0]));
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			String data = sc.next();
			int c = 0;
			for(int j=data.length()-1;j>=0;j--) {
				if(data.charAt(j) == '+') continue;
				String t = "";
				for(int k=0;k<=j;k++) {
					if(data.charAt(k) == '+') t += '-';
					if(data.charAt(k) == '-') t += '+';
				}
				t += data.substring(j+1);
				data = t;
				c++;
			}
			System.out.println("Case #"+(i+1)+": "+c);
		}
	}

}
