package passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Button symbolsButton = new Button(false, null);
		//	Button numbersButton = new Button(false, null);
		Random r = new Random();
		char generateChar = (char)(r.nextInt(26) + 'a');
			System.out.println("Generate a Password" + generateChar);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Symbols?");
			String includeSymbols = scan.nextLine();
			
			System.out.println("Numbers?");
			String includeNumbers = scan.nextLine();
			
			System.out.println("Length?");
			int pwdLength = scan.nextInt();
			
			System.out.println((passwordGenerator(includeSymbols, includeNumbers, pwdLength)));
		}
		
		
		public static StringBuilder passwordGenerator (String symbols, String numbers, int length) {
			
			char [] passwordGen = {};
			StringBuilder generatePwd = new StringBuilder();
			
			Random r = new Random();
			char generateChar = (char)(r.nextInt(26) + 'a');
			
			if (!symbols.equals("yes") && !numbers.equals("yes")) {
				
				for (int i = 0; i < length-1; i++) {
					passwordGen[i] = generateChar;
				}
			}
			
			return generatePwd.append(passwordGen);
			
		}
	}


