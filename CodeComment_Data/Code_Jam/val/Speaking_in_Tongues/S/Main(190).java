package methodEmbedding.Speaking_in_Tongues.S.LYD951;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class Main {

	public static void main(String[] arg) throws FileNotFoundException
	{
	Scanner scan =new Scanner(System.in);
	Formatter form=new Formatter("ex6.txt");
	int t=scan.nextInt();
	Methode met=new Methode();
	String[] str =new String[t];
	String[] string =new String[t];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<t;i++)
	{   
		String s=sc.nextLine();
		str[i]=s;
		string[i]=met.decodage(str[i]);
	}
	for(int j=0;j<t;j++)
	{
		int k=j+1;
			
		form.format("Case #"+k+":"+" "+string[j]+"\n");
	}
	form.close();
	}
}
