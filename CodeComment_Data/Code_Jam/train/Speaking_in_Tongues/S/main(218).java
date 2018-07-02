package methodEmbedding.Speaking_in_Tongues.S.LYD1677;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String filename = "C:\\input.txt";
		String outputname="C:\\output.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputname));
			String line = br.readLine();
			int n = Integer.valueOf(line);
			for(int i=0;i<n;i++)
			{
				line = br.readLine();
				String[] values = line.split(" ");
				BigInteger g = new BigInteger(values[0]);
				BigInteger w = new BigInteger(values[1]);
				BigInteger m = new BigInteger(values[2]);
				BigInteger maxDamage = BigInteger.ZERO;
				BigInteger maxShield = BigInteger.ZERO;
				BigInteger basis = m.divide(g.multiply(BigInteger.valueOf(2)));
				BigInteger ulimit = basis.add(BigInteger.valueOf(100000));
				for(BigInteger j=basis.subtract(BigInteger.valueOf(100000));
				j.compareTo(ulimit)<=0; j=j.add(BigInteger.ONE))
				{
					BigInteger shield = j;
					BigInteger warrior = m.subtract(j.multiply(g)).divide(w);
					BigInteger damage = warrior.multiply(shield);
					if(damage.compareTo(maxDamage)>0)
					{
						maxDamage = damage;
						maxShield = shield;
					}
				}
				bw.write(maxShield.toString()+"\n");
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
