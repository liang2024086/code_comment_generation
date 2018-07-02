package methodEmbedding.Magic_Trick.S.LYD632;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicTrickBuster {

	public static void main(String[] args) {
		try {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			int numTestCases = Integer.parseInt(inputReader.readLine());
			for(int i = 1; i <= numTestCases; i++) {
				List<String> matchingCards = new ArrayList<String>();
				List<String> firstAttemptCardsInRow = Collections.emptyList();
				
				// First attempt
				int firstAttemptCardRow = Integer.parseInt(inputReader.readLine());
				for(int j = 1; j <= 4; j++) {
					String cardRowString = inputReader.readLine();
					if(j == firstAttemptCardRow) {
						// We got cards of our interest
						firstAttemptCardsInRow = Arrays.asList(cardRowString.split(" "));
					}
				}

				// Second attempt
				int secondAttemptCardRow = Integer.parseInt(inputReader.readLine());
				for(int j = 1; j <= 4; j++) {
					String cardRowString = inputReader.readLine();
					if(j == secondAttemptCardRow) {
						// We got cards of our interest
						String[] secondAttemptCardsInRow = cardRowString.split(" ");
						for(String card : secondAttemptCardsInRow) {
							if(firstAttemptCardsInRow.contains(card)) {
								matchingCards.add(card);
							}
						}
					}
				}

				// Recover chosen card
				if(matchingCards.size() == 1) {
					System.out.println("Case #" + i + ": " + matchingCards.get(0));
				} else if (matchingCards.size() == 0) {
					System.out.println("Case #" + i + ": Volunteer cheated!");
				} else {
					System.out.println("Case #" + i + ": Bad magician!");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
