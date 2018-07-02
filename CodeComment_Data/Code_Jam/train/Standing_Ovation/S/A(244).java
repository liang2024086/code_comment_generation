package methodEmbedding.Standing_Ovation.S.LYD1387;


import static util.FileUtil.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class A {

	public static void main(String[] args) {
		try {
			BufferedReader br=newFileReader("E:\\codejam2015\\A-small-attempt0.in");
			BufferedWriter bw=newFileWriter("E:\\codejam2015\\A-small.out");
		    Integer N=readInteger(br);
			for (Integer i = 0; i < N; i++) {
				String string=br.readLine();
				String[] ss=string.split(" ");
				Integer n=Integer.parseInt(ss[0]);
				Integer count=0;
				Integer total=0;
				for (int j = 0; j < ss[1].length(); j++) {
					Integer a=Integer.parseInt(ss[1].substring(j, j+1));
					total=total+a-1;
					if(total<0){
						count=count+(-total);
						total=0;
					}
				}
				bw.write("Case #"+i+": "+count+"\r\n");
			}
			bw.flush();
			br.close();
			bw.close();
			System.out.println("Succeed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
