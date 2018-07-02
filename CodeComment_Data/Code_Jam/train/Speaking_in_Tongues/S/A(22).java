package methodEmbedding.Speaking_in_Tongues.S.LYD637;

import java.io.*;
public class A {
	public static void main(String[]args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); 
		int x = Integer.parseInt(br.readLine());
		for(int i = 0;i<x;i++){
			String t = br.readLine();
			String g = "";
			for(int j = 0;j<t.length();j++){
				if(t.charAt(j) == 'y')g+='a';
				if(t.charAt(j) == 'n')g+='b';
				if(t.charAt(j) == 'f')g+='c';
				if(t.charAt(j) == 'i')g+='d';
				if(t.charAt(j) == 'c')g+='e';
				if(t.charAt(j) == 'w')g+='f';
				if(t.charAt(j) == 'l')g+='g';
				if(t.charAt(j) == 'b')g+='h';
				if(t.charAt(j) == 'k')g+='i';
				if(t.charAt(j) == 'u')g+='j';
				if(t.charAt(j) == 'o')g+='k';
				if(t.charAt(j) == 'm')g+='l';
				if(t.charAt(j) == 'x')g+='m';
				if(t.charAt(j) == 's')g+='n';
				if(t.charAt(j) == 'e')g+='o';
				if(t.charAt(j) == 'v')g+='p';
				if(t.charAt(j) == 'z')g+='q';
				if(t.charAt(j) == 'p')g+='r';
				if(t.charAt(j) == 'd')g+='s';
				if(t.charAt(j) == 'r')g+='t';
				if(t.charAt(j) == 'j')g+='u';
				if(t.charAt(j) == 'g')g+='v';
				if(t.charAt(j) == 't')g+='w';
				if(t.charAt(j) == 'h')g+='x';
				if(t.charAt(j) == 'a')g+='y';
				if(t.charAt(j) == 'q')g+='z';
				if(t.charAt(j) == ' ')g+=' ';
			}
			System.out.println("Case #"+(i+1)+": "+g);
		}
	}
}
