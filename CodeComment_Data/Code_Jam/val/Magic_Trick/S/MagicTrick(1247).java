package methodEmbedding.Magic_Trick.S.LYD1398;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTrick {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int z=1;z<=T;z++){
			int[] numbers2 = new int[4];
			int[] numbers1 = new int[4];
			int firstTimeRowNum = Integer.parseInt(br.readLine());
 			String[] firstTimeNumbers = new String[4];
			for(int i=1;i<=4;i++){
				firstTimeNumbers = br.readLine().split(" ");
				if(i==firstTimeRowNum){
					for(int j=0;j<4;j++){
						numbers1[j]=Integer.parseInt(firstTimeNumbers[j]);
					}
				}
			}
			int secondTimeRowNum = Integer.parseInt(br.readLine());
			String[] secondTimeNumbers = new String[4];
			for(int i=1;i<=4;i++){
				secondTimeNumbers = br.readLine().split(" ");
				if(i==secondTimeRowNum){
					for(int j=0;j<4;j++){
						numbers2[j]=Integer.parseInt(secondTimeNumbers[j]);
					}
				}
			}
			int count = 0;
			int num = 0;
			for(int k=0;k<4;k++){
				if((numbers1[k]==numbers2[0])||(numbers1[k]==numbers2[1])||(numbers1[k]==numbers2[2])||(numbers1[k]==numbers2[3])){
					count++;
					num = numbers1[k];
				}
			}
			if(count==1){
				System.out.println("Case #"+z+": "+num);
			}else if(count>1){
				System.out.println("Case #"+z+": Bad magician!");
			}else if(count<1){
				System.out.println("Case #"+z+": Volunteer cheated!");
			}
		}

	}

}
