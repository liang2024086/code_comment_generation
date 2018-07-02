package methodEmbedding.Magic_Trick.S.LYD1767;


import java.io.*;
import java.util.*;

public class Magictricks {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(new BufferedReader(new InputStreamReader (new FileInputStream("CodeJam2014/magictricks/testin.in"))));
		//Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter ou=new PrintWriter(new FileWriter("CodeJam2014/magictricks/testout.out"));
		int rep,res,i,j,ans,c,num;
		int[][] card=new int[5][5];
		boolean[] vis=new boolean[20];
		String out="";
		
		res=sc.nextInt();
		for(rep=1;rep<=res;rep++){
			
			ans=sc.nextInt();
			for(i=1;i<=4;i++)
				for(j=1;j<=4;j++) card[i][j]=sc.nextInt();
			
			Arrays.fill(vis, false);
			for(i=1;i<=4;i++) vis[card[ans][i]]=true;
			
			ans=sc.nextInt();
			for(i=1;i<=4;i++)
				for(j=1;j<=4;j++) card[i][j]=sc.nextInt();
			c=0; num=0;
			for(i=1;i<=4;i++)
			if (vis[card[ans][i]]) {
				c++;
				if (c==1) num=card[ans][i];
				else break;
			}
			
			out+="Case #"+Integer.toString(rep)+": ";
			if (c==1) out+=Integer.toString(num);
			else if (c==0) out+="Volunteer cheated!";
			else out+="Bad magician!";
			if (res!=rep) out+="\n";
			//System.out.println(out);
			//System.out.println(rep);
		}
		System.out.println(out);
//(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("CodeJam2014/magictricks/testout.out"), "utf-8"))).write(out);
		ou.print(out);
		ou.close();
	}

}
