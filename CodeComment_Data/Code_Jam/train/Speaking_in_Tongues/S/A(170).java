package methodEmbedding.Speaking_in_Tongues.S.LYD1114;

import java.io.*;
public class A{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T = Integer.parseInt(reader.readLine());
		for(int i=1;i<=T;i++){
			String[] input = reader.readLine().split(" ");
			String result ="";
			for(int j=0;j<input.length;j++){
				String temp = input[j];
				for(int k=0;k<temp.length();k++){
					char ch = temp.charAt(k);
					if(ch == 'a'){
						result=result+"y";
					} else if (ch == 'b'){
						result=result+"h";
					} else if (ch == 'c'){
						result=result+"e";
					} else if (ch == 'd'){
						result=result+"s";
					} else if (ch == 'e'){
						result=result+"o";
					} else if (ch == 'f'){
						result=result+"c";
					} else if (ch == 'g'){
						result=result+"v";
					} else if (ch == 'h'){
						result=result+"x";
					} else if (ch == 'i'){
						result=result+"d";
					} else if (ch == 'j'){
						result=result+"u";
					} else if (ch == 'k'){
						result=result+"i";
					} else if (ch == 'l'){
						result=result+"g";
					} else if (ch == 'm'){
						result=result+"l";
					} else if (ch == 'n'){
						result=result+"b";
					} else if (ch == 'o'){
						result=result+"k";
					} else if (ch == 'p'){
						result=result+"r";
					} else if (ch == 'q'){
						result=result+"z";
					} else if (ch == 'r'){
						result=result+"t";
					} else if (ch == 's'){
						result=result+"n";
					} else if (ch == 't'){
						result=result+"w";
					} else if (ch == 'u'){
						result=result+"j";
					} else if (ch == 'v'){
						result=result+"p";
					} else if (ch == 'w'){
						result=result+"f";
					} else if (ch == 'x'){
						result=result+"m";
					} else if (ch == 'y'){
						result=result+"a";
					} else {
						result=result+"q";
					}
				}
				if(j<input.length-1){
					result=result + " ";
				} 
			}
			if(i<T){
			System.out.println("Case #"+i+": "+result);
			} else {
			System.out.print("Case #"+i+": "+result);
			}
		}
	}
}
