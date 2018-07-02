package methodEmbedding.Magic_Trick.S.LYD815;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class MAGIC_TRICK {
static int a[][],b[][];
static boolean flag1,flag2;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedReader bf=new BufferedReader(new FileReader("C:/Users/Austin/Downloads/A-small.in"));
int t=Integer.parseInt(bf.readLine());
File f=new File("C:/Users/Austin/Desktop/OUTPUT.txt");
FileWriter fw = new FileWriter(f.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);

StringBuilder sb=new StringBuilder();
int cas=1;
 while(t-->0){
	int row1=Integer.parseInt(bf.readLine());
	row1--;
	a=new int[4][4];
	b=new int[4][4];

	for(int i=0;i<4;i++){
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int j=0;
		while(st.hasMoreElements()){
			a[i][j++]=Integer.parseInt(st.nextToken());
		}
	}
	int row2=Integer.parseInt(bf.readLine());
	row2--;
	for(int i=0;i<4;i++){
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int j=0;
		while(st.hasMoreElements()){
			b[i][j++]=Integer.parseInt(st.nextToken());
		}
	}
	int k=0,ans=0;flag1=flag2=false;
	for(int i=row1;i<=row1;k++){
		if(k==4)break;
		int x=a[i][k];
		for(int j=0;j<4;j++){
			int y=b[row2][j];
			if(x==y){
				if(!flag1){
				flag1=true;
				ans=x;
				}
				else {
					flag2=true;
					break;
					
				}
			}
			}
		if(flag2)
			break;
	}
	if(flag1 && !flag2)
		sb.append("Case #"+cas+": "+ans).append("\n");
	else if(flag1 && flag2)
		sb.append("Case #"+cas+": Bad magician!").append("\n");

	else sb.append("Case #"+cas+": Volunteer cheated!").append("\n");
	cas++;
}
 bw.write(sb.toString());
 bw.close();
 bf.close();
	//System.out.println(sb);
	}

}
