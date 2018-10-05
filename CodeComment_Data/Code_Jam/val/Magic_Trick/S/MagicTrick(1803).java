package methodEmbedding.Magic_Trick.S.LYD125;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class MagicTrick {
	public static void main(String[] args) throws Exception{
		FileOutputStream fop = null;
		File file;
		BufferedReader br = new BufferedReader(new FileReader("c:\\A-small-attempt0.in"));
		try {
			file = new File("c:\\A-small-attempt0.out");
			fop = new FileOutputStream(file);
		
			final int ROW = 4;
			int testcase = Integer.parseInt(br.readLine());
			
			for(int i=0;i<testcase;i++){
				List<Integer> ans = new ArrayList<Integer>();
				List<Integer> ans1 = new ArrayList<Integer>();
				int row1 = Integer.parseInt(br.readLine());
				
				for(int j=1;j<=ROW;j++){
					String row = br.readLine();
					if(row1==j){
						String[] nums = row.split(" ");
						for(int k=0;k<nums.length;k++){
							ans1.add(Integer.parseInt(nums[k]));
						}
					}
				}
				
				int row2 = Integer.parseInt(br.readLine());
				
				for(int j=1;j<=ROW;j++){
					String row = br.readLine();
					if(row2==j){
						String[] nums = row.split(" ");
						for(int k=0;k<nums.length;k++){
							Integer num = Integer.parseInt(nums[k]);
							if(ans1.contains(num)){
								ans.add(num);
							}
						}
					}
				}
				
				String result = "";
				if(ans.size()==0){
					result = "Volunteer cheated!";
				}
				else if(ans.size()==1){
					result = ans.get(0).toString();
				}
				else{
					result = "Bad magician!";
				}
				
				String out = "Case #"+(i+1)+": "+result+"\n";
				System.out.print(out);
				byte[] contentInBytes = out.getBytes();
				fop.write(contentInBytes);
			}
		} finally {
	        br.close();
	        fop.flush();
			fop.close();
	    }
	}
}
