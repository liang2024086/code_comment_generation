package methodEmbedding.Magic_Trick.S.LYD2034;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;


public class program {

	public static void main(String[] args) {
		try {
			
			Scanner sc= new Scanner(new File("input.in"));
			int cases=Integer.parseInt(sc.nextLine());
			String row1[] = null,row2[]=null;
			int count;
			String answer = null;
			for(int i=0;i<cases;i++){
				count=0;
				int row=Integer.parseInt(sc.nextLine());
				for(int j=1;j<=4;j++){
					if(j==row){
						row1=sc.nextLine().split(" ");
					}
					else
						sc.nextLine();
				}
				row=Integer.parseInt(sc.nextLine());
				for(int j=1;j<=4;j++){
					if(j==row){
						row2=sc.nextLine().split(" ");
					}
					else
						sc.nextLine();
				}
				if(row1[0].equals(row2[0])&&row1[1].equals(row2[1]))
					System.out.println("Case #"+(i+1)+": Bad magician!");
				else{
					for(int k=0;k<4;k++){
						for(int l=0;l<4;l++){
							if(row1[k].equals(row2[l])){
								count++;
								answer=row1[k];							
							}
						}						
							
					}
					if(count==0)
						System.out.println("Case #"+(i+1)+": Volunteer cheated!");
					else if(count>1)
						System.out.println("Case #"+(i+1)+": Bad magician!");
					else
						System.out.println("Case #"+(i+1)+": "+answer);
						
					
					
					
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
