package methodEmbedding.Magic_Trick.S.LYD1174;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class magictrick {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner c = new Scanner(new FileReader("Magic-Trick-small.in"));
		int t = c.nextInt();
		
		for(int i=0;i<t;i++) {
			int ans1 = c.nextInt();
			int[] arr1 = new int[4];
			for(int j=0;j<ans1;j++) 
				c.nextLine();
			for(int j=0;j<4;j++) 
				arr1[j] = c.nextInt();
			for(int j=ans1;j<=4;j++) 
				c.nextLine();
			
			int ans2 = c.nextInt();
			int[] arr2 = new int[4];
			for(int j=0;j<ans2;j++) 
				c.nextLine();
			for(int j=0;j<4;j++) 
				arr2[j] = c.nextInt();
			for(int j=ans2;j<=4;j++) 
				c.nextLine();
			
		//	System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]);
		//	System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]);
			
			int nans=0;
			int ans=0;
			
			for(int x=0;x<4;x++) {
				for(int y=0;y<4;y++) {
					if(arr2[y]==arr1[x]) {
						nans++;
						ans = arr2[y];
					}
				}
			}
			
			if(nans==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(nans>1)
				System.out.println("Case #"+(i+1)+": Bad magician!");
			else
				System.out.println("Case #"+(i+1)+": "+ans);
			
		}
		
		c.close();
	}

}
