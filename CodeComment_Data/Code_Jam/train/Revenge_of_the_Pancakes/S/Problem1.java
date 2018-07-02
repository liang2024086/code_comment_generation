package methodEmbedding.Revenge_of_the_Pancakes.S.LYD13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem1 {
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("Problem1.txt");
		Scanner inp=new Scanner(file);
		int cases=inp.nextInt();
		StringBuilder t=new StringBuilder();
		String []n=new String[cases];
		for (int i=0;i<cases;i++){
			n[i]=inp.next();
		}
		for (int j=0;j<cases;j++){
			int count=0;
			char temp=n[j].charAt(0);
			int index=0;
			while(n[j].contains("-")){
				if (temp=='-'){
					index=n[j].indexOf('+');
					
					if (index<0){
						n[j]=n[j].replaceAll("-", "+");
					}
					else
					{
						t=new StringBuilder(n[j]);
						t.replace(0, index, (n[j].substring(0, index)).replace('-', '+'));
					n[j]=t.toString();
					}
				}
				else{
					index=n[j].indexOf('-');
						t=new StringBuilder(n[j]);
						t.replace(0, index, (n[j].substring(0, index)).replace('+', '-'));
				
					n[j]=t.toString();
					
				}
				temp=n[j].charAt(0);
				count++;
			}
			
		System.out.println("Case #"+(j+1)+": "+count);
		}
	}

}
