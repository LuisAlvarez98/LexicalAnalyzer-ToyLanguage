package Scanner;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner();
		ArrayList<Token> tokens;
		
		str = "MOV 2354 #A ;";
		
		tokens = scanner.scan(str);
		for(Token token: tokens) {
			System.out.println(token.tokenToString());
		}
	}
	
}
