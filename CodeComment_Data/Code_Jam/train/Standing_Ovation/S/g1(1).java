package methodEmbedding.Standing_Ovation.S.LYD2042;

import java.io.*;

class g1 {
	public static void main(String[] args) {
		File file = new File("/Users/menghua/Downloads/A-small-attempt0.in.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			int T = Integer.parseInt(reader.readLine());
//			System.out.println(T);
			int caseNumber=0;
			while(caseNumber<T){
				caseNumber++;
				String tempString = reader.readLine();
				String[] line = tempString.split(" ");
				int Smax = Integer.valueOf(line[0]);
//				System.out.print(Smax + " ");
				int[] Ss = new int[line[1].length()];
				for(int i=0;i<line[1].length();i++)
				{
					Ss[i]=Integer.parseInt(line[1].substring(i, i+1));
//					System.out.print(Ss[i]+" ");
				}
//				System.out.println(" ");
				
				/***/
				int standP=Ss[0];
				int min=0;
				for(int i=1;i<=Smax;i++)
				{
					if (Ss[i]>0) {
						if(standP>=i){
							standP=standP+Ss[i];
						}else{
							min=min+i-standP;
							standP=i+Ss[i];
						}
					}
				}
				System.out.println("Case #"+caseNumber+": "+min);
				/***/
			}
		} catch (Exception e) {
			
		}
	}
}
