package methodEmbedding.Magic_Trick.S.LYD1271;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrik {
	public static final String bad_magicien="Bad magician!";
	public static final String  Volunteer_cheated = "Volunteer cheated!";
	public static void main(String[] args) throws Exception { 
		String gcjProblem="A-small-attempt0";
		File fin =new File ("C:/Users/youness/Downloads/"+gcjProblem+".in"  ); 
		File fow =new File ("C:/Users/youness/Downloads/"+gcjProblem+".out"  );
		Scanner sc = new Scanner(fin);
		PrintWriter pw = new PrintWriter(fow); 
		 int caseCnt = sc.nextInt();
	        for (int caseNum=0; caseNum<caseCnt; caseNum++) {
	            pw.print("Case #" + (caseNum+1) + ": ");
	            int ans1 = sc.nextInt();
	            int[] cardTab1 = new int[4]; 
	            for(int i = 0; i<16; i++) {
	            	int card = sc.nextInt();
	            	if((i/4)+1==ans1 ) {
	            		cardTab1[i%4]=card;
	            	}
	            }
	            int ans2 = sc.nextInt();
	            int[] cardTab2 = new int[4]; 
	            for(int i = 0; i<16; i++) {
	            	int card = sc.nextInt();
	            	if((i/4)+1==ans2 ) {
	            		cardTab2[i%4]=card;
	            	}
	            }
	            
	            int matchedEntriesNumber =0;
	            int ret = 0;
	            for(int j:cardTab1) {
	            	for(int k:cardTab2){
	            		if(k==j) {
	            			ret=k;
	            			matchedEntriesNumber++;
	            		}
	            	}
	            }
	            if(matchedEntriesNumber==0)
	            	pw.println(Volunteer_cheated);
	            else if(matchedEntriesNumber>1)
	            	pw.println(bad_magicien);
	            else 
	            	pw.println(ret); 
	            pw.flush();
	            
	        } 
	        pw.close();
	        sc.close();
	}
	
}
