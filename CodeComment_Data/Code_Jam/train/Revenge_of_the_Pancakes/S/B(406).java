package methodEmbedding.Revenge_of_the_Pancakes.S.LYD414;

import java.util.*;
import java.io.*;
import java.math.*;

public class B{


	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileReader("Bs.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("Bs.txt"));
        int T = sc.nextInt();
        for (int caseNum=0; caseNum<T; caseNum++) {
            System.out.println("Processing test case " + (caseNum + 1));
            
			pw.print("Case #" + (caseNum+1) + ": ");
			String N = sc.next();
			int ans = 0;
		//pw.println("N=" + N + " : ");
			
			int inversionCount = 0;
			if(N.equals("+")){inversionCount = 0;}
			if(N.equals("-")){inversionCount = 1;}
			else if(N.charAt(N.length()-1)=='-'){inversionCount++;}
			for(int i = N.length()-1; i>0; i--){
				char focus = N.charAt(i);
				if(focus!=N.charAt(i-1)){
					inversionCount++;
					
				}
				
				
			}
			System.out.println("N="+N+" inv="+inversionCount);
			pw.println(inversionCount);
			
	/*		String list = "0123456789";
			
			if(N==0){
				pw.println("INSOMNIA");
				continue;
			}
			int step = 0;
			while(list.length()>0){
			step++;
				ans+=N;
				String nString = String.valueOf(ans);
				for(int i = 0; i<nString.length() && list.length()>0; i++){
					String deleter = "" + nString.charAt(i);
					list = list.replace(deleter, "");
				}
				
			}
			System.out.println(" step=" + step);
			pw.println(ans);
	*/		
            
        }
        pw.flush();
        pw.close();
        sc.close();
    }
}
