package methodEmbedding.Speaking_in_Tongues.S.LYD981;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_a {
	
		public static void main(String[] args) throws Exception{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = in.readLine();
			int num = Integer.parseInt(line);
			char arr[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
			for(int i = 1; i <= num;i++){
				line = in.readLine();
				String out="";
				for(int j=0;j<line.length();j++){
					char a = line.charAt(j);
					if(a != ' '){
						out+=arr[(int)(a)-97];
					}
					else
					{
					out+=" ";
					}
				}
				System.out.println("Case #"+i+": "+out);
			}
			
			}
		}
