package methodEmbedding.Counting_Sheep.S.LYD60;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws FileNotFoundException {
File file = new File("C:/Users/nishant-bhavesh/Desktop/alice/result.txt");
PrintWriter br=new PrintWriter(file);
Scanner scanner = new Scanner(new File("C:/Users/nishant-bhavesh/Desktop/alice/input.txt"));
int cases=scanner.nextInt();  //read cases
for(int j=1;j<=cases;j++)
{
String str="0123456789";
int num=scanner.nextInt();
int i = 0;
if(num!=0)
{
int k=1;
while(str.length()!=0)
{
i=num*k;
String s=String.valueOf(i);
int counter=0;
while((s.trim().length()-counter)!=0)
{

if(str.contains(String.valueOf(s.charAt(counter))))
		{
	
	str=str.replaceAll(String.valueOf(s.charAt(counter)),"");
		}
counter++;
}         //end of while inner
k++;
}         //end of while outer

br.println("Case #"+j+": "+i);

}           //end of if
else
{
	
	br.println("Case #"+j+": INSOMNIA");
}

	}       //end of for
scanner.close();
br.close();
}
}
