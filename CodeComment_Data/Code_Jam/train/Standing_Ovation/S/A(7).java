package methodEmbedding.Standing_Ovation.S.LYD341;

import java.io.*;
import java.util.*;
class A{
  public static void main(String[] args)throws IOException{
	FileReader input=new FileReader("A-small-attempt1 (1).in");
    BufferedReader br=new BufferedReader(input);
    PrintWriter out=new PrintWriter("A-small-output.in");
    int t=Integer.parseInt(br.readLine());
    for(int j=1;j<=t;j++){
		 String str[]=br.readLine().split(" ");
		 int n=0,m=0,min=0;
		 for(int i=0;i<str[1].length();i++){
		    m=Character.getNumericValue(str[1].charAt(i));
            if(m!=0 && i<=n){
				n+=m;
				}
			if(m!=0 && i>n){
				min=min+(i-n);
				n+=min+m;

				}
		  }
		  out.println("Case #"+j+": "+min);
		}
		out.close();
  }
}
