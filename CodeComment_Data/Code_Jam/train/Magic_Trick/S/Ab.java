package methodEmbedding.Magic_Trick.S.LYD1181;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ab{
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
		int fInp =0;
		int [][] firstFlip = new int [4][4];	
		int sInp =0;
		int [][] secFlip = new int [4][4];
		for(int i=0;i<n;i++)
		{
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fInp=Integer.parseInt(s);
			fInp--;
			s1=null;
			for(int j=0;j<4;j++){
				try {
					s1 = br.readLine().split(" ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int k=0;k<4;k++){	
					firstFlip[j][k] = Integer.parseInt(s1[k]);
				}	
			}
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sInp=Integer.parseInt(s);
			sInp--;
			s1=null;
			for(int j=0;j<4;j++){
				try {
					s1 = br.readLine().split(" ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int k=0;k<4;k++){	
					secFlip[j][k] = Integer.parseInt(s1[k]);
				}	
			}
			int counter =0;
			int output=0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){	
					if (firstFlip[fInp][j] == secFlip[sInp][k])
					{
						output=firstFlip[fInp][j];
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
