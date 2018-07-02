package methodEmbedding.Magic_Trick.S.LYD991;

public class A extends CodeJam{
	public static void main(String args[]){	new A();	}
	
	public A(){
		super("A-small-practice.in","A-small-practice.out");
		int t=nextInt();
		nextLine();
		for(int k=1;k<=t;k++){
			//parsing
			int a1=nextInt();
			int[][] m1=new int[4][4];
			for(int i=0;i<4;i++){//rows
				for(int j=0;j<4;j++){
					m1[i][j]=nextInt();
				}
			}
			int a2=nextInt();
			int[][] m2=new int[4][4];
			for(int i=0;i<4;i++){//rows
				for(int j=0;j<4;j++){
					m2[i][j]=nextInt();
				}
			}
			//algor
			boolean[] selected=new boolean[16];
			for(int i=0;i<4;i++){
				selected[m1[a1-1][i]-1]=true;
			}
			int answer=-1;
			for(int i=0;i<4;i++){
				if(selected[m2[a2-1][i]-1]){
					if(answer==-1)
						answer=m2[a2-1][i];
					else
						answer=-2;
				}
			}
			//out
			if(answer>=0){
				print("Case #"+k+": "+answer+"\n");
			}else if(answer==-1){//no overlap a.k.a. cheat
				print("Case #"+k+": Volunteer cheated!\n");
			}else{
				print("Case #"+k+": Bad magician!\n");
			}
		}
		end();
	}
}
