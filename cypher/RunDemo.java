package cypher;

import java.io.*;

public class RunDemo {
	public static void main(String[] args) {
		int displacement = 3;
		
		String plainFile = "C:\\Users\\sanke\\OneDrive\\Desktop\\text/Plain.txt";
		String encFile = "C:\\Users\\sanke\\OneDrive\\Desktop\\text/enc_mssage.txt";
		String decFile = "C:\\Users\\sanke\\OneDrive\\Desktop\\text/dec_message.txt";
		
		try {
			CaeserCipher.encryptFile(plainFile,encFile,displacement);
			System.out.println("Encryption Complete");
			
			CaeserCipher.decryptFile(encFile, decFile, displacement);
			System.out.println("Decryption Complete");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
