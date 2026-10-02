package cypher;
import java.io.*;


public class CaeserCipher {
	public static String encrypt(String plainFile,int displacement) {
		StringBuilder result = new StringBuilder();
		
		for(char ch : plainFile.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				char encryptedChar = (char) ((ch - 'A' + displacement) % 26 + 'A');
				result.append(encryptedChar);
			}else if(Character.isLowerCase(ch)){
				char encryptedChar = (char) ((ch - 'a' + displacement) % 26 + 'a');
				result.append(encryptedChar);
			}else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static String decrypt(String text , int displacement) {
		return encrypt(text, 26 - (displacement % 26));
	}
	
	public static void encryptFile(String inputFile,String outputFile,int displacement) throws IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			String line;
			while((line = reader.readLine()) != null) {
				writer.write(encrypt(line,displacement));
				writer.newLine();
			}
		}
	}
	
	public static void decryptFile(String inputFile,String outputFile,int displacement) throws IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
				String line;
				while((line = reader.readLine()) != null) {
					writer.write(decrypt(line,displacement));
					writer.newLine();
				}
			}
	}
}
