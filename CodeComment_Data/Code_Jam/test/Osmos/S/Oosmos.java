package method_all.Osmos.S.LYD69;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Oosmos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a,n;
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		for (int k = 0; k < noOfTestCases; k++) {
			long count=0;
			a = scanner.nextLong();
			n = scanner.nextLong();
			List<Long> list = new ArrayList<Long>();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextLong());
			}
			// sort list in increasing order
			Collections.sort(list);
			long current = a;
			long tempCurrent = current;
//			long currentMin=a;
//			List<Long> additionList = new ArrayList<Long>();
			long addCount=0;
			long delCount=0;
			for (int j=0;j<list.size();j++) {
				Long newMote = list.get(j);
//				System.out.println("processing "+newMote);
				if(newMote<current) {
					current+=newMote;
//						System.out.println("current="+current);
				}else {
					// Error condition
					//new mote to be added
//					additionList.add(newMote-current+1);
					//is it worth adding?
					boolean isConsumed = false;
					long tempCount=0;
					tempCurrent = current;
					while(!isConsumed) {
						//try to consume by adding
						tempCount++;
						tempCurrent=tempCurrent+tempCurrent-1;
						if(tempCurrent==1) {
							//no point in adding
							tempCount = list.size()-j+1;
							//no point in processing further
							break;
						}
						if(newMote<tempCurrent) {
							isConsumed=true;
//								System.out.println("current="+tempCurrent);
						}
					}
					if(tempCount>(list.size()-j)) {
						//no point in adding
						delCount+=list.size()-j;
						//no point in processing further
						break;
					}else {
						addCount+=tempCount;
						current=tempCurrent+newMote;
					}
					
					
					
				}
			}
			// list sorted
			count = addCount+delCount;
			if(count > n) {
				count=n;
			}
			
			System.out.print("\nCase #"+(k+1)+": "+count);
		}
	}

}
