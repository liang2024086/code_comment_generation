package methodEmbedding.Counting_Sheep.S.LYD345;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep {
	
	public static void main(String[] args){
		
		boolean[] digits = new boolean[10];
		boolean all;
		boolean insomnia=false;
		int i,j,k,c;
		int T;
		int n,m;
		String N="";
		
		try{
			File input=new File("C:\\Users\\mgsir\\workspace\\CodeJam\\src\\input.txt");
			PrintWriter writer = 
					new PrintWriter("C:\\Users\\mgsir\\workspace\\CodeJam\\src\\output.txt", "UTF-8");
			Scanner scan=new Scanner(new FileInputStream(input));
			T=Integer.parseInt(scan.nextLine());
			for (i=0;i<T;i++){
				N=scan.nextLine();
				n=Integer.parseInt(N);
				if (n==0) insomnia=true;
				else insomnia=false;
				m=n;
				for (j=0;j<10;j++) digits[j]=false;
				all=false;
				k=1;
				while ((insomnia==false) && (all==false)){
					N=String.valueOf(m);
					for (j=0;j<N.length();j++)
						digits[Integer.parseInt(String.valueOf(N.charAt(j)))]=true;
					all=true;
					for (j=0;j<10;j++){
						if (digits[j]==false)
							all=false;
					}
					k=k+1;
					m=n*k;
				}
				if (k==1) m=n;
				else m=n*(k-1);
				c=i+1;
				if (insomnia==true) writer.println("Case #"+c+": INSOMNIA");
				else writer.println("Case #"+c+": "+m);
			}
			writer.close();
		} catch (IOException e1){
			e1.printStackTrace();
		} 
		
	}

}
