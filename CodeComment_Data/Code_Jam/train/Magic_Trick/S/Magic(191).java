package methodEmbedding.Magic_Trick.S.LYD1863;

import java.io.File;
import java.util.Scanner;


public class Magic {

	public static void main(String [] args){
		Scanner input=null;
		int []arr1=new int[4];
		int []arr2=new int[4];
		int N;//number of test cases
		int ans1;//answer to first arrangement
		int ans2;// answer to second arrangement
		int intersection=-1;
		int match=-1;
		try{
			input=new Scanner(new File(args[0]));
			N=Integer.parseInt(input.nextLine());
			
			for(int i=0;i<N;i++){
				ans1=Integer.parseInt(input.nextLine());
				for(int j=0;j<4;j++) {
					if(j!=ans1-1)
					input.nextLine();
					else{
						String []ip=input.nextLine().split(" ");
						for(int k=0;k<4;k++) arr1[k]=Integer.parseInt(ip[k]);
					}
				}			
				ans2=Integer.parseInt(input.nextLine());
				for(int j=0;j<4;j++) {
					if(j!=ans2-1)
					input.nextLine();
					else{
						String []ip=input.nextLine().split(" ");
						for(int k=0;k<4;k++) arr2[k]=Integer.parseInt(ip[k]);
					}
				}
			
				//for(int l=0;l<4;l++)System.out.println(arr1[l]);
				//System.out.println("==========");
				//for(int l=0;l<4;l++)System.out.println(arr2[l]);
			for(int tempOut=0;tempOut<4;tempOut++){
				for(int tempIn=0;tempIn<4;tempIn++){
					if(arr1[tempOut]==arr2[tempIn]) {
						intersection++;
						match=tempOut;
					}
				}
			}
				
			if(intersection==-1){
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
			else if(intersection==0){
				System.out.println("Case #"+(i+1)+": "+arr1[match]);
			}
			else if(intersection>0){
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}
			
			intersection=-1;
			}
		}catch(Exception e){
		}		
	}
}
