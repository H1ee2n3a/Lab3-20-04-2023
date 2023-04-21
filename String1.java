package lab3;

public class StringFunction1 {

	public static void main(String[] args) {
		String string1 = "Welcome to Java World";
		System.out.println("String : " + string1);
		
    //return char at 5th Position
		char pos = string1.charAt(4);
		System.out.println("Character at 5th position : " + pos );
		
		
    //compare string1 with "Welcome" lexicographically
		int comp = string1.compareToIgnoreCase("Welcome");
		System.out.println("Lexicographically Compared Strings are   : " + comp);	
		
		
    //Concatenate "let us learn"
		String concat = string1.concat(" Let us learn");
		System.out.println(concat);
		
    //return position of first occurrence of character 'a'
		int pos2 = string1.indexOf('a');
	  System.out.println("Position of first occurence of character 'a' is : " + pos2);
	    
    //Replace all occurrences of 'a' character with new 'e'
	    String newstring = string1.replaceAll("a", "e");
	    System.out.println("Replaced string :" + newstring );
	   
	    String substring = string1.substring(3, 11);//return string between 4th and 10th position
	    System.out.println("String between 4th and 10th position is : " + substring);
	   
	    String lowerstr = string1.toLowerCase();//lower case of string
	    System.out.println("String in lowercase : " + lowerstr);

	}

}
