package methodEmbedding.Standing_Ovation.S.LYD27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Stand {
	public static void main(String args[]) throws IOException{
		int t;
		int c=1;
		int j,max,sum,count,i;
		int s[];
		
		File f1 = new File("A-small-attempt0.txt");
		Scanner sc = new Scanner(f1);
		
		File f2 = new File("out.txt");
		FileWriter wr = new FileWriter(f2);
		
		
		t=sc.nextInt();
		
		
		while(t!=0){
			max=sc.nextInt();
			String str =sc.nextLine();
			s = new int[max+1];
			sum=0;
			count = 0;
			i=0;
			j=1;
			
			
			while(j<str.length() && str.charAt(j)!=' ')
				s[i++]=Character.getNumericValue(str.charAt(j++));
			
			for(i=0;i<=max;i++){
			
			if(i>sum)
			{
				count = count + (i-sum);
				s[i-1] = i-sum;
				sum=sum+s[i-1];
				 
			}
			sum=sum+s[i];
			}
			
			wr.write("Case #"+(c++)+": "+count+"\n");
			
			t--;
			j++;
			
		}
		wr.close();
		
		
	}

}
