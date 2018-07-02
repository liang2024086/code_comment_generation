package methodEmbedding.Magic_Trick.S.LYD837;


/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MajicTrick {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int t = Integer.parseInt(br.readLine());
			while(t>0){
				int a1 = Integer.parseInt(br.readLine());
				int a[][] = new int[4][4];
				for(int i=0;i<4;i++){
					String str[] = br.readLine().split(" ");
					for(int j=0;j<4;j++){
						a[i][j] = Integer.parseInt(str[j]);
					}
 				}
				int b1 = Integer.parseInt(br.readLine());
				int b[][] = new int[4][4];
				for(int i=0;i<4;i++){
					String str[] = br.readLine().split(" ");
					for(int j=0;j<4;j++){
						b[i][j] = Integer.parseInt(str[j]);
					}
 				}
				int count=0,num=0;
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						if(a[a1-1][i] == b[b1-1][j]){
							count++;
							num = a[a1-1][i];
						}
					}
				}
				if(count==1){
					pw.println("Case #"+t+": "+num);
				}
				else if(count>1){
					pw.println("Case #"+t+": Bad magician!");
				}
				else{
					pw.println("Case #"+t+": Volunteer cheated!");
				}
				t--;
			}
			pw.flush();
		}
		catch(IOException e){
			e.getMessage();
		}
	}
}*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MajicTrick {
	public static void main(String[] args){
		try{
			int type = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int t = Integer.parseInt(br.readLine());
			while(t>0){
				int a1 = Integer.parseInt(br.readLine());
				int a[] = new int[4];
				for(int i=0;i<4;i++){
					String str[] = br.readLine().split(" ");
					if(i==(a1-1)){
						for(int j=0;j<4;j++){
							a[j] = Integer.parseInt(str[j]);
						}
					}
 				}
				int count=0,num=0;
				int b1 = Integer.parseInt(br.readLine());
				int b[] = new int[4];
				for(int i=0;i<4;i++){
					String str[] = br.readLine().split(" ");
					if(i==(b1-1)){
						for(int j=0;j<4;j++){
							b[j] = Integer.parseInt(str[j]);
							for(int k=0;k<4;k++){
								if(b[j]==a[k]){
									count++;
									num=a[k];
								}
							}
						}
					}
 				}
				if(count==1){
					pw.println("Case #"+(type+1)+": "+num);
				}
				else if(count>1){
					pw.println("Case #"+(type+1)+": Bad magician!");
				}
				else{
					pw.println("Case #"+(type+1)+": Volunteer cheated!");
				}
				t--;
				type++;
			}
			pw.flush();
		}
		catch(IOException e){
			e.getMessage();
		}
	}
}
