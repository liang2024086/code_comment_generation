package methodEmbedding.Counting_Sheep.S.LYD107;


import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		for(int i=1;i<=cases;i++){
			String have = "";
			int iNumber = in.nextInt();
			String res="INSOMNIA";
			if(iNumber == 0 )
				res = "INSOMNIA";
			else{
				boolean found=false;
				int x = 1;
				while(!found){
					int temp = iNumber*x++;
					while(temp>0){
						int digit = temp%10;
						if(!have.contains(String.valueOf(digit)))
							have+=String.valueOf(digit);
						temp/=10;
					}
					if(have.length()==10){
						found=true;
						res=String.valueOf(iNumber*--x);
					}
						
				}
			}
			System.out.println("Case #"+i+": "+res);
		}
		
		in.close();
	}

}



