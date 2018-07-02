package methodEmbedding.Counting_Sheep.S.LYD1356;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Counting_sheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i,num,count;
		boolean cond_fill=true;
		boolean[] flag=new boolean[10];
		long a,temp,dim;
		File file = new File("D:/hacker_cup//in.txt");
		Scanner sc= new Scanner(file);
//		Scanner sc= new Scanner(System.in);
		FileWriter fw = new FileWriter("D:/hacker_cup//out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		num=sc.nextInt();
		count=0;
		while(++count<=num){
			a=sc.nextLong();
			if(a==0){
				System.out.println(String.format("Case #%d: ",count) +"INSOMNIA");
				bw.write(String.format("Case #%d: ",count) +"INSOMNIA");
				bw.newLine();
				continue;
			}
			temp=0;
			Arrays.fill(flag, false);
			while(true){
				temp+=a; dim=temp;
				while(dim>0){
					if(!flag[(int)dim%10]) flag[(int)dim%10]=true;
					dim=dim/10;
				}
				cond_fill=true;
				for(i=0;i<10;i++){
					if(!flag[i]) {
						cond_fill=false;break;
						}
					}
				if(cond_fill) {
					System.out.println(String.format("Case #%d: ",count)+temp);
					 bw.write(String.format("Case #%d: ",count)+temp);
						bw.newLine();
					break;
					}
				}
			}
		bw.close();
		}
	}

