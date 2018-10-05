package methodEmbedding.Counting_Sheep.S.LYD727;


import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CodeJamTest1 
{
	  public static void main(String[] args)
	  {
		Scanner scanner = null; 
		try{
			scanner = new Scanner(new File("/home/govindas/Desktop/Temp/input.txt"));
		}catch(Exception exp){
			exp.printStackTrace();
		}
		int noOfCases = scanner.nextInt();
		String toMatch = "0123456789";
		String origin = "??????????";
		for(int j=0;j<noOfCases;j++){
			char[] toCharArray = origin.toCharArray();
			int takenNumber = scanner.nextInt();
			//System.out.println(takenNumber);
			for(int i=1;i<=100;i++){
				int n=takenNumber*i;
				int finalNumber= n;
				while(n>=10){
					int digit = n%10;
					toCharArray[digit]=Character.toChars(digit+48)[0];
					String nStr= ""+n;
					int size= nStr.length();
					n = Integer.parseInt(nStr.substring(0,size-1));
				}
				//System.out.println(i+";"+n);
				toCharArray[n]=Character.toChars(n+48)[0];
				//System.out.println(toCharArray);
				if(new String(toCharArray).equals(toMatch)){
					//System.out.println(finalNumber);
					System.out.println("Case #" + (j+1) + ": " + finalNumber);
					break;
				}
			}
			if(!new String(toCharArray).equals(toMatch)){
				System.out.println("Case #" + (j+1) + ": " + "INSOMNIA");
			}
		}
	  }
}
