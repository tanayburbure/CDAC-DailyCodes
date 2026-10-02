package wordcounter;

public class WordCounterDemo {
	public static void main(String[] args) {
		FileWordCounter f1 = new FileWordCounter("C:\\Users\\sanke\\OneDrive\\Desktop\\text\\message.txt");
		
		f1.start();
		
		System.out.println("Word Counting successfull");
	}
}
