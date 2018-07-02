package methodEmbedding.Speaking_in_Tongues.S.LYD991;

/*Input
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv

5-15
10-21
16-18
13-12

Output
Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up*/
import java.io.*;
import java.util.*;
public class googlerese {
	public static void main(String[] args){
		try{
			File in = new File("A-small-attempt4.in");
			BufferedReader br = new BufferedReader(new FileReader(in));
			int[] hash = new int[26];
			hash[0] = 24;hash[1]=7;hash[2]=4;hash[3]=18;hash[4]=14;hash[5]=2;hash[6]=21;
			hash[7] = 23;hash[8]=3;hash[9]=20;hash[10]=8;hash[11]=6;hash[12]=11;hash[13]=1;
			hash[14] = 10;hash[15]=17;hash[16]=25;hash[17]=19;hash[18]=13;hash[19]=22;hash[20]=9;
			hash[21] = 15;hash[22]=5;hash[23]=12;hash[24]=0;hash[25]=16;
			int cases = Integer.parseInt(br.readLine());
			for(int i=1;i<=cases;i++){
				String temp = br.readLine();
				//System.out.println(temp);
				Scanner sc = new Scanner(temp);
				String Output=new String();
				while(sc.hasNext()){
					String temp1 = sc.next();
					for(int j=0;j<temp1.length();j++){
						Output = Output+(char)(hash[temp1.charAt(j)-97]+97); 
					}Output = Output+" ";
				}
				System.out.println("Case #"+i+": "+Output);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
