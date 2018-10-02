package methodEmbedding.Magic_Trick.S.LYD1118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MagicTrick {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length>0)
			try {
				System.setIn(new FileInputStream(args[0]));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int iCase=1;iCase<=T;iCase++){
			int a1=in.nextInt();
			int c1[]=new int[16];
			for(int i=0;i<16;i++) c1[i]=in.nextInt();
			int a2=in.nextInt();
			int c2[]=new int[16];
			for(int i=0;i<16;i++) c2[i]=in.nextInt();
			int sol=0;
			String ans;
			try{
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						if(c1[(a1-1)*4+i]==c2[(a2-1)*4+j]){
							if(sol!=0) throw new Exception("Bad magician!");
							sol=c1[(a1-1)*4+i];
						}
					}
				}
				if(sol==0) throw new Exception("Volunteer cheated!");
				ans=Integer.toString(sol);
			}catch(Exception e){
				ans=e.getMessage();
			}
			System.out.println("Case #" + iCase + ": " + ans);
		}
	}

}
