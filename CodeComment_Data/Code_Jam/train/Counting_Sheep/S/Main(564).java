package methodEmbedding.Counting_Sheep.S.LYD1306;

import java.math.BigInteger;
import java.util.*;


public class Main {
	public static void main(String args[]){
		int digit[] = new int[10];
		BigInteger b,c;
		int flag = 0;
		String num; char a[];
		int p = 1;
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<test;i++){
			flag = 0;
			for(int s=0;s<10;s++)
				digit[s] = 0;
			b = new BigInteger(sc.next());
			c = b;
			//System.out.println(b);
			p = 1;
			while(true){
				c = b.multiply(BigInteger.valueOf(p));
				p++;
				num = c.toString();
				//System.out.println(num);
				if(num.equals("0"))
				{
					System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
					flag = 1;
					break;
				}
				a = num.toCharArray();
				flag = 0;
				// System.out.println(a);
				for(int j=0; j<num.length();j++){
					
					if(a[j] == '1')
						digit[1] = 1;
					else if(a[j] == '2')
						digit[2] = 1;
					else if(a[j] == '3')
						digit[3] = 1;
					else if(a[j] == '4')
						digit[4] = 1;
					else if(a[j] == '5')
						digit[5] = 1;
					else if(a[j] == '6')
						digit[6] = 1;
					else if(a[j] == '7')
						digit[7] = 1;
					else if(a[j] == '8')
						digit[8] = 1;
					else if(a[j] == '9')
						digit[9] = 1;
					else if(a[j] == '0')
						digit[0] = 1;
					
				 
				}
				for(int k =0;k<10;k++){
					if(digit[k] != 1)
						{	
							flag = 1;
							break;
						}
				}
				
					if(flag == 0){
						System.out.println("Case #" + (i+1) + ": " + num);
						break;
					}
			
			
			}
		
		
		}
	}
}
