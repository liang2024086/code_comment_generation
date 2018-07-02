package methodEmbedding.Magic_Trick.S.LYD217;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magic{
	static int counter=0;
	public static void main(String[] args) {
		int p,q;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s1[]=null;
		int n=Integer.parseInt(s);
		int firstInput =0;
		int [][] arr = new int [4][4];	
		int secondInput =0;
		int [][] brr = new int [4][4];
		for(int i=0;i<n;i++)
		{
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			firstInput=Integer.parseInt(s);
			firstInput--;
			s1=null;
			for(int j=0;j<4;j++){
				try {
					s1 = br.readLine().split(" ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int k=0;k<4;k++){	
					arr[j][k] = Integer.parseInt(s1[k]);
				}	
			}
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			secondInput=Integer.parseInt(s);
			secondInput--;
			s1=null;
			for(int j=0;j<4;j++){
				try {
					s1 = br.readLine().split(" ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int k=0;k<4;k++){	
					brr[j][k] = Integer.parseInt(s1[k]);
				}	
			}
			int counter =0;
			int output=0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){	
					if (arr[firstInput][j] == brr[secondInput][k])
					{
						output=arr[firstInput][j];
						counter++;
					}
				}	
			} 
			switch(counter){
			case 0: System.out.println("Case #" + (i+1) + ": " + "Volunteer cheated!"); 
			break;
			case 1: System.out.println("Case #" + (i+1) + ": " + output); 
			break;
			default: System.out.println("Case #" + (i+1) + ": " + "Bad magician!"); 
			break;
			}
		}		
	}
}
