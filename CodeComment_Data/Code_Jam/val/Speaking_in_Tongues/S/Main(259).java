package methodEmbedding.Speaking_in_Tongues.S.LYD286;


public class Main {
	public static void main(String[] args) throws java.io.FileNotFoundException,java.io.IOException{
		java.io.BufferedReader bRead=new java.io.BufferedReader(new java.io.FileReader("F:\\A-small-attempt0.in"));
		java.io.BufferedWriter bWrite=new java.io.BufferedWriter(new java.io.FileWriter("F:\\A-small-attempt0.out"));
		StringBuffer output=new StringBuffer();
		//Mapping obtained from  the given sample Input
		char[] replace={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int noCases=Integer.parseInt(bRead.readLine());
		for(int i=0;i<noCases;i++){
			char[] curLine=bRead.readLine().toCharArray();
			for(int j=0;j<curLine.length;j++)if(curLine[j]!=' ')curLine[j]=replace[curLine[j]-'a'];
			output.append("Case #"+(i+1)+": "+new String(curLine)+"\n");
		}
		bWrite.write(output.toString());
		bWrite.close();bRead.close();
	}
}
