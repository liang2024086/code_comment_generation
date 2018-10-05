package methodEmbedding.Speaking_in_Tongues.S.LYD258;


import java.io.*;
import java.util.Scanner;;
public class speakingL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		try {
			File file = new File("A-small-attempt0.in");
			FileOutputStream out=new FileOutputStream("output.out");
			Scanner in=new Scanner(new FileReader(file) );
			int n=in.nextInt();
			in.nextLine();
			char d[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
			while (n!=0) {
				count++;
				String str=in.nextLine();
				char newstring[]=str.toCharArray();
				String str1="";
				int i=0;
				while(i<newstring.length)
				{
						char c1=newstring[i];
						if((c1-' ')!=0)
							str1=str1+d[c1-'a'];
						else
							str1=str1+c1;
						i++;
				}
				out.write(("Case #"+count+": "+str1+"\n").getBytes());
			//	System.out.println(str1);
				n--;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
