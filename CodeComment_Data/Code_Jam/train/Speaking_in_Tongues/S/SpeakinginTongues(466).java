package methodEmbedding.Speaking_in_Tongues.S.LYD1624;


import java.net.*;
import java.io.*;
import java.lang.*;
public class SpeakinginTongues {
    public static void main(String[] args) throws IOException {
        
String goog = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
String eng = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
int len = goog.length();
char arr[] = new char[1000];
for (int i=0; i<len ; i++) {
    arr[  (int)(goog.charAt(i)) ]  = eng.charAt(i);
}

arr['z'] = 'q';
arr['q'] = 'z';
arr[' '] = ' ';
//for (int i=0; i<26 ; i++) {
 //   System.out.println( (char)(i + 'a') + ":" + arr[i] + "");
//}
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String input="", output="";
int counter =1;
while((input = in.readLine()) != null){
	int l = input.length();
	for(int i = 0; i<l; i++ ){
		output += arr[(int)input.charAt(i)];
	}
	System.out.println("Case #" + counter + ": " + output );
	counter++;
	output="";
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       


    }}
