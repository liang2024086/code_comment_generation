package methodEmbedding.Counting_Sheep.S.LYD713;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CountingSheepSmall {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(new File("D:\\Work\\Workplace\\GoogleCodeJam\\src\\A-small-attempt3.in"));
		Scanner s=new  Scanner(System.in);
		int T=s.nextInt();
		int k=1;
		while(T>0)
		{	
		int n=s.nextInt();
		 boolean[] arr=new boolean[]{false,false,false,false,false,false,false,false,false,false};
		 int temp=0;
		 int result=0;
		 int i=1;
		 while(!arr[0]||!arr[1]||!arr[2]||!arr[3]||!arr[4]||!arr[5]||!arr[6]||!arr[7]||!arr[8]||!arr[9])
		 {
			 
			 temp=i*n;
			 result=temp;
			 if(temp==0)
			 {
				 System.out.println("Case #"+k+": "+"INSOMNIA");
				 break;
			 }
			 while(temp!=0)
			 {
				 arr[temp%10]=true;
				 temp=temp/10;
			 }
			 i++;
		 }
		 if(result!=0)
			 System.out.println("Case #"+k+": "+result);
		 T--;
		 k++;
		
		}
	}

}
