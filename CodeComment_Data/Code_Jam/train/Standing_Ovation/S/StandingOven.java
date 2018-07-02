package methodEmbedding.Standing_Ovation.S.LYD3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class StandingOven{
	public static void main(String args[]) throws IOException{
		
		BufferedReader file=new BufferedReader(new FileReader("A-small-attempt0.in"));
		
		int n=Integer.parseInt(file.readLine());
		
		String cases[]=new String[n];
		for(int i=0;i<n;i++){
			cases[i]=file.readLine();
		}
		
		int[] smax=new int[n];
		String[] shyLevels=new String[n];
		
		for(int i=0;i<n;i++){
			String[] splitTemp=cases[i].split(" ");
			smax[i]=Integer.parseInt(splitTemp[0]);
			shyLevels[i]=splitTemp[1];
		}
		
		int minimumFriendsNeeded[]=new int[n];
		
		for(int i=0;i<n;i++){
			minimumFriendsNeeded[i]=0;
			int shyness[]=new int[smax[i]+1];
			int peopleStanding=Integer.parseInt(String.valueOf(shyLevels[i].charAt(0)));

			for(int k=0;k<shyness.length;k++){
				shyness[k]=k;
			}
			for(int j=1;j<shyness.length;j++){
				int value=Integer.parseInt(String.valueOf(shyLevels[i].charAt(j)));
				if(value!=0){
					if(peopleStanding<shyness[j]){
						int minFriends=(shyness[j]-peopleStanding);
						minimumFriendsNeeded[i]+=minFriends;
						peopleStanding+=minFriends;
					}
					peopleStanding+=value;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println("Case #"+(i+1)+": "+minimumFriendsNeeded[i]);
		}
	}
}
