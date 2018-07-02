package methodEmbedding.Cookie_Clicker_Alpha.S.LYD267;

/*
 * Copyright ?? $year Elastic Path Software Inc. All rights reserved.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

/**
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println(new BigDecimal(2).add(new BigDecimal("3.14159")));
		File output = new File("output");
		try (
				PrintWriter writer = new PrintWriter(new FileWriter(output));
				BufferedReader reader = new BufferedReader(new InputStreamReader(Main3.class.getClassLoader().getResourceAsStream("sample")))) {

			String line = reader.readLine();
			int problems = Integer.parseInt(line);
			for (int problem = 0; problem < problems; problem++) {
				BigDecimal timeSoFar = BigDecimal.ZERO;
				BigDecimal currentCookieRate = new BigDecimal(2);
				ImmutableList <String> inputs = ImmutableList.copyOf(Splitter.on(" ").split(reader.readLine()));
				BigDecimal cookieCost = new BigDecimal(inputs.get(0));
				BigDecimal cookieRatePerAdditionalCookie = new BigDecimal(inputs.get(1));
				BigDecimal goal = new BigDecimal(inputs.get(2));

				while (true) {
					BigDecimal timeToEndWithoutBuyingCookie = goal.divide(currentCookieRate, MathContext.DECIMAL128);

					BigDecimal newRate = currentCookieRate.add(cookieRatePerAdditionalCookie);
					BigDecimal timeToEndWithBuyingCookie = cookieCost.divide(currentCookieRate, MathContext.DECIMAL128).add(goal.divide(newRate, MathContext.DECIMAL128));

					boolean buyCookie = timeToEndWithoutBuyingCookie.compareTo(timeToEndWithBuyingCookie) >= 0;
					if (buyCookie) {
						timeSoFar = timeSoFar.add(cookieCost.divide(currentCookieRate, MathContext.DECIMAL128));
						currentCookieRate = currentCookieRate.add(cookieRatePerAdditionalCookie);
					} else {
						timeSoFar = timeSoFar.add(timeToEndWithoutBuyingCookie);
						break;
					}
				}

				String answer = String.valueOf(timeSoFar.setScale(7, RoundingMode.HALF_EVEN));
				writer.print(String.format("Case #%d: ", problem + 1));
				writer.println(answer);
			}

		}
	}
}
