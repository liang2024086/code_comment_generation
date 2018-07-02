package methodEmbedding.Magic_Trick.S.LYD1307;

import java.util.Scanner;


public class magician {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_of_testcase=0,first_ans,Second_ans,flag=0,compare_array[]={0,0,0,0},match_count=0,finalnumber=0;
		int array[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int final_array[]={0,0,0,0};
		 Scanner a = new Scanner(System.in);
		 number_of_testcase = a.nextInt();
		 for(int j=0;j<number_of_testcase;j++)
		 {match_count=0;
			 first_ans = a.nextInt();
		 for(int i=0;i<4;i++)
		 {
			 for(int k=0;k<4;k++)
			 {
				 array[i][k]=a.nextInt();
			 }
		 }
		 
			 for(int k=0;k<4;k++)
			 {
				final_array[k]=array[first_ans-1][k];
			 }
			 Second_ans=a.nextInt();
			 for(int i=0;i<4;i++)
			 {
				 for(int k=0;k<4;k++)
				 {
					 array[i][k]=a.nextInt();
					 if(i==(Second_ans-1))
						 compare_array[k]=array[i][k];
				 }
			 }
			 for(int k=0;k<4;k++)
			 {
				for(int l=0;l<4;l++)
				{
					if(final_array[k]==compare_array[l])
					{
						match_count++;
						finalnumber=final_array[k];
					}
				}
			 }
			 System.out.print("Case #"+(j+1)+": ");
			 if(match_count>1)
			 System.out.println("Bad magician!");
			 if(match_count==1)
				 System.out.println(finalnumber);
			 if(match_count==0)
				 System.out.println("Volunteer cheated!");
		 
		 }
	}

}
