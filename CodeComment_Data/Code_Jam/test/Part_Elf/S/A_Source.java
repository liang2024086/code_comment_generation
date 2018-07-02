package method_new_test.Part_Elf.S.LYD13;

import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class A_Source{
public static void main(String[] args){
	try{
		FileReader fr = new FileReader("A-small-attempt0.in");			//A-small-attempt0.in
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw =new FileWriter("A_output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		double value = Math.pow(2,40);
		long high = (long)value;
		int T = Integer.parseInt(br.readLine());
		int i;
		for(int x=0;x<T;x++){
			i=0;	
			StringTokenizer st = new StringTokenizer(br.readLine(),"/");
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			for(i=0;i<40;i++){
			p=p*2;
			if(p>q) break;
			if(p==q) {q=1;break;}
			}
			String str="Case #"+(x+1)+": ";
			bw.write(str);
			if((i==40)||((high%q)!=0))			
			bw.write("impossible");
			else
			bw.write(String.valueOf(i+1));
			bw.newLine();			
		}
		bw.flush();
		bw.close();
		}catch(Exception e){e.printStackTrace();}
	}
}	
