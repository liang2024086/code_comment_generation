package methodEmbedding.Magic_Trick.S.LYD1970;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {

		String fileInPath = "/Users/Kell3el2oS/Desktop/smallInputMagicianCodeJam.in";
		String fileOutPath = "/Users/Kell3el2oS/Desktop/smallInputMagicianCodeJam.out";

		try {
			
			StringBuffer allResult = new StringBuffer();

			FileUtil fileUtil = new FileUtil();

			List<String> inputList = fileUtil.fileReader(fileInPath);

			int inputSize = Integer.parseInt(inputList.get(0));

			List<QuestionObject> questionObjectList = new ArrayList<QuestionObject>();

			int lineIndex = 1;

			for (int inputNumber = 1; inputNumber <= inputSize; inputNumber++) {

				Map<String, List<String>> firstShuffleMap = null;

				Map<String, List<String>> secondShuffleMap = null;

				QuestionObject questionObject = new QuestionObject();

				for (int i = 0; i < 10; i++) {

					if (i == 0) {
						questionObject.setFirstAnswer(inputList.get(lineIndex));
					} else if (i == 5) {
						questionObject
								.setSecondAnswer(inputList.get(lineIndex));
					} else if (i >= 1 && i <= 4) {
						if (null == firstShuffleMap) {
							firstShuffleMap = new TreeMap<String, List<String>>();
						}

						String str[] = inputList.get(lineIndex).split(" ");

						firstShuffleMap.put(String.valueOf(i),
								Arrays.asList(str));

						if (i == 4) {
							questionObject.setFirstShuffleMap(firstShuffleMap);
							firstShuffleMap = null;
						}

					} else if (i >= 6 && i <= 9) {

						if (null == secondShuffleMap) {
							secondShuffleMap = new TreeMap<String, List<String>>();
						}

						String str[] = inputList.get(lineIndex).split(" ");

						secondShuffleMap.put(String.valueOf(i - 5),
								Arrays.asList(str));

						if (i == 9) {
							questionObject
									.setSecondShuffleMap(secondShuffleMap);
							secondShuffleMap = null;
						}
					}

					lineIndex++;
				}
				
				questionObject.setQuestionNumber(String.valueOf(inputNumber));

				questionObjectList.add(questionObject);
			}

//			System.out.println(questionObjectList);

			for (QuestionObject questionObject : questionObjectList) {

				String result = "";

				List<String> firstTemp = questionObject.getFirstShuffleMap().get(questionObject.getFirstAnswer());
				List<String> secondTemp = questionObject.getSecondShuffleMap().get(questionObject.getSecondAnswer());
				
//				System.out.println(firstTemp);
//				System.out.println(secondTemp);

				boolean isHasResult = false;

				for (String str1 : firstTemp) {
					for (String str2 : secondTemp) {
						if (str1.equals(str2)) {
							if (!isHasResult) {
								result = str1;
								isHasResult = true;
							} else {
								result = "Bad magician!";
							}
						}
					}
				}

				if (!isHasResult) {
					result = "Volunteer cheated!";
				}
				
				allResult.append("Case #" + questionObject.getQuestionNumber() + ": "+ result + "\n");

				System.out.println("Case #" + questionObject.getQuestionNumber() + ": "+ result);

			}
			
			fileUtil.fileWriter(fileOutPath, allResult.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
