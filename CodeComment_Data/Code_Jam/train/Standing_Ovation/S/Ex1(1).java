package methodEmbedding.Standing_Ovation.S.LYD1269;


import java.io.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new FileReader("C:\\Users\\User\\Downloads\\A-small-attempt2.in"));
		int t=Integer.parseInt(in.readLine());
		for(int c=1;c<=t;c++){
			String line=in.readLine();
			String[] parts=line.split(" ");
			int counter=Integer.parseInt(parts[0]);
			String line2=parts[1];
			int[] s=new int[parts[1].length()];
			for(int i=0;i<line2.length();i++){
				s[i]=Integer.parseInt(line2.substring(i, i+1));
			}
			int index=0,friends=0,add=0;
			if(counter==0){
				friends=0;
			 }
			else{
				int i=0;
				while(index<counter){
					if(s[i]!=0){
						if(i==0 || i<=index)
							index += s[i];
						else{
							add = i-index;
							friends += add;
							index += add+s[i];
						}
					}
					i++;
				}
			}
			System.out.println("Case #"+c+": "+friends);
			
		}

	}

}
