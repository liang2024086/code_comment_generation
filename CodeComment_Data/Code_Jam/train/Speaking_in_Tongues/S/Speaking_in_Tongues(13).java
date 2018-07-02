package methodEmbedding.Speaking_in_Tongues.S.LYD1626;

import java.io.*;
import java.util.*;

public class Speaking_in_Tongues {
     public static void main(String args[]) throws IOException{
    	 String code="ynficwlbkuomxsevzpdrjgthaq";
    	 String base="abcdefghijklmnopqrstuvwxyz";
    	 Scanner scan=new Scanner(new File("A-small-attempt1.in"));
    	 PrintWriter pw=new PrintWriter(new File("result.txt"));
    	 int caseNum=Integer.parseInt(scan.nextLine());
    	 for(int i=1;i<=caseNum;i++){
    		 String a=scan.nextLine();
    		 String result="";
    		 for(int j=0;j<a.length();j++){
    			 if(a.charAt(j)!=' '){
    				 for(int m=0;m<26;m++){
    					 if(a.charAt(j)==code.charAt(m)) result=result+base.charAt(m);
    				 }
    			 }
    			 else result=result+" ";
    		 }
    		 pw.println("Case #"+i+": "+result);
    		 System.out.println(result);
    	 }
    	 pw.flush();
    	 pw.close();
     }
}
