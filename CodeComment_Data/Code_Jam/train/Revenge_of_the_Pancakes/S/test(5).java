package methodEmbedding.Revenge_of_the_Pancakes.S.LYD872;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

	
public class test {
	
	public static void main(String[] argv)throws IOException{
	BufferedReader br = new BufferedReader(new FileReader("B-small-attempt2.in"));
	PrintWriter writer = new PrintWriter("output1.out");
	String line = br.readLine();
	int T=Integer.parseInt(line);
	for(int i=0;i<T;i++){
		line = br.readLine();
		String S=line;
		String sol=""+S.charAt(0);
		int solution;
		int a;
		if(S.charAt(0)=='+'){
			a=1;
		}else{
			a=0;
		}
		for(int j=1;j<S.length();j++){
			if(S.charAt(j)=='+' && a==0){
				sol+="+";
				a++;
			}
			if(S.charAt(j)=='-' && a!=0){
				sol+="-";
				a=0;
			}
		}
		if(sol.charAt(0)=='+'){
			if(sol.charAt(sol.length()-1)=='+'){
				solution=sol.length()-1;
			}else{
				solution=sol.length();
			}
		}else{
			if(sol.charAt(sol.length()-1)=='-'){
				solution=sol.length();
			}else{
				solution=sol.length()-1;
			}
		}
		
		writer.println("Case #"+(i+1)+": "+solution);
		
}
	writer.close();
}
}
