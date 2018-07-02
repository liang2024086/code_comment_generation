package methodEmbedding.Speaking_in_Tongues.S.LYD453;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class SpeakingInTongues_1A_QualGCJ12 {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("E:\\Code\\Algorithmz\\src\\myFiles\\A-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Code\\Algorithmz\\src\\myFiles\\A-small-attempt0.out"));
			String googlerString="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv zq";
			String englishString="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up qz";
			/*String alphabets="abcdefghijklmnopqrstuvwxyz";
			for(int charIndex=0,strLen=alphabets.length();charIndex<strLen;charIndex++)
				if(googlerString.indexOf(alphabets.charAt(charIndex))!=-1)
					System.out.print(""+alphabets.charAt(charIndex)+" -->"+englishString.charAt(googlerString.indexOf(alphabets.charAt(charIndex)))+"\n");
				else 
					System.out.println(""+alphabets.charAt(charIndex)+" has no index"); */
			int T=Integer.parseInt(br.readLine());
			for(int currTest=1;currTest<=T;currTest++){
				String currentGoogleString = br.readLine();
				String currentEnglishString="";
				for(int charIndex=0,strLen=currentGoogleString.length();charIndex<strLen;charIndex++)
					currentEnglishString+=englishString.charAt(googlerString.indexOf(currentGoogleString.charAt(charIndex)));
				bw.write("Case #"+(currTest)+": " +  currentEnglishString+"\n");
			}
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.err.println("Done");
	}
}
