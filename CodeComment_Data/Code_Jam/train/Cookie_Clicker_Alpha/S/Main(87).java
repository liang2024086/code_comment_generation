package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1001;

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(new File(args[0]));
			int nbCase=sc.nextInt();
			for (int i=1;i<=nbCase;i++){
				double c,f,x;
				c=Double.parseDouble(sc.next());
				f=Double.parseDouble(sc.next());
				x=Double.parseDouble(sc.next());
				
				double cumul=0;
				double cookiePerSecond=2;
				double bestScore=x/2;
				boolean fin=false;
				while (!fin){
					double best=cumul+x/cookiePerSecond;
					if (best>bestScore) fin=true;
					else{
						cumul+=c/cookiePerSecond;
						cookiePerSecond+=f;
						bestScore=best;
					}
						
						
				}
				
				System.out.println("Case #"+i+": "+bestScore);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
