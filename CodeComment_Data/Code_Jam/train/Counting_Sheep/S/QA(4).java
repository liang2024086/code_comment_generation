package methodEmbedding.Counting_Sheep.S.LYD1403;


import java.util.Scanner;

public class QA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums;
		int num;
		boolean ans = false;
		for(int j=1;j<=n;j++){
			nums =new int[] {0,0,0,0,0,0,0,0,0,0};
			ans = false;
			num = in.nextInt();
			int index = 1;
			int tmp = num;
			while(!ans && index <= 100){
				tmp = num * (index++);
				while(tmp > 0){ //????????????????????????????????????
					nums[tmp%10]++;
					tmp = tmp/10;
				}
				for(int i=0;i<10;i++){//???????????????????????????
					if(nums[i]==0) break;
					else if(i==9) {
						System.out.println("Case #"+j+": "+num*(index-1));
						ans = true;
					}
				}
			}
			if(!ans){//????????????
				System.out.println("Case #"+j+": INSOMNIA");
			}
			
		}
	}

}
