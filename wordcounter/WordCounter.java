package wordcounter;
import java.io.*;

public class WordCounter {
	public static int countword(String filename) throws Exception{
		
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line;
		
		while((line = br.readLine()) != null) {
			String[] words = line.trim().split("\\s+");
			
			if(! line.trim().isEmpty()) {
				count += words.length ;
			}
 		}
		br.close();
		
		return count;
	}
}
