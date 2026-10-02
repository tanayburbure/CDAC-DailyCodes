package wordcounter;

public class FileWordCounter extends Thread {

	private String filename;
	
	FileWordCounter(String filename){
		this.filename = filename;
	}
	
	public void run() {
		try {
			int count = WordCounter.countword(filename);
			System.out.println(filename+" : "+count + " words");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
