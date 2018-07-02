package methodEmbedding.Speaking_in_Tongues.S.LYD231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SpeakingInTongues
{
public static void main(String args[]) throws java.io.IOException{
HashMap<String,String> map = new HashMap<String,String>();
map.put("a","y");
map.put("b","h");
map.put("c","e");
map.put("d","s");
map.put("e","o");
map.put("f","c");
map.put("g","v");
map.put("h","x");
map.put("i","d");
map.put("j","u");
map.put("k","i");
map.put("l","g");
map.put("m","l");
map.put("n","b");
map.put("o","k");
map.put("p","r");
map.put("q","z");
map.put("r","t");
map.put("s","n");
map.put("t","w");
map.put("u","j");
map.put("v","p");
map.put("w","f");
map.put("x","m");
map.put("y","a");
map.put("z","q");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
String s = br.readLine();
System.out.print("Case #" + (i+1) + ": ");
char[] a = s.toCharArray();
for(int j=0;j<a.length;j++){
if(a[j] == ' ')
System.out.print(" ");
else
System.out.print(map.get(Character.toString(a[j])));
}
System.out.println();
}
}
}
