package methodEmbedding.Magic_Trick.S.LYD1854;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Magic_Trick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:/vibhu eclipse workspace/Google_code_jam/src/A-small-attempt0.in")); 
		File file = new File("C:/vibhu eclipse workspace/Google_code_jam/src/magic_trick.out");
	      // creates the file
	     // file.createNewFile();
	      // creates a FileWriter Object
	      PrintWriter printer = new PrintWriter(file);
	      int T,ans1,ans2;
	      int[][] arr1=new int[4][4];
	      int[][] arr2=new int[4][4];
	      T=Integer.parseInt(sc.nextLine());
			
			for(int i=0;i<T;i++){
				
				//System.out.println("T="+T);
			ans1=Integer.parseInt(sc.nextLine());
			for(int j=0;j<4;j++){
				String s1=sc.nextLine();
				String[] numbers = s1.split(" ");
				//int space=s1.indexOf(" ");
				for(int k=0;k<4;k++){
					
					arr1[j][k]=Integer.parseInt(numbers[k]);
					
				}
			}
			ans2=Integer.parseInt(sc.nextLine());
			for(int j=0;j<4;j++){
				String s1=sc.nextLine();
				String[] numbers = s1.split(" ");
				//int space=s1.indexOf(" ");
				for(int k=0;k<4;k++){
					arr2[j][k]=Integer.parseInt(numbers[k]);
				}
			}
		
			int temp=0,count=0;
			for(int p=0;p<4;p++){
				for(int q=0;q<4;q++){
				if(arr1[ans1-1][p]==arr2[ans2-1][q]){
					temp=arr1[ans1-1][p];
					count++;
					
				}
			}
			}
				System.out.println("T="+count);
				if(count>1){
					//System.out.println("Bad Magician!");
					printer.write("Case #"+(i+1)+": Bad magician!\n");
				}
				else if(count==0){
					printer.write("Case #"+(i+1)+": Volunteer cheated!\n");
				}
				else if(count==1){
					printer.write("Case #"+(i+1)+": "+temp+"\n");
				}
				
				printer.flush();
			
			//B=Integer.parseInt(s.substring(s.indexOf(" ")+1));
			
			
			}

	}

}
