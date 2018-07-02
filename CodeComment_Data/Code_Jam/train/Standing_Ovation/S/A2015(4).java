package methodEmbedding.Standing_Ovation.S.LYD1675;

import java.util.Scanner;

public class A2015 {
	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt();
	
	for(int z=1; z<=T;z++)
	{
		int S = sc.nextInt();
		int[] arr = new int[S+1];
		
		String k = sc.next();
		for(int y=0; y<=S; y++)
		{
			arr[y] = Integer.parseInt(k.substring(y,y+1));
		}
		
		int count = 0;
		
		
		for(int i=1; i<=S; i++)
		{
			int sum = 0;
			for(int j=0; j<=i-1; j++)
				sum += arr[j];
			
			if(arr[i]!=0 && i > sum)
			{
				arr[0] += (i-sum);
				count += (i-sum);
			}
			
		}
		
		System.out.println("Case #" + z + ": " + count);
	}	
	}
}

/*Case #1: 1
Case #2: 1
Case #3: 0
Case #4: 0
Case #5: 0
Case #6: 3
Case #7: 0
Case #8: 2
Case #9: 0
Case #10: 0
Case #11: 0
Case #12: 5
Case #13: 1
Case #14: 0
Case #15: 0
Case #16: 5
Case #17: 0
Case #18: 0
Case #19: 0
Case #20: 0
Case #21: 0
Case #22: 1
Case #23: 0
Case #24: 1
Case #25: 0
Case #26: 0
Case #27: 0
Case #28: 3
Case #29: 1
Case #30: 0
Case #31: 2
Case #32: 1
Case #33: 0
Case #34: 5
Case #35: 0
Case #36: 0
Case #37: 0
Case #38: 0
Case #39: 3
Case #40: 0
Case #41: 5
Case #42: 0
Case #43: 0
Case #44: 1
Case #45: 0
Case #46: 0
Case #47: 2
Case #48: 0
Case #49: 0
Case #50: 0
Case #51: 0
Case #52: 6
Case #53: 0
Case #54: 0
Case #55: 0
Case #56: 0
Case #57: 0
Case #58: 2
Case #59: 1
Case #60: 0
Case #61: 6
Case #62: 0
Case #63: 0
Case #64: 2
Case #65: 6
Case #66: 0
Case #67: 2
Case #68: 0
Case #69: 6
Case #70: 0
Case #71: 1
Case #72: 0
Case #73: 0
Case #74: 0
Case #75: 0
Case #76: 0
Case #77: 0
Case #78: 6
Case #79: 1
Case #80: 4
Case #81: 0
Case #82: 0
Case #83: 3
Case #84: 4
Case #85: 1
Case #86: 0
Case #87: 5
Case #88: 0
Case #89: 0
Case #90: 0
Case #91: 2
Case #92: 0
Case #93: 1
Case #94: 0
Case #95: 0
Case #96: 1
Case #97: 0
Case #98: 0
Case #99: 0
Case #100: 2*/
