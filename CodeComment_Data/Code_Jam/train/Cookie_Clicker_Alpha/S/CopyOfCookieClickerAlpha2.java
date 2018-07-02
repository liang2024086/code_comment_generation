package methodEmbedding.Cookie_Clicker_Alpha.S.LYD507;


import java.math.BigDecimal;
import java.text.NumberFormat;

import com.kunlong.util.FileUtil;

public class CopyOfCookieClickerAlpha2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileUtil fuRead = new FileUtil(".//data//B-small-attempt1.in","r");
		FileUtil fuWrite = new FileUtil(".//data//B-small-attempt1.out","w");
		int T = Integer.parseInt(fuRead.getNextLine());
		for(int i=0;i<T;i++){
			String line[] = fuRead.getNextLine().split(" ");
			BigDecimal  C = new BigDecimal(line[0]);
			BigDecimal  F = new BigDecimal(line[1]);
			BigDecimal  X = new BigDecimal(line[2]);
			BigDecimal  min = X.divide(new BigDecimal("2"));
			//System.out.println("?????????min????????????"+min);
			int farmNum = 1;
			while(true){
				BigDecimal totalSecondTemp = new BigDecimal("0");
				//double totalCookies = 0.0;
				BigDecimal cookiesPerSecond = new BigDecimal("2.0");
				for(int k=0;k<farmNum;k++){
					totalSecondTemp = totalSecondTemp.add(C.divide(cookiesPerSecond,7,BigDecimal.ROUND_HALF_EVEN));
					if(i==98)
					System.out.println("C/cookiesPerSecond:"+C.divide(cookiesPerSecond,7,BigDecimal.ROUND_HALF_EVEN));
					cookiesPerSecond = cookiesPerSecond.add(F);
					if(i==98)
					System.out.println("cookiesPerSecond:"+cookiesPerSecond);
				}
				totalSecondTemp = totalSecondTemp.add(X.divide(cookiesPerSecond,7,BigDecimal.ROUND_HALF_EVEN));
				if(i==98)
					System.out.println("i:"+i+" totalSecondTemp:"+totalSecondTemp+" farmNum:"+farmNum);
				
				if(totalSecondTemp.compareTo(min)==-1){
					min = totalSecondTemp;
				}else{
					break;
				}
				//if(cookiesPerSecond>X)break;
				farmNum++;
			}
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMinimumFractionDigits(7);
			fuWrite.saveNextToFile("Case #"+(i+1)+": "+nf.format(min)+"\n");
/*			if(i==1)
				System.exit(0);*/
		}
		fuRead.close();
		fuWrite.close();
	}

}
