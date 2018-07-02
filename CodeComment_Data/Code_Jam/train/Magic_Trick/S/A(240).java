package methodEmbedding.Magic_Trick.S.LYD1196;


import static util.FileUtil.newFileReader;
import static util.FileUtil.newFileWriter;
import static util.FileUtil.readInteger;
import static util.FileUtil.readIntegers;
import static util.FileUtil.skipLine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

public class A {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br=newFileReader("E:\\code jam\\A-small-attempt0.in");
			BufferedWriter bw=newFileWriter("E:\\code jam\\small.out");
		    Integer N=readInteger(br);
			for (Integer i = 0; i < N; i++) {
				Integer line=readInteger(br);
				Integer[] cards=readIntegers(br, line-1);
				Integer line2=readInteger(br, 4-line);
				Integer[] cards2=readIntegers(br,line2-1);
				skipLine(br, 4-line2);
				List<Integer>list=Arrays.asList(cards);
				List<Integer>list2=Arrays.asList(cards2);
				int count=0;
				Integer rightcard=0;
				for (Integer c : list2) {
					if(list.contains(c)){count++;rightcard=c;}
				}
				switch (count) {
				case 0:
					bw.write("Case #"+i+": Volunteer cheated!\r\n");
					break;
				case 1:
					bw.write("Case #"+i+": "+rightcard+"\r\n");
					break;
				default:
					bw.write("Case #"+i+": Bad magician!\r\n");
					break;
				}
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
