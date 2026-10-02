package uniquewords;

import java.io.*;
import java.util.*;

public class UniqueWords {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> wordCount = new LinkedHashMap<>();

		BufferedReader reader = new BufferedReader(new FileReader("C:/Users/sanke/OneDrive/Desktop/text/message.txt"));
		String line;

		while ((line = reader.readLine()) != null) {
			String[] words = line.toLowerCase().split("\\s+");
			for (String word : words) {
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
		reader.close();

		System.out.println("Unique Words in the file are : ");
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) == 1) {  
				System.out.println(word);
			}
		}
	}
}