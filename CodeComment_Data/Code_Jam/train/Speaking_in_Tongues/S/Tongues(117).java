package methodEmbedding.Speaking_in_Tongues.S.LYD756;


import java.util.Scanner;

import com.google.util.FileUtil;

public class Tongues {
	/**
	 * @param args
	 */
	private static char[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgFilePath = "E:\\Google_Jam\\Tongue\\A-small-attempt0.in";
		char space =' ';
		
		MapUtils mapUtils = new MapUtils();
		map = mapUtils.getMap();
		Scanner scanner = FileUtil.openFile(orgFilePath);
		StringBuilder sb = new StringBuilder();

		int caseNum = Integer.valueOf(scanner.nextLine());
		for(int i=0;i<caseNum;i++){
			sb.append("Case #" + (i + 1) + ": ");
			String line = scanner.nextLine();
			for(int j=0;j<line.length();j++){
				char a = line.charAt(j);
				if(a==space) {
					sb.append(a);
					continue;
				}
				int k ;
				for(k=0;k<map[1].length&& a!= map[1][k];k++);
				//System.out.println("A:"+a+"K:"+k+"J:"+j);
				sb.append(map[0][k]);
			}
			sb.append("\n");
		}
		FileUtil.writeFile(sb, "Tongue\\small.in");
	}

}
