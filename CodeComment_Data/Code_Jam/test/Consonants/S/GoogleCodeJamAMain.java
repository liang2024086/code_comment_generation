package method_all.Consonants.S.LYD98;

import java.io.*;
import java.math.*;
import java.util.*;

public class GoogleCodeJamAMain {
	public static void main(String[] args) {
		Scanner scanner = null;
		BufferedWriter bw = null;
		try{
			int numCases;
			int solutions=0;
			char[] vowels={'a','e','i','o','u'};
			ArrayList<String> foundStrings=new ArrayList<String>();
			ArrayList<String> notFoundStrings=new ArrayList<String>();
			String in;
			String consOut;
			String part;
			int n;
			int lastConsonant;
			int lastVowel;
			char current;
			boolean found;
			scanner = new Scanner(new File("small.in"));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			numCases = scanner.nextInt();
			for(int i=0;i<numCases;i++){
				solutions=0;
				foundStrings.clear();
				in=scanner.next();
				n=scanner.nextInt();
				lastConsonant=-1;
				lastVowel=-1;
				found=false;
				for(int subLen=in.length();subLen>(n-1);subLen--){
					//System.out.println(subLen);
					for(int sub=0;sub<=(in.length()-subLen);sub++){
						consOut=in.substring(sub,(sub+subLen));
						//System.out.println(subLen+ " "+sub);
						//System.out.println(consOut);
						if(subLen==in.length()){
							//System.out.println("here");
							for(int j=0;j<=(consOut.length()-n);j++){
								part=consOut.substring(j,j+n);
								//System.out.println(part+ " "+j);
								lastVowel=-1;
								for(int l=0;l<n;l++){
								current=part.charAt(l);
								for(int k=0;k<5;k++){
									if(current==vowels[k]){
										lastVowel++;
										break;
									}
								}
								}
								if(lastVowel==-1&&!foundStrings.contains(part)){
									foundStrings.add(part);
									//System.out.println("consonants: "+part);
								}
							}
						}
						//System.out.println(foundStrings);
						for(int j=0;j<foundStrings.size();j++){
							if(consOut.contains(foundStrings.get(j))){
								solutions++;
								break;
							}
						}
						//System.out.println(in.substring(sub,(sub+subLen+1)));
					}
					
				}
				//System.out.println(in+ " n: "+n);
				//System.out.println(solutions);
				bw.write("Case #"+(i+1)+": "+solutions+'\n');
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Not Found");
		}
		catch(IOException e){}
		finally{
			try{
				if(bw!=null){
					bw.flush();
					bw.close();
				}
			}
			catch(IOException e){}
		}

	}
}
