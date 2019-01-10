import java.util.Scanner;

public class CountVowelMethod {
	    public static Scanner keyboard;

		public static void main(String[] args) {
	        keyboard = new Scanner(System.in);
	        String repeat = "Yes";
	        while (repeat.equals("Yes") || repeat.equals("yes")) { //this while loop will keep running if the user wants to enter another sentence
	            System.out.print("Enter your words here: ");
	            String sentence = keyboard.nextLine();
	            System.out.println(countVowelsInPhrase(sentence));
            	System.out.println(" ");
                System.out.println("Would you like to enter another sentence? Please respond with either Yes or No");
                repeat = keyboard.nextLine();
		}
		}
		
		public static int countVowelsInPhrase(String word) {
			int counter = 0;
			for (int i = 0; i < word.length(); i++) {   
		        if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
		            || word.charAt(i) == 'i' || word.charAt(i) == 'o'
		            || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i)=='E'
		            || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
		        	counter++;
		        }
			}
			return counter;
		}
		        

}
