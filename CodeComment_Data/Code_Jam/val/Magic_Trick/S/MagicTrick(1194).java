package methodEmbedding.Magic_Trick.S.LYD1396;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class MagicTrick {
	public static void main(String ar[]) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\Yash\\Desktop\\a.in")));
		String s;
		int n = Integer.parseInt(in.readLine());
		File file = new File("C:\\Users\\Yash\\Desktop\\a.out");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		for(int i=0;i<n;i++){
			s = in.readLine();

			int fc = Integer.parseInt(s) - 1;
			String[][] fm = {in.readLine().split(" "), in.readLine().split(" "), in.readLine().split(" "), in.readLine().split(" ")};
			String s2= in.readLine();

			int sc = Integer.parseInt(s2) - 1;
			String[][] sm = {in.readLine().split(" "), in.readLine().split(" "), in.readLine().split(" "), in.readLine().split(" ")};

			Hashtable<String, String> ht = new Hashtable<String, String>();
			for(String e : fm[fc]){
				ht.put(e, e);
			}
			int contains = 0;
			String ans = "";
			for(String e: sm[sc]){
				if(ht.contains(e)){
					ans = e;
					contains ++;
				}
			}
			if(contains == 1){
				bw.write("Case #"+(i+1)+": "+ans+"\n");
			}else if(contains > 1){
				bw.write("Case #"+(i+1)+": Bad magician!"+"\n");
			}else if(contains < 1){
				bw.write("Case #"+(i+1)+": Volunteer cheated!"+"\n");
			}
		}
		bw.close();
	}
}
