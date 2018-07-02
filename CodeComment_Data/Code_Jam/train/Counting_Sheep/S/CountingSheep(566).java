package methodEmbedding.Counting_Sheep.S.LYD1235;

import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, m=0, i, sum, temp, loop, count = 0;
		int[] digits = new int[10];
		Scanner scan = new Scanner(System.in);
		
		loop = scan.nextInt();
		while(loop > 0){
			count++;
			n = scan.nextInt();
			sum=0;
			i=1;
			for(int j=0; j<10; j++){
				digits[j] = -1;
			}
			if(n==0){
				System.out.println("Case #" + count + ": INSOMNIA");
			}
			else{
				while(true){
					m=n*i;
					while(m > 0) {
						temp = m%10;
						if(temp != digits[temp]){
							digits[temp] = temp;
							sum += temp;
						}
						m = m/10;
					}
					
					if(sum == 45 && digits[0] == 0)
						break;
					i++;
				}
				System.out.println("Case #" + count + ": " + n*i);
			}
			loop--;
		}
	}

}
