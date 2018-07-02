package methodEmbedding.Speaking_in_Tongues.S.LYD1200;

import java.io.*;

public class Lang
{
public static void main(String args[])
{
try{
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(input.readLine());
int test = 1, i;
String[] str = new String[30];
char[] googl = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
char[] eng = {' ','y','h', 'e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',};
while (test <= n ) {
	String s = input.readLine();
	String result = "";
	for(i = 0 ; i < s.length() ; i++){
		char t = s.charAt(i);
		for(int j = 0 ; j < googl.length ; j++){
			if(t == googl[j]){
				result = result + eng[j];
				break;
				}
		}
	}
	str[test-1] = result;
	test++;
	}
for(i = 1 ; i <= n ; i++)
	System.out.println("Case #" +i+": "+str[i-1]);
}
catch(Exception e){};
}
}
