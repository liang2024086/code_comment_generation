package methodEmbedding.Magic_Trick.S.LYD979;


import java.io.File;
import java.util.Scanner;

public class magic {

	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(new File("A-small-attempt0.in"));
			int a=Integer.parseInt(scan.nextLine());
			
			for(int i=0;i<a;i++){
				
				String str[]=new String[2];
				str[0]="";
				str[1]="";
				for(int n=0;n<2;n++){
					int j=Integer.parseInt(scan.nextLine());
					
					for(int k=0;k<4;k++){
						if(k==j-1){
							str[n]=scan.nextLine();
						}
						else{
							scan.nextLine();
						}
					}
				}
				String row1[]=str[0].split(" ");
				String row2[]=str[1].split(" ");

				
				boolean found=false;
				int count=0;
				String value="";
				
				for(int k=0;k<4;k++){
					for(int j=0;j<4;j++){
						if(row1[k].equals(row2[j])){
							found=true;
							count++;
							value=row1[k];
						}
						
					}
					if(count>1){
						break;
					}
				}
				if(!found){
					System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
				}
				else if(count>1){
					System.out.println("Case #"+(i+1)+": "+"Bad magician!");
				}
				else{
					System.out.println("Case #"+(i+1)+": "+value);
				}
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
