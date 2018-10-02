package methodEmbedding.Magic_Trick.S.LYD540;


import com.kunlong.util.FileUtil;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileUtil fuRead = new FileUtil(".//data//A-small-attempt6.in","r");
		FileUtil fuWrite = new FileUtil(".//data//A-small-attempt6.out","w");
		int T = Integer.parseInt(fuRead.getNextLine());
		for(int i=0;i<T;i++){
			//System.out.println(i);
			String temp = fuRead.getNextLine();
			if(temp ==null)break;
			int n = Integer.parseInt(temp);
			int matrix1[][] = new int[4][4];
			int matrix2[][] = new int[4][4];
			for(int t =0 ;t<4;t++){
				String line[] = fuRead.getNextLine().split(" ");
				for(int k=0;k<line.length;k++){
					matrix1[t][k] = Integer.parseInt(line[k]);
				}
			}
			int m = Integer.parseInt(fuRead.getNextLine());
			for(int t =0 ;t<4;t++){
				String line[] = fuRead.getNextLine().split(" ");
				for(int k=0;k<line.length;k++){
					matrix2[t][k] = Integer.parseInt(line[k]);
				}
			}
			int count = 0;
			int result = 0;
			for(int t=0;t<4;t++){
				for(int k=0;k<4;k++){
					if(matrix1[n-1][t]==matrix2[m-1][k]){
						result=matrix1[n-1][t];
						count++;
						break;
					}
				}
			}
			if(count==0){
				fuWrite.saveNextToFile("Case #"+(i+1)+": Volunteer cheated!\n");
			}else if(count==1){
				fuWrite.saveNextToFile("Case #"+(i+1)+": "+result+"\n");
			}else{
				fuWrite.saveNextToFile("Case #"+(i+1)+": Bad magician!\n");
			}
		}
		fuRead.close();
		fuWrite.close();

	}

}
