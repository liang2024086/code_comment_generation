package methodEmbedding.Magic_Trick.S.LYD9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class A {

	public static void main(String[] args) throws Exception{
		FileReader fr= new FileReader("smallA.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw = new FileWriter("outA.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		String vec[];
		int T,i,j,k=0,guest;
		int mat1[][]=new int[4][4],mat2[][]=new int[4][4];
		int juego[]=new int[16];
		
		T=Integer.parseInt(br.readLine());
		for(i=0;i<T;i++){
			guest=Integer.parseInt(br.readLine());
			for(j=0;j<4;j++){
				vec=br.readLine().split(" ");
				for(k=0;k<4;k++){
					mat1[j][k]=Integer.parseInt(vec[k]);
					mat2[j][k]=0;
					if(j==guest-1){
						juego[mat1[j][k]-1]=1;
					}
				}
			}
			
			guest=Integer.parseInt(br.readLine());
			for(j=0;j<4;j++){
				vec=br.readLine().split(" ");
				for(k=0;k<4;k++){
					mat2[j][k]=Integer.parseInt(vec[k]);
					mat1[j][k]=0;
					if(j==guest-1){
						juego[mat2[j][k]-1]+=1;
					}
				}
			}
			guest=0;
			for(j=0;j<16;j++){
				if(juego[j]==2){
					guest++;
					k=j;
				}
				juego[j]=0;
			}
			if(guest==1)				
				pw.println("Case #"+(i+1)+": "+(k+1));
			else if(guest>1)
				pw.println("Case #"+(i+1)+": Bad magician!");
			else
				pw.println("Case #"+(i+1)+": Volunteer cheated!");			
			
		}
		br.close();
		pw.close();
	}

}
