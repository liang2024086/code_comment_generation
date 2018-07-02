package methodEmbedding.Magic_Trick.S.LYD570;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Magician {
	
	public static void main (String args[]){
		
		BufferedReader br = null;
		
	
		int j=0;
		int k=0;
		int h=0;
		
		 
		try {
 			 
			br = new BufferedReader(new FileReader("C://A-small-attempt0.in"));
 
			String line = br.readLine();
			
			for(int a= 0;a <100; a++ ){
				String []arr1 = null;
				String []arr2= null;
				int num =0;
				int result=0;
				
				 j = Integer.parseInt(br.readLine());
				
				for(int l=0;l<j;l++){
					arr1=br.readLine().split(" ");
				}
				while(j<4){
					br.readLine();
					j++;
				}
				//System.out.println("1st choice"+arr1[1]);
				
			 k = Integer.parseInt(br.readLine());
			
				for(int l=0;l<k;l++){
					arr2=br.readLine().split(" ");
				}
				while(k<4){
					br.readLine();
					k++;
				}
				 //System.out.println("2nd choice"+arr2[1]);
								
				//	System.out.println("varun"+num);	
				
				for(int m=0; m<arr1.length;m++){
					for(int n=0;n<arr2.length;n++){
						if(arr1[m].equals(arr2[n])){
							num=Integer.parseInt(arr1[m]);
							result=result+1;
						}
												
					}
				}
				
				h=a+1;
				if(result>1){
					System.out.println("Case #"+h+": Bad magician!");
					}
				else if(result==0){
					System.out.println("Case #"+h+": Volunteer cheated!");
				}
				else{
					System.out.println("Case #"+h+": "+num);
				}
			}
			
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
