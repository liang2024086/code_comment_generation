package methodEmbedding.Speaking_in_Tongues.S.LYD66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class googlers {
public static void main(String[] args) throws IOException {
	String input="";
	String output="";
	String s="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	String srp="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	
	char [] array=new char[120];
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' ')
		array[(int)s.charAt(i)-97]=srp.charAt(i);
	}
	array[(int)'z'-97]='q';
	array[(int)'q'-97]='z';
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String x=reader.readLine();
	String result="";
	long size=Long.parseLong(x);
	for(int j=0;j<size;j++){
	input=reader.readLine();
	output="";
	for(int i=0;i<input.length();i++){
		if(input.charAt(i)==' '){
			output+=" ";
		}else{
			output+=array[input.charAt(i)-97];
		}
	}
	result+="Case #"+(j+1)+": "+output+"\n";
	}
	System.out.println(result);
}

}
