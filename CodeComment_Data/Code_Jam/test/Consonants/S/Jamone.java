package method_all.Consonants.S.LYD36;

import java.util.*;
public class Jamone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++){
			String name=sc.next();
			int n=sc.nextInt();
			long ans=0;
			int l=name.length();
			int begin=0;
			int end=-1;
			int count=0;
			
			a:while(end<l-1) {
				while(count<n) {
					if(end==l-1) {
						break a;
					}
					else {
						end++;
						if(!(name.charAt(end)=='a' || name.charAt(end)=='i' || name.charAt(end)=='u' ||name.charAt(end)=='e' ||name.charAt(end)=='o')) {
							count++;
						}
						else {
							count=0;
						}
						
					}
				}
				//including end-n+1 to end is ok
				count=n-1;
				ans+=((long)(end-n-begin+2)*(long)(l-end));
				begin=end-n+2;
			}
			
			System.out.println("Case #"+(i+1)+": "+ans);
			
		}
	}

}
