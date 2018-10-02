package methodEmbedding.Counting_Sheep.S.LYD1211;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class CountingSheep {
	
	public static void main(String[] args) throws IOException{
			File file = new File("C:\\Users\\Ratheesh\\Desktop\\Test");
				file = file.listFiles()[0];
				File outF = new File("C:\\Users\\Ratheesh\\Desktop\\out.txt");
				BufferedWriter out = Files.newBufferedWriter(outF.toPath());
				BufferedReader in = Files.newBufferedReader(file.toPath());
				int testCases = Integer.parseInt(in.readLine());
				int i=0,input;
				while(in.ready()){
					input=Integer.parseInt(in.readLine());
					if(input==0){
						out.write("Case #" + (i+1) + ": INSOMNIA\n");
						i++;
						continue;
					}
					int[] map = {0,0,0,0,0,0,0,0,0,0};
					int currNum = 0;
					while(map[0]*map[1]*map[2]*map[3]*map[4]*map[5]*map[6]*map[7]*map[8]*map[9]!=1){
						currNum+=input;
						int curr = currNum;
						while(curr!=0){
							map[curr%10]=1;
							curr = curr/10;
						}
					}
					out.write("Case #" + (i+1) + ": " + currNum + "\n");
					i++;
				}
				out.close();
	}
}
