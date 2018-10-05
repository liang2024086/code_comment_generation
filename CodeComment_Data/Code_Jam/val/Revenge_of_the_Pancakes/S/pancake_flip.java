package methodEmbedding.Revenge_of_the_Pancakes.S.LYD341;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pancake_flip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:/hacker_cup//in.txt");
		Scanner sc= new Scanner(file);
//		Scanner sc= new Scanner(System.in);
		FileWriter fw = new FileWriter("D:/hacker_cup//out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String input=null;
		int i,j,parts,len,num,res; char s,f;
		num=Integer.valueOf(sc.nextLine());
		for(i=1;i<=num;i++){
			input=sc.nextLine();
			len=input.length();
			parts=1;
			if(len>1){
				for(j=1;j<len;j++){
					if(input.charAt(j)!=input.charAt(j-1))parts++;
				}
			}
			s=input.charAt(0);
			f=input.charAt(len-1);
			if(s=='-' && f=='+') res=parts-1;
			else if(s=='-' && f=='-') res=parts;
			else if(s=='+' && f=='+') res=parts-1;
			else  res=parts;
			
			System.out.println(String.format("Case #%d: %d", i,res));
			bw.write(String.format("Case #%d: %d", i,res));
			bw.newLine();
		}
		bw.close();
	}

}
