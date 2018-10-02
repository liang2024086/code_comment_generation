package methodEmbedding.Standing_Ovation.S.LYD778;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		//Scanner sc = new Scanner(System.in);
		File input_file = new File("C:/Users/Sagar Viradiya/Downloads/input.in");
		BufferedReader br = new BufferedReader(new FileReader(input_file));
		int t = Integer.parseInt(br.readLine());
		String[] str;
		int shyness = 0;
		String audience_shyness;
		
		long num_of_friends,num_of_clap;
		
		for(int i=0;i<t;i++){
			
			num_of_friends = 0;
			
			str = br.readLine().split(" ");
			shyness = Integer.parseInt(str[0]);
			audience_shyness = str[1];
			
			num_of_clap = Integer.parseInt(audience_shyness.substring(0,1));
			
			for(int k=1;k<=shyness;k++){
				if(num_of_clap>0&&num_of_clap>=k){
					num_of_clap += Integer.parseInt(audience_shyness.substring(k,k+1));
					
					if(num_of_clap==k){
						num_of_friends++;
						num_of_clap++;
					}
				} else{
					num_of_clap += Integer.parseInt(audience_shyness.substring(k,k+1));
					num_of_friends++;
					num_of_clap++;
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+num_of_friends);
		}
		
		
		
	}

}
