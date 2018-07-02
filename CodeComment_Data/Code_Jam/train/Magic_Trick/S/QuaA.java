package methodEmbedding.Magic_Trick.S.LYD1648;

/************************
 *                      *
 *   	 NUTJAE		    *
 *                      *
 ***********************/
import java.util.* ;
import java.io.* ;
import java.math.* ;

public class QuaA {

	public static void main(String[] args) {

		File file = new File("A-small-attempt0.in");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner reader = new Scanner(fileReader);
		
		int T = reader.nextInt();
		for(int i=0;i<T;i++){
			int[][] a = new int[4][4];
			int[][] b = new int[4][4];
			int check = 0, same = 0,rowA=0,rowB=0;
			 rowA = reader.nextInt()-1;
			 for(int j=0;j<4;j++){
					for(int k=0;k<4;k++){
						a[j][k] = reader.nextInt();
					} 
			}
			 
			rowB = reader.nextInt()-1;
			 for(int j=0;j<4;j++){
					for(int k=0;k<4;k++){
						b[j][k] = reader.nextInt();
					}
					 
			}
			
			for(int j=0;j<4;j++){
					for(int k=0;k<4;k++){
						if(a[rowA][j]==b[rowB][k]){
							same = a[rowA][j];
							check = check+1;
						}
					}
			}
			String word="error";
			if(check == 0) word = "Volunteer cheated!";
			else if(check >= 2) {
				word = "Bad magician!";
			}
			else if(check== 1) word=Integer.toString(same);
			
			System.out.println("Case #"+(i+1)+": "+ word);
			 
		 }
	       
		 
	
	}

}

/*	 for(int j=0;j<4;j++){
for(int k=0;k<4;k++){
	System.out.print(b[j][k]+" ");
}
System.out.print("\n");
}
*/
