package methodEmbedding.Magic_Trick.S.LYD236;

import java.io.*;
class magicTrick{
	public static void main(String args[]){
		try{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int testCases=Integer.parseInt(br.readLine());
			int answers[]=new int[2];
			int arr[][]=new int[4][4];
			int arr1[][]=new int[4][4];
			int count=1;
			while(count<=testCases){
				answers[0]=Integer.parseInt(br.readLine());
				for(int i=0;i<4;i++){
					String temp=br.readLine();
					String result[]=temp.split(" ");
					for(int j=0;j<4;j++){
						arr[i][j]=Integer.parseInt(result[j]);
					}
					
				}
				answers[1]=Integer.parseInt(br.readLine());
				for(int i=0;i<4;i++){
					String temp=br.readLine();
					String result[]=temp.split(" ");
					for(int j=0;j<4;j++){
						arr1[i][j]=Integer.parseInt(result[j]);
					}
					
				}
				int counter=0;
				int match=0;
				for(int i=0;i<4;i++){
					int temp=arr[answers[0]-1][i];
					for(int j=0;j<4;j++){
						int temp1=arr1[answers[1]-1][j];
						if(temp==temp1){
							match=temp;
							counter++;
						}
					}
				}
				if(counter==0){
					System.out.println("Case #"+count+ ": Volunteer cheated!");
				}
				else if(counter==1){
					System.out.println("Case #"+count+ ": "+ match);
				}
				else if(counter > 1){
					System.out.println("Case #"+count+ ": Bad magician!");
				}
				/*System.out.println("Answer"+answers[0]);
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						System.out.print(arr[i][j]+ " ");
					}
						System.out.println();
				}
								System.out.println("Answer"+answers[1]);
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						System.out.print(arr1[i][j]+ " ");
					}
						System.out.println();
				}*/
				count++;
			}
		}
		catch(Exception ex){
		
		}
	
	}
}
