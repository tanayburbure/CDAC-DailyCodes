package wordthread;

import java.io.*;

public class ThreadOne  extends Thread {
	public void CountWords() {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sanke\\OneDrive\\Desktop\\text\\Plain.txt"));
			String line;
			while((line = br.readLine()) != null) {
				String tline = line.trim();
				if(!tline.isEmpty()) {
					String words[] = tline.split("\\s+");
					count += words.length;
				}
			}
			System.out.println("Total words in the first file : "+count);	
			br.close();
		}
		catch(Exception e) {
			System.out.println("Error "+e);
		}
	}
	@Override
	public void run() {
		CountWords();
	}
}
