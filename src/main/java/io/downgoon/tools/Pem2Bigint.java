package io.downgoon.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.Key;

import com.github.downgoon.jresty.commons.security.RsaKeyIO;

public class Pem2Bigint {

	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("Usage: Pem2Bigint <path-to-file.pem>");
			System.out.println("Attachment: How to generate key pairs ? ");
			System.out.println("generate prikey > openssl genrsa -out prikey.pem 1024");
			System.out.println("  export pukkey > openssl rsa -in prikey.pem -pubout -out pubkey.pem");
			System.exit(400);
		}
		
		File pemFile = new File(args[0]);
		boolean isPri = isPrivateKey(pemFile);
		
		Key key = null;
		if (isPri) {
			key = RsaKeyIO.importPrivateFrPem(pemFile);
		} else {
			key = RsaKeyIO.importPublicFrPem(pemFile);
		}
		
		System.out.println(key);
		
	}

	private static boolean isPrivateKey(File pemFile) throws Exception {
		String content = readFileContent(pemFile);
		return content.indexOf("PRIVATE KEY") != -1;
	}
	
	private static String readFileContent(File file) throws Exception {
		StringBuffer content = new StringBuffer();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while (line != null) {
				content.append(line);
				content.append("\n");
				line = reader.readLine();
			}
			return content.toString();
			
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		
	}
	
}
