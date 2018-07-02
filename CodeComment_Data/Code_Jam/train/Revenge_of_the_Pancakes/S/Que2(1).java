package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1035;


import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int Case = 1;Case<=t;Case++){
			String stck = sc.next();
			int move =0;
			boolean ok = false;
			if(stck.indexOf('+')==-1)
			{
				move=1;
			}else if(stck.indexOf('-')==-1)
			{
			move =0;
			}else{
				String oper = stck.substring(0, stck.lastIndexOf('-')+1);
				
				if(oper.lastIndexOf('-')==0)
			{
			char[] temp = oper.toCharArray();
			 temp[oper.lastIndexOf('-')] = '+';
			oper = String.valueOf(temp);
			move+=1;
					}
			else if(oper.indexOf('-')==oper.length()-1)
				{
				char[] temp = oper.toCharArray();
				 temp[oper.indexOf('-')] = '+';
				oper = String.valueOf(temp);
				move+=2;
						}else{
							for(int i =0;i<=oper.lastIndexOf('-');i++){
								if(oper.charAt(i)=='+')
									{
										ok=true;
									}
							}
							if(!ok){
								move=1;
								oper="+";
							}
								
						}
			//System.out.println(1+oper);
			
			while(oper.indexOf('-')!=-1){
			int k = 0;
				if(oper.indexOf('+')==0){
					char[] temp = oper.toCharArray();
					 temp[0] = '-';
					oper = String.valueOf(temp);
				while(oper.charAt(k+1)=='+')
					{
					k++;
					char[] temp1 = oper.toCharArray();
					 temp1[k] = '-';
					oper = String.valueOf(temp1);
					}
				//System.out.println(2+oper);
				char[] temp1 = oper.toCharArray();
				for(int i =0;i<temp1.length;i++){
					if(temp1[i]=='+')
						temp1[i]='-';
					else
						temp1[i]='+';
					//System.out.print(temp1[i]);
				}
				oper = String.valueOf(temp1);
				StringBuilder s = new StringBuilder(oper);
				oper = (s.reverse()).toString();
				move+=2;
				//System.out.println(3+" "+temp1.length+""+oper);
				oper = oper.substring(0, oper.lastIndexOf('-')+1);
				//System.out.println(3+" "+temp1.length+""+oper);
			}
				else{
					char[] temp1 = oper.toCharArray();
					for(int i =0;i<temp1.length;i++){
						if(temp1[i]=='+')
							temp1[i]='-';
						else
							temp1[i]='+';
						//System.out.print(temp1[i]);
					}
					oper = String.valueOf(temp1);
					StringBuilder s = new StringBuilder(oper);
					oper = (s.reverse()).toString();
					move+=1;
					//System.out.println(3+" "+temp1.length+""+oper);
					oper = oper.substring(0, oper.lastIndexOf('-')+1);
					//System.out.println(3+" "+temp1.length+""+oper);
				}
			}
			}
			
			
			System.out.println("Case #"+Case+": "+move);
		}
		

	}

}
