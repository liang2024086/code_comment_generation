package methodEmbedding.Cookie_Clicker_Alpha.S.LYD206;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cookie {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("output.txt");
		BufferedWriter writer=new BufferedWriter(fw);
		FileReader fr=new FileReader("B-small-attempt0.in");
		BufferedReader reader=new BufferedReader(fr);
		Scanner scan=null;
		
		String line=reader.readLine();
		scan=new Scanner(line);
		int n=scan.nextInt();
		
		
		for(int i=1;i<=n;i++){
			double c=1,f,x;
			int r=i;
			double total=0;
			line=reader.readLine();
			scan=new Scanner(line);
			
			String s=scan.next();
			c=Double.parseDouble(s);
			
			s=scan.next();
			f=Double.parseDouble(s);
			
			s=scan.next();
			x=Double.parseDouble(s);
			
			double prod=2;
			while(x/prod>((c/prod)+(x/(prod+f)))){
				total+=c/prod;
				prod+=f;
			}
			total+=(x/prod);
			
			writer.write("Case #"+r+": "+ total+"\n");
		}
		
		writer.close();
		reader.close();

	}

}
